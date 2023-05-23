package Ficheros.Ejercicio1;

import java.io.File;
import java.util.Scanner;

public class Ejercicio1 {
    //Escribir un programa en Java que, para una ruta indicada por el usuario (metida por
    //teclado), muestre:
    //• Si el fichero existe o no
    //• Si se trata de un directorio o de un fichero
    //• En caso de ser un fichero, debe mostrar su nombre, su tamaño y si tiene
    //permisos de lectura, escritura y/o ejecución

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Introduce la ruta del archivo o directorio");
        String ruta=sc.nextLine();
        //cerrar el scanner despues de usarlo
        sc.close();
        File archivo= new File(ruta);

        //comprobar si el fichero existe
        if(archivo.exists()){
            System.out.println("El archivo o directorio Existe");

            //comprobamos si es un directorio
            if (archivo.isDirectory()){
                System.out.println("Es un directorio");
            }else
                System.out.println("Es un archivo.\n" +
                        "Nombre: "+archivo.getName()+"\n" +
                        "Tamaño: "+archivo.length()+"Bytes \n" +
                        "Permisos: \n" +
                        "Lectura: "+archivo.canRead()+"\n" +
                        "Escritura: "+archivo.canWrite()+"\n" +
                        "Ejecucion: "+archivo.canExecute());

        }else {
            System.out.println("No existe");
        }
    }
}
