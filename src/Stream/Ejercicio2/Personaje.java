package Stream.Ejercicio2;

public class Personaje {
    private String nombre;
    private int  edad;
    private Armas arma;
    private String humano;

    public Personaje(String nombre, int edad, Armas arma, String humano) {
        this.nombre = nombre;
        this.edad = edad;
        this.arma = arma;
        this.humano = humano;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Armas getArma() {
        return arma;
    }

    public void setArma(Armas arma) {
        this.arma = arma;
    }

    public String getHumano() {
        return humano;
    }

    public void setHumano(String humano) {
        this.humano = humano;
    }

    @Override
    public String toString() {
        return "Personaje" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", arma=" + arma +
                ", humano=" + humano
               ;
    }
}
