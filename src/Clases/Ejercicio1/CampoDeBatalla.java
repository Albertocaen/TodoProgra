package Clases.Ejercicio1;

public class CampoDeBatalla {
   public  static void luchar(Humano h){
       int sumabondad=0;
       int sumaMaldad=0;
       //se puede hacer mas facil colocandole getter y setter a la clase humano, pero lo voy hacer sin eso.
       for (int i = 0; i <h.angeles.size(); i++) {
           int bondad= h.angeles.get(i).bondad;
           sumabondad=sumabondad+ h.angeles.get(i).bondad;
       }
       //Manera de for Each

       for (Demonio elemento: h.demonios) {
           sumaMaldad=sumaMaldad+ elemento.getMaldad();
       }
       String texto="";
       if (sumaMaldad>sumabondad){
           h.rezar();
           texto= sumaMaldad +" > " +sumabondad+" El humano reza, por lo que tiene un angel mas y la fe del humano aumenta";
       } else {
           h.pecar();
           texto= sumabondad +" < " +sumaMaldad+" El humano peca, por lo que tiene un angel mas y la fe del humano aumenta";
       }

       System.out.println("Combate entre angeles y demonios : \n" +
               "==================================\n" +
               "Bondad de los angeles: "+sumabondad+"\n" +
               "Maldad de los demonios:  "+sumaMaldad+"\n" +
               texto);

   }

    public static void main(String[] args) {
  Humano humano=new Humano(50);
  luchar(humano);
  humano.rezar();
  humano.mostrar();
  humano.rezar();
  humano.mostrar();
  humano.pecar();
  humano.mostrar();
    }
}
