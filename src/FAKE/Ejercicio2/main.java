package FAKE.Ejercicio2;

import java.io.File;
import java.util.*;

public class main {
    public static void main(String[] args) {
        Equipo equipo1=new Equipo("LosMamalone");
        Equipo equipo2=new Equipo("Equipo 2");
        File file=new File("src/FAKE/Ejercicio2/plantilla.txt");
        List<Jugador> jugadores = new ArrayList<>();
        //ordena los jugadores del equipo por nombre, y muestra el resultado.
        // equipo1.AñadeJugador();
        //Map<Integer,String>test=new HashMap<>();

        //test=equipo1.generarMapaDePlantilla();
        //System.out.println(test.toString());
        equipo1.AñadeJugador();
        List<Jugador>listaparajugadores=new ArrayList<>();
        equipo1.getAtacantes().forEach(atacante->listaparajugadores.add(atacante));
        equipo1.getDefensores().forEach(defensores ->listaparajugadores.add(defensores) );
        equipo1.getPorteros().forEach(porteros ->listaparajugadores.add(porteros) );
        listaparajugadores.stream().sorted(Comparator.comparing(n1->n1.getNombre())).forEach(n-> System.out.println(n));


        List<Jugador>listadejugadoresficheros=new ArrayList<>();
        equipo2.ficherojugador(file);
        equipo2.getAtacantes().forEach(atacante -> listadejugadoresficheros.add(atacante));
        equipo2.getDefensores().forEach(defensores -> listadejugadoresficheros.add(defensores));
        equipo2.getPorteros().forEach(porteros -> listadejugadoresficheros.add(porteros));
        listadejugadoresficheros.forEach(jugador -> System.out.println(jugador));

        Map<Integer,String>mapa=new HashMap<>();
        equipo1.generarMapaDePlantilla();
        equipo2.generarMapaDePlantilla();
}
}
