package Clases.Examen.ejercicio02;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;


public class Ejercicio2 {
    public static void main(String[] args) {
        File file=new File("src/Clases/Examen/ejercicio02/codigos_postales_municipios.csv");
        List<CodigoPostal>codigo=new ArrayList<>();
        try(BufferedReader br=new BufferedReader(new FileReader(file))){
            String line;
            br.readLine();// nos saltamos los encabezados
            while((line=br.readLine())!=null){
                String[] leer=line.split(",",3);
                // 7. mostramos el contenido del fichero, línea a línea, de forma tabulada, sin mostrar los encabezados
                //System.out.println(campos[0] + "\t" + campos[1] + "\t" + campos[2]);
                // 8. Para cada línea del fichero creamos un objeto y lo guardamos en una lista,
                String codigoPostal=leer[0];
                String idCiudad=leer[1];
                String nombreMunicipio=leer[2];
                System.out.println(codigoPostal+","+idCiudad+","+nombreMunicipio);
               codigo.add(new CodigoPostal(codigoPostal,nombreMunicipio,idCiudad));
            }// si quiero filtrar cosas que inicien por un numero no pedir que sean iguales, .equals es igual no que inicie con eso

            // 8. Muestra los códigos postales de Melilla
            codigo.stream().
                    filter(cod->cod.codigoPostal.startsWith("52"))
                    .forEach(cod-> System.out.println(cod));

           // 9. Cuenta los códigos postales de Melilla
            long contador=codigo.stream().
                    filter(cod->cod.codigoPostal.startsWith("52")).count();
            System.out.println(contador);

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
