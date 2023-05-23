package Colecciones.Ejercicio4;
import java.util.*;
import java.util.Random;
import java.util.stream.Collectors;

public class Ejercicio04 {
    //Implementar una aplicación donde se insertan 100 números enteros aleatorios
    //entre 1 y 10 incluidos, que pueden estar repetidos, en una colección. Después
    //se eliminan todos los elementos que valen 5. Mostrar la colección antes y
    //después de la eliminación. Utiliza un iterador.
    public static void main(String[] args) {
        Random  random= new Random();
        List<Integer> numerosAleatorios = random.ints(100,1,10).boxed().collect(Collectors.toList());
        numerosAleatorios.forEach(n-> System.out.print(n+ " "));

        Iterator<Integer>iterator=numerosAleatorios.iterator();
        while (iterator.hasNext()){
            Integer numero=iterator.next();
            if (numero==5){
                iterator.remove();
            }
        }
        System.out.println();
        numerosAleatorios.forEach(n-> System.out.print(n+" "));
    }
}
