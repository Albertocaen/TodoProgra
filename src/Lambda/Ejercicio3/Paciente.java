package Lambda.Ejercicio3;

public class Paciente {
    String nombre;
    int edad;
    String[] sintomas;

    public Paciente(String nombre, int edad, String[] sintomas) {
        this.nombre = nombre;
        this.edad = edad;
        this.sintomas = sintomas;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        if (!nombre.equals(null)){
            this.nombre = nombre;
        }
    }
    public int getEdad() {
        return edad; }
    public void setEdad(int edad) {
        this.edad = edad; }
    public String[] getSíntomas() {
        return sintomas; }
    public void setSíntomas(String[] síntomas) {
        this.sintomas = sintomas;
    }
}
