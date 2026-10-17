package org.example.aula16;

public class ContadorVisitas {
    private static ContadorVisitas instancia;
     private int total = 0;
     private ContadorVisitas(){

     }

     public static ContadorVisitas getInstance(){
         if(instancia == null){

             instancia = new ContadorVisitas();
         }

         return instancia;


     }
       public void RegistrarVisita(){
         total++;
       }

       public int getTotal(){
         return total;
       }
}
