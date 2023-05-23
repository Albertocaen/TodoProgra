package Lambda.Ejercicio5;

import java.util.function.Function;

public class Ejercicio5 {
    //5. Con la interfaz Function:
    public static void main(String[] args) {

        //5.1. Define una función para devolver la longitud de un String.
        Function<String,String>longitud=x-> String.valueOf(x.replace(" ","").length());
        System.out.println(longitud.apply("Mañana es lunes"));

        //5.2.
        Function<Integer,Integer>cuadrado=x->x*x;
        System.out.println(cuadrado.apply(5));

        //5.3. Define una función que devuelva el 10% de una cantidad.
        Function<Double,Double>porsentaje=x-> x *0.1;
        System.out.println(porsentaje.apply(100.0));

    }
}
