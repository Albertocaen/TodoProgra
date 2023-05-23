package Clases.Ejercicio3Examen;

import java.util.HashMap;

public interface Participacion {
    public abstract void competir();
  abstract HashMap<Integer,Corredor>elaborarClasificacion();
    abstract public void publicarPodium(HashMap<Integer,Corredor>publicar);

    abstract public void inscribirCorredor(Corredor corredor);

}
