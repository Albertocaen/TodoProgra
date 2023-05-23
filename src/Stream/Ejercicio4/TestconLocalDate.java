package Stream.Ejercicio4;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TestconLocalDate {
    public static void main(String[] args) {
        List<Clientes2> clientes=new ArrayList<>();
        clientes.add((new Clientes2("11111111A","Asdrubal",LocalDate.of(2004,12,15))));
        clientes.add((new Clientes2("22222222B","Benito",LocalDate.of(2001,5,6))));
        clientes.add((new Clientes2("33333333C","Carlota",LocalDate.of(1998,7,9))));
        clientes.add((new Clientes2("44444444D","Demetria",LocalDate.of(2002,10,10))));
        clientes.add((new Clientes2("55555555E","Esperanza",LocalDate.of(1972,2,2))));

      // ejemeplo trabajado con localdate directamente

       clientes.stream().sorted(Comparator.comparing(Clientes2::getFechaDeNacimiento)).forEach(imprimir-> System.out.println(imprimir));
    }
}
