package Ficheros.Ejercicio6;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.regex.Pattern;

public class ejercicio66 {
    public static void main(String[] args) {
        try(BufferedReader rd=new BufferedReader(new FileReader("src/Ficheros/Ejercicio6/br.txt"))){
           rd.lines()
                   //el flap map lo utilizamos para aplanar el stream, de fragmentos generados del splitasSrteam
                   .flatMap(linea-> Pattern.compile("\\*").splitAsStream(linea))
                   .forEach(linea-> System.out.println(linea));
            }catch (IOException e){
            throw new RuntimeException(e);
        }
    }
}
