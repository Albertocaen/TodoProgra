package Stream.Ejercicio3;

import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio3 {
    public static void main(String[] args) {
        //a) Muestra todos los animales que comiencen por una letra introducida por
        //teclado.
        //b) Muestra el animal que tenga el nombre más largo, y el que tenga el nombre
        //más corto
        //c) Muestra el número de animales que contiene la lista.
        Scanner scanner=new Scanner(System.in);
        String animales="Abadejo, Abejaruco, Abeja, Abejorro, Águila, Alacrán, Antílope, Babuino, Bacalao,\n" +
                "Ballena, Barracuda, Bisonte, Búho, Caballo, Cebra, Chimpancé, Ciervo, Conejo, Cotorra,\n" +
                "Coyote, Delfín, Dromedario, Elefante, Erizo, Foca, Gacela, Golondrina, Guepardo,\n" +
                "Halcón, Hiena, Hormiga, Hurón, Iguana, Jabalí, Jirafa, Kiwi, Koala, Lagarto, Lince, Lobo,\n" +
                "Mapache, Medusa, Mosca, Murciélago, Nutria, Ñu, Oso, Oveja, Paloma, Pantera,\n" +
                "Perezoso, Reno, Ruiseñor, Salamandra, Sapo, Serpiente, Tiburón, Tigre, Tortuga,\n" +
                "Urraca, Vaca, Yak, Zorro.";
        //de divide de la misma manera para agregar
        String [] elementos=animales.split(",");
        for (int i = 0; i <elementos.length ; i++) {
            elementos[i]=elementos[i].trim();
        }
        List<String> animalesLista=new ArrayList<>();
        for (String elemento:elementos
             ) {
            animalesLista.add(elemento);
        }
        System.out.println("Letra para sacar animal");
        String letraParaAnimal=scanner.nextLine().toUpperCase();

//para sacar los animales que se meten con las letras del scanner
        animalesLista.stream()
                .filter(animals->animals.startsWith(letraParaAnimal))
                .forEach(s -> System.out.println(s));

//se usa para sacar el elemento con menos letras
       String animalMasLargo= animalesLista.stream().
               max(Comparator.comparing(String::length)).
               orElse("");
// se usa para sacar el nombre con menos letras
        String animalMasCorto=animalesLista.stream()
                .min(Comparator.comparing(String::length))
                .orElse("");

        System.out.println("Sacamos los nombres mas largos y cortos");
        System.out.println(animalMasLargo);
        System.out.println(animalMasCorto);
        long contar=animalesLista.stream().map(animals->animals).count();
        System.out.println(contar);
    }
    }
