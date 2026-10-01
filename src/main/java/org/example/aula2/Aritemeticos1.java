package org.example.aula2;

public class Aritemeticos1 {
    static void main() {
        System.out.println("2 + 2 = " + 2 + 2);
        System.out.println("2 + 2 = " + (2 + 2));
        /* o primeiro faz uma concatenacao devido pois ler da esquerda para a direita
         o segundo realiza uma soma devido ao ()
         */
        // ATIVIDADE 2

        int numero1 = 4;
        int numero = 8;

        System.out.println("Soma: " + (numero1 + numero));
        System.out.println("Subtração: " + (numero1 - numero));
        System.out.println("Multiplicação: " + (numero1 * numero));
        System.out.println("Divisão: " + (numero1 / numero));
        System.out.println("Resto: " + (numero1  % numero));
    }

    }