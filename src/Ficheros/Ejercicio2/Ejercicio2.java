package Ficheros.Ejercicio2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {
    public static void main(String[] args) {
        String line;
        try(BufferedReader br=new BufferedReader(new FileReader("src/Ficheros/Ejercicio2/restaurante.csv"))){
            while ((line= br.readLine())!=null){
                if (line.contains(",6")){
                    System.out.println(line);
                }
            }
        }catch (IOException e) {
            e.printStackTrace();
        }
    }
}


