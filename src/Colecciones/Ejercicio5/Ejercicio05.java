package Colecciones.Ejercicio5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Ejercicio05 {
    //Implementa una aplicación donde se piden por consola números reales hasta
    //que se introduce un 0. A medida que se leen del teclado, los valores positivos se
    //insertan en una colección y los negativos en otra. Al final, se muestran ambas
    //colecciones y las sumas de los elementos de cada una de ellas. Por último, se
    //eliminan de ambas todos los valores que sean mayores que 10 o menores de -
    //10 y se vuelven a mostrar.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        List<Double> positivos=new ArrayList<>();
        List<Double> negativos=new ArrayList<>();
        double numero=0;
        do {
            System.out.println("Numero: ");
            numero=sc.nextDouble();
            if (numero !=0) {
                if (numero >0){
                positivos.add(numero);
                } else {
                negativos.add(numero);
                }
            }
        }while (numero!=0);
        System.out.println("Numeros Positivos: ");
        positivos.forEach(n-> System.out.print(n+" "));
        double sumP=positivos.stream().reduce(0.0,(a,b)->a+b );
        System.out.println("Suma de los positivo= "+sumP);

        System.out.println();
        System.out.println("Numeros Negativos: ");
        negativos.forEach(n-> System.out.print(n+" "));
        double sumI=negativos.stream().reduce(0.0,(a,b)->a+b);
        System.out.println("Suma de los Negativos= "+sumI);

        positivos.removeIf(n->n>10);
        System.out.println();
        positivos.forEach(n-> System.out.println(n+" "));
        negativos.removeIf(n -> n < -10);
        positivos.forEach(n-> System.out.println(n+" "));
    }
}
