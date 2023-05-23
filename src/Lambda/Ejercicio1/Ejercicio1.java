package Lambda.Ejercicio1;

import java.sql.SQLOutput;
import java.util.*;
import java.util.stream.Collectors;

public class Ejercicio1 {
    public static void main(String[] args) {
        //2.1. Crea una lista de Strings y utiliza una expresión lambda para imprimir cada elemento de
        //la lista.
        List<String> lista= new ArrayList<>();
        lista.add("Hola");
        lista.add("Buenas tardes");
        lista.forEach(n-> System.out.print(n+" "));
        System.out.println();

        //2.2. Crea una lista de Strings y utiliza una expresión lambda para contar cuántas palabras
        //tienen más de 5 caracteres.
        List<String> lista2=new ArrayList<>();
        lista2.add("Buenas que tal");
        lista2.add("buernl");
        lista2.add("Buenas que paso ");

        // se trabaja con long
        long cantidadDePalabras= lista2.stream()
                .filter(palabra->palabra.length() > 5)
                .count();
        System.out.println(cantidadDePalabras);

        //2.3. Crea una lista de números enteros y utiliza una expresión lambda para encontrar el
        //número mayor.
        List<Integer> listaNumeros=new ArrayList<>();
        Random random=new Random();
        for (int i = 0; i <10; i++) {
            int numeroAleatorio=random.nextInt(10);
            listaNumeros.add(numeroAleatorio);
        }
        listaNumeros.forEach(elemento-> System.out.print(elemento+" "));
        System.out.println();
        int numeroMayor= listaNumeros.stream()
                .max((a,b)->a.compareTo(b))
                .orElse(0);
        System.out.println(numeroMayor);
        System.out.println();


        //2.4. Crea una lista de números enteros y utiliza una expresión lambda para encontrar la
        //suma de los números pares.
        List<Integer>NumerosEnterosPares=new ArrayList<>();
        Random random2=new Random();
        for (int i = 0; i <10; i++) {
            int numeroAleatorio=random2.nextInt(10);
           NumerosEnterosPares.add(numeroAleatorio);
        }
        NumerosEnterosPares.forEach(imprimir-> System.out.print(imprimir+" "));
        System.out.println();
        int SumaDePares=NumerosEnterosPares.stream()
                .filter(numero->numero %2 ==0)
                .mapToInt(Integer-> Integer.intValue())
                .sum();
        System.out.print(SumaDePares);
        System.out.println();


        //2.5. Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una
        //expresión lambda para encontrar la persona más joven.
        List<Persona>personas=new ArrayList<>();
        personas.add(new Persona("Juan" ,25));
        personas.add(new Persona("Pedro" ,23));
        personas.add(new Persona("Josefina" ,22));
        //.min se usa para obtener el valor minimo de un flujo de elementos
        Persona personaMenorEdad=personas.stream()
                .min((p1,p2)->Integer.compare(p1.getEdad(), p2.getEdad()))
                .orElse(null);
        System.out.println("La persona mas joven  "+personaMenorEdad.getNombre()+" Su edad es "+personaMenorEdad.getEdad());
        System.out.println("\n");

        //2.6. Crea una lista de objetos de tipo Persona (con atributos nombre y edad) y utiliza una
        //expresión lambda para ordenar la lista por edad, de menor a mayor.
        List<Persona>persona2=new ArrayList<>();
        persona2.add(new Persona("Juan" ,25));
        persona2.add(new Persona("Pedro" ,23));
        persona2.add(new Persona("Josefina" ,21));
        persona2.add(new Persona("Josefina" ,22));

       //comparamos para la edad
        persona2.sort((p1,p2)->Integer.compare(p1.getEdad(),p2.getEdad()));
        for (int i = 0; i <persona2.size() ; i++) {
            Persona persona=persona2.get(i);
            System.out.println(persona.getNombre()+" - "+ persona.getEdad()+" Ejercicio6");
        }
        System.out.println();



        //2.7. Crea una lista de objetos de tipo Persona y utiliza una expresión lambda para filtrar las
        //personas que tienen una edad mayor a 30.
        List<Persona>persona3=new ArrayList<>();
        persona3.add(new Persona("Juan" ,25));
        persona3.add(new Persona("Pedro" ,40));
        persona3.add(new Persona("Josefina" ,21));
        persona3.add(new Persona("Josefina" ,22));
        persona3.add(new Persona("Josefina" ,34));
        persona3.add(new Persona("Josefina" ,21));
        persona3.add(new Persona("Josefina" ,30));
        //agregar y filtrar la persona mayor de 30
        List<Persona>personasMayores=persona3.stream()
                .filter(persona -> persona.getEdad()>30)
        //p1,p2)-> Integer.compare(p2.getEdad(), p1.getEdad())
                .sorted(Comparator.comparingInt(Persona::getEdad).reversed())
                .toList();

        //en el for trabajo con la variable de la segunda lista porque es la que evalua
        for (int i = 0; i <personasMayores.size() ; i++) {
            Persona persona=personasMayores.get(i);
            System.out.println(persona.getNombre()+" -  "+persona.getEdad()+" Ejercicio7");
        }
        System.out.println();

        //2.8. Crea una lista de objetos de tipo Producto (con atributos nombre y precio) y utiliza una
        //expresión lambda para calcular el precio total de la lista.
        List<Producto> producto1=new ArrayList<>();
        producto1.add(new Producto("shampoo",1.50));
        producto1.add(new Producto("enjuage",1.50));
        producto1.add(new Producto("alizante",3.30));
        producto1.add(new Producto("moneda",4.40));
        producto1.add(new Producto("aguacate",5.50));

        double precio=producto1.stream()
                //esto es igual a producto -> producto.getprecio()
                .mapToDouble(Producto::getPrecio)
                .sum();

        System.out.println(precio);
        System.out.println();

        //2.9. Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para ordenar
        //la lista por precio, de mayor a menor.
        List<Producto>producto2=new ArrayList<>();
        producto2.add(new Producto("shampoo",1.50));
        producto2.add(new Producto("enjuage",1.50));
        producto2.add(new Producto("alizante",3.30));
        producto2.add(new Producto("moneda",4.40));
        producto2.add(new Producto("aguacate",5.50));
        producto2.sort((p1,p2)->Double.compare(p1.getPrecio(),p2.getPrecio()));
        for (int i = 0; i <producto2.size() ; i++) {
            Producto producto=producto2.get(i);
            System.out.println(producto.getNombre()+"  -  "+producto.getPrecio());
        }
        System.out.println();
        //2.10. Crea una lista de objetos de tipo Producto y utiliza una expresión lambda para filtrar
        //los productos que tienen un precio menor a 10.
        List<Producto>producto3=new ArrayList<>();
        producto3.add(new Producto("shampoo",1.50));
        producto3.add(new Producto("enjuage",1.50));
        producto3.add(new Producto("alizante",12));
        producto3.add(new Producto("moneda",20.22));
        producto3.add(new Producto("aguacate",11));

        List<Producto> deMenorAMayor=producto3.stream()
                .filter(producto -> producto.getPrecio()>10)
                .sorted(Comparator.comparingDouble(producto->producto.getPrecio()))
                .toList();
        //toList esto es como usar    .collect(Collectors.toList());
        for (int i = 0; i <deMenorAMayor.size() ; i++) {
            Producto producto=deMenorAMayor.get(i);
            System.out.println(producto.getNombre()+"  -  "+producto.getPrecio());
        }

    }
}
