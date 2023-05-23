package Ficheros.Ejercicio4;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio4 {
    //Crear un programa que borre el fichero cuya ruta ha sido introducida por el usuario.
    public static void main(String[] args) throws IOException {
        Scanner sc=new Scanner(System.in);
         String nombreArchivo= sc.nextLine();
        File file =new File(nombreArchivo);
        if (file.exists()){
            file.delete();
            System.out.println("Fichero Eliminado");
            sc.close();
        }else {
            file.createNewFile();
            sc.close();
        }
    }
}
