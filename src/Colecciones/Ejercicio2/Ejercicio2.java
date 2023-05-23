package Colecciones.Ejercicio2;


import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio2 {
    //Implementar una aplicación que pida por consola números enteros no
    //negativos hasta que se introduce -1. Los números se irán insertando en una
    //colección, pudiéndose repetir. Al terminar, se mostrará la colección por pantalla.
    //A continuación, se mostrarán todos los valores pares. Por último, se eliminarán
    //todos los múltiplos de 3 y se mostrará por pantalla la colección resultante.
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int numero=0;
        ArrayList<Integer> numeros= new ArrayList<>();
        do {
            System.out.println("Numero: ");
            numero= sc.nextInt();
            if (numero !=-1){
                numeros.add(numero);
            }
        }while (numero !=-1);

        numeros.forEach(n-> System.out.print(n+" "));
        System.out.println();
        numeros.stream().filter(n->n%2==0).forEach(n-> System.out.print(n+" "));

        numeros.stream().filter(n-> n%3==0);
        System.out.println();
        numeros.forEach(n-> System.out.print(n+" "));
    }
}
