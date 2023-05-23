package Ficheros.Ejercicio9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio9 {
    //Escribir un programa que busque una palabra o un fragmento en un fichero de texto. El
    //programa pedirá que se introduzca una palabra o un texto por teclado y realizará su
    //búsqueda por el archivo. Se mostrará por pantalla el número de línea y el contenido de
    //la línea del fichero que contiene la cadena buscada. Si la cadena buscada aparece en
    //varias líneas se mostrarán todas ellas. Si el fichero no contiene el texto buscado se
    //mostrará un mensaje indicándolo.
    public static void main(String[] args) {
        System.out.print("Introduce la palabra a buscar: ");
        Scanner scanner = new Scanner(System.in);
        String palabra = scanner.nextLine();
        scanner.close();
        try(BufferedReader br=new BufferedReader(new FileReader("src/Ficheros/Ejercicio9/quijote.txt"))){
            String linea;
            int numLinea=0;
            boolean encontrada=false;
            while ((linea=br.readLine())!=null){
                if (linea.contains(palabra)){
                    encontrada=true;
                    System.out.println("Linea " +numLinea+ ": "+linea);
                }
                numLinea++;
            }
            if (!encontrada) System.out.println("La palabra no se encontro");
        }catch (IOException e){
            System.err.println("Errir: "+e.getMessage());
        }
    }
}
