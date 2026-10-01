package org.example.Atividade;

import java.util.Scanner;

public class Att6 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

       System.out.println("Digite seu ano de nascimento");
       int ano = scanner.nextInt();


       System.out.println("Digite seu nome completo");
       String nome = scanner.next();

       System.out.println(" O usuário " + nome + " nasceu no ano de " + ano );




    }
}
