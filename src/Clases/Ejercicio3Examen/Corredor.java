package Clases.Ejercicio3Examen;

import java.time.LocalDate;

public class Corredor extends Participante {
    private int dorsal;
    private int tiempo;

    public Corredor( String dni,LocalDate fechaDeNacimiento) {
        super(dni,fechaDeNacimiento);
    }


    public int getDorsal() {
        return dorsal;
    }
    public String convertirTiempo(){
        int tiempo=getTiempo();
        int hora=tiempo/60;
        int minutos=tiempo%60;
        // if ternario
        String minutossr=(minutos<10)?"0"+minutos:Integer.toString(minutos);
        String horahh=hora+":"+minutos;
        return horahh;
    }
    public void setDorsal(int dorsal) {
        this.dorsal = dorsal;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public String toString() {
        return "Corredor" +
                "dorsal=" + dorsal +
                ", tiempo=" + convertirTiempo() +
                ", fechaDeNacimiento=" + fechaDeNacimiento +
                ", dni=" + dni;
    }
}
