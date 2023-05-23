package FAKE.Ejercicio2;

import java.io.*;
import java.util.*;

public class Equipo {
    static Scanner scanner=new Scanner(System.in);
    String nombre;
    ArrayList<Atacante>atacantes=new ArrayList<>();
    ArrayList<Defensores>defensores=new ArrayList<>();

    public ArrayList<Atacante> getAtacantes() {
        return atacantes;
    }

    public void setAtacantes(ArrayList<Atacante> atacantes) {
        this.atacantes = atacantes;
    }

    public ArrayList<Defensores> getDefensores() {
        return defensores;
    }

    public void setDefensores(ArrayList<Defensores> defensores) {
        this.defensores = defensores;
    }

    public ArrayList<Porteros> getPorteros() {
        return porteros;
    }

    public void setPorteros(ArrayList<Porteros> porteros) {
        this.porteros = porteros;
    }

    ArrayList<Porteros>porteros=new ArrayList<>();


    public Equipo(String nombre) {
        this.nombre = nombre;
    }

    public void AñadeJugador(){
        Set<Integer>numeroGenerados=new HashSet<>();
        String menu="";
        Random rand= new Random();
        String[] names={"Manolo","Miguel","Antonio","Chave","Juan antonio","chavelo"};
        do {
            System.out.println("Quieres Añadir un Jugador?S/N");
            menu=scanner.nextLine().toUpperCase();
            if (menu.equals("S")){
            System.out.println("Tipo de Jugador a Añadir?");
            System.out.println("Atacante: A"+"\n" +
                    "Defendor: D"+"\n" +
                    "Portero: P");
            String tipoDeJugador=scanner.nextLine().toUpperCase();
            String name = names[rand.nextInt(names.length)];
                int dorsal;
                do {
                    dorsal = rand.nextInt(99) + 1;
                } while (numeroGenerados.contains(dorsal));
                numeroGenerados.add(dorsal);
            int numeroDeGoles=rand.nextInt(11);
            int pases= rand.nextInt(101);
            int balones= rand.nextInt(55);
            int numeroDeParadas=rand.nextInt(20);
            if (tipoDeJugador.equals("A")){
                atacantes.add(new Atacante(name,dorsal,numeroDeGoles,pases,balones));
            } else if (tipoDeJugador.equals("D")) {
                defensores.add(new Defensores(name,dorsal,numeroDeGoles,pases,balones));
            } else if (tipoDeJugador.equals("P")) {
                porteros.add(new Porteros(name,dorsal,numeroDeGoles,numeroDeParadas));
            }
            }
        }while (!menu.equals("N"));

    }

    public Map<Integer, String> generarMapaDePlantilla() {

        Map<Integer, String> mapaDePlantilla = new HashMap<>();
        for (Atacante atacante: atacantes
             ) {
            mapaDePlantilla.put(atacante.getDorsal(),atacante.getNombre());
        }
        for (Defensores defensor: defensores
             ) {
            mapaDePlantilla.put(defensor.getDorsal(),defensor.getNombre());
        }
        for (Porteros portero:porteros
             ) {
            mapaDePlantilla.put(portero.getDorsal(),portero.getNombre());
        }
        for (Map.Entry<Integer,String> entrada : mapaDePlantilla.entrySet()){
            System.out.println("Dorsal: "+entrada.getKey()+"- Jugador: "+entrada.getValue());
        }

        return mapaDePlantilla;
    }
    public void ficherojugador(File file){
        try (FileReader fr = new FileReader(file); BufferedReader br = new BufferedReader(fr)){
            String [] jugador;
            String line;
            br.readLine();
            while ((line = br.readLine())!= null){
                jugador = line.split(";");
                String nombre = jugador[1];
                int numero = Integer.parseInt(jugador[2]);
                int goles = Integer.parseInt(jugador[3]);
                int pases = Integer.parseInt(jugador[4]);
                int atajadas = Integer.parseInt(jugador[4]);


                String tipoDeJugador = jugador[0].toUpperCase();
                if (tipoDeJugador.equals("A")){
                    int recuperadas = Integer.parseInt(jugador[5]);
                    atacantes.add(new Atacante(nombre, numero,goles, pases, recuperadas));
                } else if (tipoDeJugador.equals("D")) {
                    int recuperadas = Integer.parseInt(jugador[5]);
                  defensores.add(new Defensores(nombre, numero,goles, pases, recuperadas));

                } else if (tipoDeJugador.equals("P")) {
                    porteros.add(new Porteros(nombre, numero, goles, atajadas));

                }
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
        } catch (IOException e) {
            System.out.println("Ha Ocurrido un error inesperado al leer el archivo");
        }
    }
    }
