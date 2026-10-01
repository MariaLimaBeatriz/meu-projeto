package org.example.aula7;

import java.util.Scanner;

public class Nomes {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o seu nome completo:");
        String nomeCompleto = scanner.nextLine();

        System.out.println(nomeCompleto.length());
        System.out.println(nomeCompleto.toUpperCase());
        System.out.println(nomeCompleto.toLowerCase());
        System.out.println(nomeCompleto.charAt(0));

        System.out.println("Digite uma frase");
        String frase = scanner.next();
        System.out.println("Digite uma palavra");
        String palavra = scanner.next();

        System.out.println(frase.contains(palavra));

        System.out.println("Digite o seu nome duas vezes");
        String nome = scanner.nextLine();

        System.out.println(nome.equalsIgnoreCase("Ana ana"));



        //System.out.println(nome.length());
        //System.out.println(nome.toLowerCase());
        //System.out.println(nome.toUpperCase());
    }
}
