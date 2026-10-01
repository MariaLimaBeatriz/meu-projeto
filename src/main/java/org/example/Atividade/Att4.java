package org.example.Atividade;

public class Att4 {
    static void main() {

        Pet cachorro = new Pet();

        cachorro.nome = "Chico";
        cachorro.peso = 7.6;
        cachorro.raca ="Puddle";

        System.out.println(" O cachorro " + cachorro.nome + " pesa " + cachorro.peso + "kg" + " sua raça é " + cachorro.raca );

        Pet gato = new Pet();

        gato.nome = "branquinha";
        gato.peso = 9.5;
        gato.raca = "Siamês";

        System.out.println(" A gata " + gato.nome + " pesa " + gato.peso + "kg" + " sua raça é " + gato.raca);
    }
}
