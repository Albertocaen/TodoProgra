package Colecciones.Ejercicio6;

import java.util.ArrayList;
import java.util.List;

import java.util.Scanner;
import java.util.stream.IntStream;

public class Ejercicio06 {
    public static void main(String[] args) {
//Crear una lista de números enteros positivos introducidos por consola hasta
//que se introduzca uno negativo. A continuación, recorrer la lista y mostrar por
//pantalla los índices de los elementos de valor par, que será multiplicado por
//100.
        Scanner sc= new Scanner(System.in);
        List<Integer> entero =new ArrayList<>();
        int numero= 0;
        do {
            System.out.println("Numeros: ");
            numero = sc.nextInt();
            if (numero>=0){
                entero.add(numero);
            }
        }while (numero >=0);
        entero.forEach(n-> System.out.println(n));
        for (int i = 0; i <entero.size() ; i++) {
            if (entero.get(i)%2==0){
                System.out.print(entero.get(i)*100+" ");
            }
        }
    }
}
