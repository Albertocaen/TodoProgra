package Ficheros.Ejercicio3;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter("src/Ficheros/Ejercicio3/nombres.csv", true));

            while (true) {
                System.out.println("Ingrese un nombre para añadir al archivo (o 'salir' para terminar):");
                String nombre = scanner.nextLine();

                if (nombre.equalsIgnoreCase("salir")) {
                    break;
                }

                System.out.println("Ingrese el primer apellido:");
                String apellido1 = scanner.nextLine();

                System.out.println("Ingrese el segundo apellido:");
                String apellido2 = scanner.nextLine();

                // Formato: Nombre|Apellido1|Apellido2
                bufferedWriter.write("\n"+nombre + "|" + apellido1 + "|" + apellido2);
                bufferedWriter.newLine();
            }

            bufferedWriter.close();
            System.out.println("Nombres añadidos al archivo.");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

