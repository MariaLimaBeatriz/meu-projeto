package org.example.aula10;

import java.util.InputMismatchException;
import java.util.Scanner;

// Peça a idade da pessoa com scanner.nextInt(). Se ela digitar um texto em vez de um número, trate a InputMismatchException e mostre uma mensagem pedindo um número.
public class Excessoes3 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("digite sua idade");


        try {
            int idade = scanner.nextInt();
            System.out.println("Sua idade é: " + idade);

        } catch (InputMismatchException ime) {
            System.out.println("Digite apenas numeros!");
        }
        finally {
            scanner.close();

        }
    }}
