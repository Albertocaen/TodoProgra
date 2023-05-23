package Stream.Ejercicio4;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;


public class Ejercicio4 {
    public static void main(String[] args) {
        //Crear un array de clientes, a partir de la clase clientes, que contiene los siguientes
        //atributos: DNI, nombre, fecha de nacimiento. Crea un array con los siguientes datos:
        List<Clientes>clientes=new ArrayList<>();
        clientes.add((new Clientes("11111111A","Asdrubal","15/12/2004")));
        clientes.add((new Clientes("22222222B","Benito","6/5/2001")));
        clientes.add((new Clientes("33333333C","Carlota","9/7/1988")));
        clientes.add((new Clientes("44444444D","Demetria","10/10/2002")));
        clientes.add((new Clientes("55555555E","Esperanza","2/2/1972")));

        //se le da el formato a la fecha para poder gestionarla
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("d/M/yyyy");
        clientes.stream()
                //localdate.parse se utiliza para dar formato de localdate a algo
                .sorted(Comparator.comparing(fecha->LocalDate.parse(fecha.getFechaDeNacimiento(),formatter))).toList()
                .forEach(System.out::println);
    }
}
