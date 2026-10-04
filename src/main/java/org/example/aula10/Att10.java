package org.example.aula10;

import java.util.Scanner;

//1 — Faça um programa que peça dois números inteiros e mostre a divisão do primeiro pelo segundo. Se a pessoa digitar 0 no segundo, trate a ArithmeticException e mostre uma mensagem explicando que não dá pra dividir por zero.
public class Att10 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero inteiro:");
        int numero1 = scanner.nextInt();

        System.out.println("Digite outro numero inteiro");
        int numero2 = scanner.nextInt();


        try {
            int resultado = numero1 / numero2;
            System.out.println("Resultado da divisão: " + resultado);

        } catch (ArithmeticException ae) {
            System.out.println("Não é possivel dividir por 0!");
        }
         finally{
            scanner.close();

        }


        }

    }