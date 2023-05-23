package Clases.Examen.ejercicio01;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Ejercicio01 {
    public static void main(String[] args) {
        Libro libro1 = new Libro("Yo, robot", "Isaac Asimov", TipoLibro.FICCIÓN, 1950);
        Libro libro2 = new Libro("¿Sueñan los androides con ovejas eléctricas?", "Philip K. Dick", TipoLibro.FICCIÓN, 1968);
        Libro libro3 = new Libro("Piensa en Java", "Bruce Eckel", TipoLibro.NO_FICCIÓN, 1998);
        Libro libro4 = new Libro("Clean Code", "Robert C Martin", TipoLibro.NO_FICCIÓN, 2008);
        Libro libro5 = new Libro("El libro negro del programador", "Rafael Gómez Blanes", TipoLibro.NO_FICCIÓN, 2014);
        Libro libro6 = new Libro("El nombre de la rosa", "Umberto Eco", TipoLibro.FICCIÓN, 1980);
        Libro libro7 = new Libro("Watchmen", "Alan Moore y Dave Gibbons", TipoLibro.FICCIÓN, 1986);
        Libro libro8 = new Libro("Sandman", "Neil Gaiman", TipoLibro.FICCIÓN, 1989);
        Libro libro9 = new Libro("The Pragmatic Programmer", "Andrew Hunt y David Thomas", TipoLibro.NO_FICCIÓN, 1999);
        Libro libro10 = new Libro("The Art of Computer Programming, vol 1", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro11 = new Libro("The Art of Computer Programming, vol 2", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro12 = new Libro("The Art of Computer Programming, vol 3", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro13 = new Libro("The Art of Computer Programming, vol 4", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro14 = new Libro("The Art of Computer Programming, vol 5", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro15 = new Libro("The Art of Computer Programming, vol 6", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);
        Libro libro16 = new Libro("The Art of Computer Programming, vol 7", "Donald Knuth", TipoLibro.NO_FICCIÓN, 1968);

        // 1. Crea un conjunto con los libros proporcionados y utiliza un iterador para mostrar los datos de los libros que contiene.
        System.out.println("1. Títulos de los libros");
        List<Libro>libros=new ArrayList<>();
        libros.add(libro1);
        libros.add(libro2);
        libros.add(libro3);
        libros.add(libro4);
        libros.add(libro5);
        libros.add(libro6);
        libros.add(libro7);
        libros.add(libro8);
        libros.add(libro9);
        libros.add(libro10);
        libros.add(libro11);
        libros.add(libro12);
        libros.add(libro13);
        libros.add(libro14);
        libros.add(libro15);
        libros.add(libro16);
        Iterator<Libro>contarlibros= libros.iterator();
        while (contarlibros.hasNext()){
            String contar= String.valueOf(contarlibros.next());
            System.out.println(contar);
        }
        System.out.println("///////////////////////////////////////////////////");

        // 2. Ordena los libros por título
        System.out.println("\n2. Títulos ordenados ");
        Stream<Libro>librosordenados=libros.stream().sorted(Comparator.comparing(p1->p1.getTítulo()));
        librosordenados.forEach(libro -> System.out.println(libro));

        // 3. Muestra los libros de no ficción, ordenados por código de forma descendente.
        System.out.println("\n3. Libros de ficción ordenados por código (descendente)");
        Stream<Libro> librosDes =libros.stream()
                .filter(l1->l1.getTipo().equals(TipoLibro.NO_FICCIÓN))
                .sorted((p1,p2)-> p1.getcodigo()- p2.getcodigo());
        librosDes.forEach(libro -> System.out.println(libro));

        // Crea un fichero catálogo.csv, que se guarde en la misma carpeta que el paquete ejercicio02, que contenga una línea por cada libro, con los campos (valores de los atributos) título, autor y tipo separados por “;” (punto y coma).
        // las excepciones deben personalizarse mediante mensajes que indiquen el tipo de problema que las ha lanzado. Además de la excepción obligada de entrada/salida, añade la posiblidad de que salte una excepción genérica, en la que no hayamos pensado.

        File file=new File("src/Clases/Examen/ejercicio01/catalogo.csv");
        String line;
        if (!file.exists()){
            try {
            file.createNewFile();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
            //si voy a leer un array RECORDAR QUE TENGO QUE USAR.SIZE NO SEAS PENDEJO ESCRIBIR COSAS DE UN ARRAY NO ES LO MISMO QUE DESDE UNA VARIABLE NORMAL

    }else System.out.println("Ya esta creado");
        try(BufferedWriter bw=new BufferedWriter(new FileWriter(file,true))){
            for (int i = 0; i <libros.size() ; i++) {
                Libro guardarlibros=libros.get(i);
                String titulo=guardarlibros.getTítulo();
                String autor=guardarlibros.getAutor();
                String tipo= String.valueOf(guardarlibros.getTipo());
                bw.write(titulo+";"+autor+";"+tipo);
                bw.newLine();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
