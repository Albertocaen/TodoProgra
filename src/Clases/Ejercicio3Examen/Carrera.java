package Clases.Ejercicio3Examen;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

public class Carrera  implements Participacion{
   static int inscripciones;
    String lugar;
    String nombre;
    LocalDate fecha;
    String hora;
    ArrayList<Corredor>corredores;
    Distancia distancia;

    public Carrera(String lugar, LocalDate fecha, String hora,String nombre, Distancia distancia) {
        this.lugar = lugar;
        this.nombre = nombre;
        this.fecha = fecha;
        this.hora = hora;
        this.distancia = distancia;
        corredores=new ArrayList<>();
    }
// acuerdate de los getter y setter, lo tienes para implementar lo que quieras agregar
    @Override
    public void competir() {
        Random random=new Random();
        int numeroAleatorio=0;
        for (int i = 0; i <corredores.size() ; i++) {
            Corredor corredor=corredores.get(i);
            if (distancia ==Distancia.CINCO_K){
                numeroAleatorio= random.ints(15,61).findFirst().getAsInt();
                corredor.setTiempo(numeroAleatorio);
            } else if (distancia == Distancia.DIEZ_K) {
                numeroAleatorio= random.ints(30,91).findFirst().getAsInt();
                corredor.setTiempo(numeroAleatorio);
            } else if (distancia == Distancia.MEDIA_MARATÓN) {
                numeroAleatorio= random.ints(60,151).findFirst().getAsInt();
                corredor.setTiempo(numeroAleatorio);
            }else{
                numeroAleatorio= random.ints(120,361).findFirst().getAsInt();
                corredor.setTiempo(numeroAleatorio);
            }
        }
    }

    @Override
    public HashMap<Integer,Corredor> elaborarClasificacion() {
        competir();
        HashMap<Integer,Corredor>clasificacion=new HashMap<>();
        corredores.sort((p1,p2)->p1.getTiempo()-p2.getTiempo());
        for (int i = 0; i <corredores.size() ; i++) {
            clasificacion.put((i+1),corredores.get(i));
        }
        return clasificacion;
    }


    @Override
    public void inscribirCorredor(Corredor corredor) {
        corredores.add(corredor);
        inscripciones++;
        corredor.setDorsal(inscripciones);
    }
    @Override
    public void publicarPodium(HashMap<Integer, Corredor> c) {
        System.out.println("******** PODIUM ***********");
        System.out.println("ORO " +c.get(1)+" ");
        System.out.println("PLata "+c.get(2)+" ");
        System.out.println("Oro "+c.get(3)+" ");
    }
    public void imprimirClasificacion(HashMap<Integer, Corredor> clasificacion) {
      //puedo recorrerla con forEach o con iterator un map
        for (Integer elemento:clasificacion.keySet()
             ) {
            Corredor corredor=clasificacion.get(elemento);
            System.out.println(elemento+ " : "+corredor.toString());
        }

    }
    }

