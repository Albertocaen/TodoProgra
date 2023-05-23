package Colecciones.Ejercicio1;

public class Hotel {
    private int idHotel;

    private String zona;
    private int precio;
    public Hotel(int idHotel, String zona, int precio) {
        this.idHotel = idHotel;
        this.zona = zona;
        this.precio = precio;
    }

    public int getIdHotel() {
        return idHotel;
    }

    public void setIdHotel(int idHotel) {
        this.idHotel = idHotel;
    }

    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "idHotel=" + idHotel +
                ", zona='" + zona + '\'' +
                ", precio=" + precio +
                '}';
    }
}
