package Clases.Ejercicio3Examen;

import java.time.LocalDate;

public abstract class Participante {
    protected LocalDate fechaDeNacimiento;
    protected String dni;

    public Participante( String dni,LocalDate fechaDeNacimiento) {
        this.fechaDeNacimiento = fechaDeNacimiento;
        this.dni=dni;
    }
}
