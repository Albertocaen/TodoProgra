package Colecciones.Ejercicio3;

import java.util.*;
import java.util.stream.Collectors;
//Implementar una aplicación en la que se insertan 20 números enteros aleatorios
//entre 1 y 10 (incluidos), que pueden estar repetidos, en una colección. A
//continuación, se crea una lista con los mismos elementos sin repeticiones.
public class Ejercicio03 {
    public static void main(String[] args) {
        Random ramdom= new Random();
        List <Integer> listaNumeros = ramdom.ints(10,1,10).boxed().collect(Collectors.toList());
        Collections.sort(listaNumeros);
        listaNumeros.forEach(n-> System.out.print(n+" "));

        Set<Integer> listaDeNumerosUnicos=new HashSet<>(listaNumeros);
       List<Integer> listadefinitiva = listaDeNumerosUnicos.stream().sorted().collect(Collectors.toList());
        System.out.println();
        listadefinitiva.forEach(n-> System.out.print(n+ " "));
    }
}
