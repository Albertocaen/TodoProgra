package EjercicioPildoras;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class CuentasUsuarios {
    public static void main(String[] args) {
        Cliente cl1 =new Cliente("Pedro","00001",20036);



        Cliente cl2 =new Cliente("Toño","00002",20035);
        Cliente cl3 =new Cliente("Jose","00003",20034);
        Cliente cl4 =new Cliente("Raul","00004",20033);
        Cliente cl5 =new Cliente("Raul","00004",20033);

        Set<Cliente> clientesBanco=new HashSet<>();
        clientesBanco.add(cl1);
        clientesBanco.add(cl2);
        clientesBanco.add(cl3);
        clientesBanco.add(cl4);
        clientesBanco.add(cl5);

        for (Cliente elemento:clientesBanco) {
            System.out.println(elemento.getNombre()+" "+elemento.getNumeroDeCuenta()+" "+elemento.getSaldo());
        }



        clientesBanco.stream()
                .sorted(Comparator.comparing(nombre->nombre.getNombre())).toList()
                .forEach(nombre-> System.out.println(nombre));



        clientesBanco.stream()
                .filter(nombre->nombre.getNombre().equals("Pedro"))
                .toList()
                .forEach(nombre-> System.out.println(nombre));



        System.out.println("////////////////////////////////////////////");
        Iterator<Cliente>practicando=clientesBanco.iterator();
        while (practicando.hasNext()){
            Cliente cliente=practicando.next();
            System.out.println(cliente);
        }
    }
}
