package Clases.Ejercicio1;

public class Angel extends Incorporeo {

    protected int bondad;
    protected int maldad=0;

    public Angel(int bondad) {
        this.bondad = bondad;
    }

    @Override
    public void mostrar() {
        System.out.println("La bondad del angel es "+bondad);
    }
}
