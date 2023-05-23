package Ficheros.Ejercicio7;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio7 {
    //Escribir un programa que lea texto por teclado y lo escriba en un fichero llamado
    //datos.txt. El proceso consiste en leer una línea de texto por teclado y escribirla en el
    //fichero. Este proceso se repite hasta que se introduce por teclado la cadena FIN (da
    //igual que sea en mayúsculas o minúsculas). La cadena FIN que indica el final de lectura
    //no se debe escribir en el fichero.
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        try(BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter("src/Ficheros/Ejercicio7/datos.txt"))){
            while (true){
                System.out.println("Ingrese texto que va a ir al archivo");
                String texto= sc.nextLine();
                if (texto.equalsIgnoreCase("FIN")){
                    break;
                }
                bufferedWriter.write(texto);
                bufferedWriter.newLine();
            }
            bufferedWriter.close();
            System.out.println("Texto añadito al archivo");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
