package Colecciones.Ejercicio1;

import java.lang.reflect.Array;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        // creamos 12 hoteles
        //Crea una clase denominada Hotel con los atributos idHotel (int), zona(String), y
        //precio (int). Los valores para zona podrán ser "playa","montaña" o "rural". El
        //precio supondremos que es un dato en euros que podrá tomar valores entre 40
        //y 150.
        //Crea una clase con el método main donde se cree un conjunto sin ordenar de
        //12 hoteles. El programa nos mostrará por consola este conjunto de hoteles y
        //nos preguntará en qué zona queremos el hotel.
        //Tras ésto el programa creará un conjunto ordenado por precio con los hoteles
        //cuya zona corresponda con la zona elegida y los mostrará por consola.
        Set<Hotel> hoteles= new HashSet<>();
        hoteles.add(new Hotel(4, "playa", 100));
        hoteles.add(new Hotel(40, "playa", 110));
        hoteles.add(new Hotel(400, "playa", 120));
        hoteles.add(new Hotel(4000, "playa", 130));
        hoteles.add(new Hotel(5, "montaña", 100));
        hoteles.add(new Hotel(50, "montaña", 110));
        hoteles.add(new Hotel(500, "montaña", 120));
        hoteles.add(new Hotel(5000, "rural", 130));
        hoteles.add(new Hotel(6, "rural", 100));
        hoteles.add(new Hotel(60, "rural", 50));
        hoteles.add(new Hotel(600, "rural", 400));
        hoteles.add(new Hotel(6000, "montaña", 130));

        hoteles.forEach(hotel -> System.out.println(hotel));
        Scanner sc = new Scanner(System.in);
        System.out.println("En que Zona quieres el hotel");
        String zona= sc.nextLine().toLowerCase();

        ArrayList<Hotel> elegidos=new ArrayList<>();
        for (Hotel h: hoteles) {
            if (h.getZona().equals(zona)){
                elegidos.add(h);
        }
        }
        System.out.println("Antes de ordenar");
        elegidos.forEach(h -> System.out.println(h));
        System.out.println();
        elegidos.sort((hotel1, hotel2) -> hotel1.getPrecio() - hotel2.getPrecio());
        System.out.println("Ordenado por precio");
        elegidos.forEach(h -> System.out.println(h));

    }
}
