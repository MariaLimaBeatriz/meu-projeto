package org.example.aula3;

public class Desafioaula3 {
    static void main() {
       // Desafio

        double nota1 = 5.3;
        double nota2 = 7.8;
        double nota3 = 4.5;
        double media = (nota1 + nota2 + nota3) / 3;
        System.out.printf("Sua média é: %.2f\n", media);

        if (media >= 7) {
            System.out.println("Aprovada");
        } else if (media >= 5 && media <= 6.9) {
            System.out.println("recuperacao");
        }
        else {
            System.out.println("reprovada");
        }

    }
}
