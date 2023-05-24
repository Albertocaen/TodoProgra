package Stream.Ejercicio5;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

public class Ejercicio5 {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer> listaNumerosEnteros=random.ints(40,-20,21).boxed().toList();
        listaNumerosEnteros.forEach(numeros-> System.out.print(numeros+" "));
        System.out.println("////////////////////////////////////////////////");

        Set<Integer> listaNumerosSinRepetir=new HashSet<>(listaNumerosEnteros);
        listaNumerosSinRepetir.stream().filter(numero->numero>0).toList().forEach(numero-> System.out.print(numero+" "));
        System.out.println("////////");

        Set<Integer>listaNumerosNegativo=new HashSet<>(listaNumerosEnteros);
        List<Integer> integers = listaNumerosNegativo.stream().filter(numero -> numero < 0).toList();
        integers.forEach(System.out::println);
        System.out.println("////////////////////////");


        long medida=listaNumerosSinRepetir.stream().filter(numero->numero>0).mapToInt(numero->numero).distinct().count();
        System.out.println(medida);

        long medidaNegativo=listaNumerosNegativo.stream().filter(numero->numero<0).mapToInt(numero->numero).distinct().count();
        System.out.println(medidaNegativo);

        long numerosEntre=listaNumerosEnteros.stream().filter(numero->numero>=-10&&numero<=10).distinct().count();
        System.out.println(numerosEntre);
    }
}
