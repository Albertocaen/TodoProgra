package Ficheros.Ejercicio8;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Comparator;
import java.util.Optional;
import java.util.stream.Stream;

public class Ejercicio8 {
    public static void main(String[] args) {
        try (BufferedReader rd = new BufferedReader(new FileReader("src/Ficheros/Ejercicio8/quijote.txt"))) {
            Optional<String> palabraMasLarga = rd.lines()
                    .flatMap(linea -> Stream.of(linea.split("\\W+")))
                    .max(Comparator.comparingInt(palabra->palabra.length()));
            palabraMasLarga.ifPresent(palabra -> System.out.println(palabra));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
