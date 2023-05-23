package EjercicioPildoras;

import java.util.Objects;

public class Cliente {
    private String nombre;
    private String numeroDeCuenta;
    private double saldo;

    public Cliente(String nombre, String numeroDeCuenta, double saldo) {
        this.nombre = nombre;
        this.numeroDeCuenta = numeroDeCuenta;
        this.saldo = saldo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(String numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "Cliente" +
                "nombre='" + nombre + '\'' +
                ", numeroDeCuenta='" + numeroDeCuenta + '\'' +
                ", saldo=" + saldo
               ;
    }
//sobreescribo los metodos de equials y hashcode para que no se repitan valores
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cliente cliente = (Cliente) o;
        return Objects.equals(getNumeroDeCuenta(), cliente.getNumeroDeCuenta());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNumeroDeCuenta());
    }
}
