package Ficheros.Ejercicio5;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

class Ejercicio5{
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("src/UT10/dataset_91007.txt"))){

            String numeros ="";
            String linea = "";
            while (linea!= null){
                linea = reader.readLine();
                if (linea!= null){
                    numeros = linea;
                }
            }

            int max = Arrays.stream(numeros.split(" ")).mapToInt(n -> Integer.parseInt(n)).max().getAsInt();

            System.out.println("Maximo " + max);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
