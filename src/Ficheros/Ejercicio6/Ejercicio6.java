package Ficheros.Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class Ejercicio6 {
    //6. Escribir un programa que lea el contenido del fichero br.txt y muestre la información
    //que almacena, de forma que muestre en lineas diferentes los fragmentos separados por
    //un asterisco.
    public static void main(String[] args) {
        try(BufferedReader rd=new BufferedReader(new FileReader("src/Ficheros/Ejercicio6/br.txt"))){
        String linea;
        while ((linea= rd.readLine())!=null){
            String[] fragmentos= linea.split("\\*");
            for (String fragmento : fragmentos) {
                System.out.println(fragmento);
            }
        }
}   catch (IOException e){
            e.printStackTrace();
        }
    }
}

