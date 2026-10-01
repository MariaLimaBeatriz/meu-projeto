package org.example;

import java.util.Scanner;

public class Teste2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite seu nome: ");
        String nome = scanner.nextLine();

        System.out.print("Digite a sua idade:");
        int idade = scanner.nextInt();

        System.out.println(" seu nome é: " + nome + " você tem: " + idade + " anos ");

    }
}


