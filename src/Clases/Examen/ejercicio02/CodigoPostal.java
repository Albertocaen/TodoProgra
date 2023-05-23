package Clases.Examen.ejercicio02;

public class CodigoPostal {
    protected String codigoPostal;
    protected String nombreMunicipio;
    protected String idMunicipio;

    public CodigoPostal(String codigoPostal, String nombreMunicipio, String idMunicipio) {
        this.codigoPostal = codigoPostal;
        this.nombreMunicipio = nombreMunicipio;
        this.idMunicipio = idMunicipio;
    }

    @Override
    public String toString() {
        return "codigoPostal='" + codigoPostal + '\'' +
                ", nombreMunicipio='" + nombreMunicipio + '\'';
    }
}
