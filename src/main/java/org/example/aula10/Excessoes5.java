package org.example.aula10;

import java.util.Scanner;

public class Excessoes5 {
    static void main() {
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Digite um numero ");
        int numero = scanner.nextInt();



        try {
            int resultado = 100 % numero;
            System.out.println(" O resto da divisão do seu numero por 100 é: " + resultado);

        } catch (ArithmeticException  e) {

            System.out.println(" o numero não pode ser 0!");
        }
    }
}
