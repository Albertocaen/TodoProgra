package Stream.Ejercicio1;

import java.util.*;

public class Ejercicio1 {
    public static void main(String[] args) {
        //1. Crea una lista de enteros con 20 elementos aleatorios entre 1 y 15. Utilizando
        //streams, haz lo siguiente:
        //a. Imprime todos los elementos de la lista, sin ordenar.
        //b. Imprime todos los elementos de la lista, ordenados.
        //c. Imprime todos los elementos de la lista, sin repetir, ordenados.
        //d. Imprime sólo los mayores o iguales a 5.
        //e. Imprime sólo los mayores o iguales a 5, ordenados.
        //f. Imprime sólo los mayuores o iguales a 5, ordenados inversamente.
        //g. Suma todos los elementos de la lista.
        //h. Suma todos los elementos mayores o iguales a 5.
        //i. Calcula el promedio de todos los elementos de la lista.
        Random random=new Random();
        List<Integer> enteros=random.ints(20,1,15).boxed().toList();
        enteros.forEach(num-> System.out.println(num));
         enteros.stream()
                 .sorted().
                 forEach(num-> System.out.println(num));
        System.out.println("///////////////////////////////////////");

        Set<Integer> enteros1=new HashSet<>(enteros);
         enteros1.stream()
                 .sorted()
                 .forEach(num-> System.out.println(num));

        System.out.println("////////////////////////////////////");

         enteros.stream()
                 .filter(num->num>=5)
                 .forEach(num-> System.out.println(num));

        System.out.println("///////////////////////////////////");
        enteros.stream()
                .filter(num->num>=5)
                .sorted()
                .forEach(num-> System.out.println(num));
        System.out.println("///////////////////////////////////////");
        enteros.stream()
                .filter(num->num>=5)
                .sorted((num1,num2)->num2-num1)
                .forEach(num-> System.out.println(num));
        System.out.println("///////////////////////////////////////");
        //usar una variable para meter la suma
       int sum= enteros.stream()
                .mapToInt(Integer::intValue).sum();
        System.out.println(sum);
        System.out.println("//////////////////////////////////////////////");
        int sum1=enteros.stream()
                .filter(num->num>=5)
                .mapToInt(Integer::intValue)
                .sum();
        System.out.println(sum1);
        System.out.println("/////////////////////////////////////////////");
        double sum3=enteros.stream().mapToInt(Integer::intValue).average().getAsDouble();
        System.out.println(sum3);

    }
}
