package Lambda.Ejercicio4;

import java.sql.SQLOutput;
import java.util.function.Predicate;

public class Ejercicio4 {

    public static void main(String[] args) {

        //4.1. Define un predicado para comprobar si un entero es múltiplo de 5.
        Predicate<Integer>multiplo= x-> x % 5==0;
        boolean test=multiplo.test(5);
        System.out.println(test);

        //4.2. Define un predicado para comprobar si un String no termina en “s”.
        Predicate<String>termina=x->x.endsWith("s");
        boolean test2=termina.test("Mañana");
        System.out.println(test2);

        //4.3. Define un predicado para comprobar si un entero es par y múltiplo de 3.
        Predicate<Integer>ParYMultiplo=x-> x%2==0 && x%3==0;
        boolean test3=ParYMultiplo.test(3);
        System.out.println(test3);

        //4.4. Define un predicado para comprobar si un carácter es una letra y está en mayúscula.
        Predicate<Character>EsCaracter=x-> Character.isLetter(x)&&Character.isUpperCase(x);
        boolean test4=EsCaracter.test('*');
        System.out.println(test4);

        //4.5. Define un predicado para comprobar si un entero es impar y múltiplo de 7;
        Predicate<Integer>EsImparYMultiplo=x-> x % 2!=0 && x % 7 ==0;
        boolean test5=EsImparYMultiplo.test(7);
        System.out.println(test5);

        //4.6. Define un predicado para comprobar si un entero es impar o múltiplo de 7.
        Predicate<Integer>EsImparOMultiplo=x-> x % 2!=0 || x % 7 ==0;
        boolean test6=EsImparOMultiplo.test(7);
        System.out.println(test6);
    }
}
