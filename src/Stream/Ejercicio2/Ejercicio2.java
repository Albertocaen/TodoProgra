package Stream.Ejercicio2;

import javax.swing.*;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        List<Personaje> nuevoPersonaje=new ArrayList<>();
        nuevoPersonaje.add(new Personaje("Galdalf",Integer.MAX_VALUE,Armas.BASTON,"Si"));
        nuevoPersonaje.add(new Personaje("Aragorn",88,Armas.ESPADA,"Si"));
        nuevoPersonaje.add(new Personaje("Gimli",140,Armas.HACHA,"No"));
        nuevoPersonaje.add(new Personaje("Legolas",2931,Armas.ARCO,"No"));
        nuevoPersonaje.add(new Personaje("Boromir",41,Armas.ESPADA,"Si"));
        nuevoPersonaje.add(new Personaje("Frodo",50,Armas.ANILLO,"No"));
        nuevoPersonaje.add(new Personaje("Sam",33,Armas.ESPADA,"No"));

        nuevoPersonaje.stream()
                .filter(personaje -> personaje.getEdad()<90&&personaje.getArma().equals(Armas.ESPADA))
                .forEach(personaje -> System.out.println(personaje));
        System.out.println("//////////////////////////////////////////////////////////////////");
        //se puhede usar el ! con un enum pero fuera de el equals recordar que equal es para buscar algo igual
        nuevoPersonaje.stream()
                .filter(personaje ->personaje.getArma() !=Armas.ESPADA)
                .forEach(personaje -> System.out.println(personaje));
        System.out.println("/////////////////////////////////////////////////////////////////////////");
        nuevoPersonaje.stream()
                .sorted(Comparator.comparing(nombre->nombre.getNombre()))
                .forEach(personaje -> System.out.println(personaje));

        System.out.println("//////////////////////////////////////////////////////////////////////////");
        nuevoPersonaje.stream()
                .filter(personaje -> personaje.getHumano().equals("Si"))
                .forEach(personaje -> System.out.println(personaje));

        System.out.println("/////////////////////////////////////////////////////////////////////////");
       int max= nuevoPersonaje.stream()
               .mapToInt(personaje->personaje.getEdad())
               .max()
               .getAsInt();
        System.out.println(max);

    }
}
