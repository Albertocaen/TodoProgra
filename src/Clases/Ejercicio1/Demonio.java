package Clases.Ejercicio1;

public class Demonio  extends Incorporeo{
    private  int bondad=0;
    private  int maldad;

    public Demonio( int maldad) {
        this.maldad = maldad;
    }

    public int getBondad() {
        return bondad;
    }

    public void setBondad(int bondad) {
        this.bondad = bondad;
    }

    public int getMaldad() {
        return maldad;
    }

    public void setMaldad(int maldad) {
        this.maldad = maldad;
    }

    @Override
    public void mostrar() {
        System.out.println("Maldad del Demonio "+getMaldad());
    }
}
