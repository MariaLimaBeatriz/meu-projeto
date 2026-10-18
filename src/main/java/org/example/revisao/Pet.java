package org.example.revisao;

public class Pet {

     public String nome;
     public String especie;
     public double peso;
     public String porte;

     public String definirPorte() {

          if (peso < 10.0) {
               return " O seu pet é de porte pequeno ";
          } else if (peso < 25.0) {
               return " O seu pet é de porte médio";
          } else {
               return " o seu pet é de porte grande";
          }

     }
}