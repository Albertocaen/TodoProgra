package Clases.Ejercicio1;
import java.util.ArrayList;
import java.util.Random;


public class Humano extends Ser implements Espiritul {

    protected ArrayList<Demonio>demonios;
    private double fe;
    protected ArrayList<Angel>angeles;

    public Humano(double fe) {
        this.demonios = new ArrayList<>();
        this.fe = fe;
        this.angeles = new ArrayList<>();
       añadirAngel();
       añadirDemonio();
    }

    public double getFe() {
        return fe;
    }

    public void rezar(){
        fe++;
        añadirAngel();
    }
    public void pecar(){
        fe--;
        añadirDemonio();
    }
    public void añadirDemonio(){
       Random random=new Random();
       int maldad=(random.nextInt(99)+1);
       Demonio demonio=new Demonio(maldad);
       demonios.add(demonio);
    }
    public void añadirAngel(){
        Random random=new Random();
        int bondad= (random.nextInt(99)+1);
        Angel angel=new Angel(bondad);
        angeles.add(angel);
    }
    @Override
    public void mostrar() {
        //recuerdo para trabajar con arrays y luego imprimirlos uso el size
        System.out.println("Datos del humano: \n" +
                "===============================\n" +
                "Fe: "+fe+"\n" +
                "El Humano tiene Angeles= "+angeles.size()+"\n" +
                "El Humano tiene Demonios= "+demonios.size()+".");
    }
}
