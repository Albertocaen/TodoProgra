package FAKE;

import java.io.*;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio1 {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        File file = new File("src/FAKE/Ejercicio1/");
        try (FileWriter fw = new FileWriter(file, true); BufferedWriter bw = new BufferedWriter(fw)) {
            if (!file.exists()) {
                file.createNewFile();
            }else System.out.println("Ya esta creado");
            String respuesta;
            do {
                System.out.println("¿Quieres ingresar un coche? S/N");
                respuesta = scanner.nextLine().toUpperCase();
                if (respuesta.equals("S")) {
                    System.out.println("Nombre de Coche: ");
                    String nombre = scanner.nextLine();
                    System.out.println("Matrícula: ");
                    String matricula = scanner.nextLine();
                    boolean esEntero = false;
                    int año = 0;
                    while (!esEntero) {
                        try {
                            System.out.println("Introduce año de compra");
                            año = Integer.parseInt(scanner.nextLine());
                            esEntero = true;
                        } catch (NumberFormatException ex) {
                            System.out.println("Solo se pueden introducir números");
                        }
                    }
                    esEntero = false;
                    int puertas = 0;
                    while (!esEntero) {
                        try {
                            System.out.println("Introduce número de Puertas");
                            puertas = Integer.parseInt(scanner.nextLine());
                            esEntero = true;
                        } catch (NumberFormatException ex) {
                            System.out.println("Solo se pueden introducir números");
                        }
                    }
                    bw.write(nombre+" "+matricula+" "+año+" "+puertas);
                    bw.newLine();
                }

            } while (!respuesta.equals("N"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
      filtrarAño(file);
    }
    public static void filtrarAño(File file) {
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)) {
            System.out.println("Ingrese año del coche que desea buscar");
            int añoDecoche = scanner.nextInt();
            String linea;
            boolean encontrado = false;
            while ((linea = br.readLine()) != null) {
                String[] coche = linea.split(" ");
                String nombre = coche[0];
                String matricula = coche[1];
                int año = Integer.parseInt(coche[2]);
                int puertas = Integer.parseInt(coche[3]);
                if (añoDecoche == año) {
                    System.out.println("Nombre: " + nombre + " Matrícula: " + matricula + " Año: " + año + " Puertas: " + puertas);
                    encontrado = true;
                }
            }
            if (!encontrado) {
                System.out.println("No se encontró el año de compra");
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}