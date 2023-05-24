package Stream.Ejercicio6;

import java.util.List;
import java.util.Random;

public class Ejercicio6 {
    public static void main(String[] args) {
        Random random=new Random();
        List<Integer>numero=random.ints(40,0,1001).boxed().toList();
       int numeroGuardado= numero.stream().mapToInt(num->num).max().getAsInt();
        System.out.println(numeroGuardado);
        int numeroMenor=numero.stream().mapToInt(num->num).min().getAsInt();
        System.out.println(numeroMenor);
        int suma=numero.stream().mapToInt(num->num).sum();
        System.out.println(suma);
        double average=numero.stream().mapToDouble(num->num).average().getAsDouble();
        System.out.println(average);
    }
}
