package org.example.aula7;

public class AttAula7 {
    static void main() {

        String[] nome = { "Bia", "Helena", "Sofia", "Helena", "Ana"};
        System.out.println(" Primeiro nome:" + nome[0]);
        System.out.println(" terceiro nome é: " + nome[3]);
        System.out.println(" o último nome é: " + nome[4]);

        int[] notas = {8, 6, 10, 7, 9};
        int soma = 0;
        double media = 0;
        //for (int i = 0; i < notas.length ; i++) {
        soma = notas[0] + notas[1] + notas[2] + notas[3] + notas[4];
            System.out.println(" nota: " + soma);
        media = soma / 5.0;
            System.out.println("media " + media);


            
        }
    }

