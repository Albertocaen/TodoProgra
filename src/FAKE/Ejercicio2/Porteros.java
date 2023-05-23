package FAKE.Ejercicio2;

public class Porteros extends Jugador {
    int numeroDeGoles;
    int pases;
    int balonesrecuperados;
    int numeroDeParadas;
    public Porteros(String nombre, int dorsal, int numeroDeGoles, int numeroDeParadas) {
        super(nombre,dorsal);
        this.numeroDeGoles = numeroDeGoles;
        this.numeroDeParadas=numeroDeParadas;
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

    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public int valorarJugador() {
        return ((this.numeroDeGoles*30)+numeroDeParadas*5);
    }
}
