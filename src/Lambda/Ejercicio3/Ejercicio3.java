package Lambda.Ejercicio3;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        List<Paciente>paciente=new ArrayList<>();
        paciente.add(new Paciente("Felipe R.",54, new String[]{"Nauseas,Mareos"}));
        paciente.add(new Paciente("Irene M",32, new String[]{"Tos,cansancio,mareos"}));
        paciente.add(new Paciente("Felipe R.",54, new String[]{"Ansiedad"}));
        paciente.add(new Paciente("Felipe R.",54, new String[]{"Fractura de cadera"}));
        paciente.add(new Paciente("Felipe R.",54, new String[]{"Tos,Amnesia,fiebre,dolor"}));

        paciente.sort((p1,p2)->Integer.compare(p1.getEdad(),p2.getEdad()));
        System.out.println("Nombre      Edad      Síntomas");
        for (int i = 0; i <paciente.size() ; i++) {
            Paciente pacientes=paciente.get(i);
            System.out.println(pacientes.getNombre() + "   " + pacientes.getEdad() + "   " + String.join(", ", pacientes.getSíntomas()));
        }

        System.out.println("///////////////////////////////////////////");
        //segunda lista
        List<Paciente> pacienteDescendente = new ArrayList<>(paciente);
        pacienteDescendente.sort((p1,p2)->Integer.compare(p2.getEdad(), p1.getEdad()));
        for (int i = 0; i <pacienteDescendente.size() ; i++) {
            Paciente pacientes2=pacienteDescendente.get(i);
            System.out.println(pacientes2.getNombre() + "   " + pacientes2.getEdad() + "   " + String.join(", ", pacientes2.getSíntomas()));
        }
    }
}
