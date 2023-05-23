package FAKE.Ejercicio2;

public class Defensores extends Jugador {
    int numeroDeGoles;
    int pases;
    int balonesrecuperados;

    public Defensores(String nombre, int dorsal, int numeroDeGoles,int pases,int balonesrecuperados) {
        super(nombre,dorsal);
        this.numeroDeGoles = numeroDeGoles;
        this.pases=pases;
        this.balonesrecuperados=balonesrecuperados;
    }

    public int getNumeroDeGoles() {
        return numeroDeGoles;
    }

    public void setNumeroDeGoles(int numeroDeGoles) {
        this.numeroDeGoles = numeroDeGoles;
    }

    public int getPases() {
        return pases;
    }

    public void setPases(int pases) {
        this.pases = pases;
    }

    public int getBalonesrecuperados() {
        return balonesrecuperados;
    }

    public void setBalonesrecuperados(int balonesrecuperados) {
        this.balonesrecuperados = balonesrecuperados;
    }

    @Override
    public int valorarJugador() {
        return ((this.numeroDeGoles*20)+pases*1+balonesrecuperados*4);
    }


}
