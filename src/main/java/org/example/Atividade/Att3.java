package org.example.Atividade;

import java.util.Scanner;

public class Att3 {
    static void main() {
        int opcao = 0;

        Scanner scanner = new Scanner(System.in);

        do {
            System.out.println("digite a opção");
            opcao = scanner.nextInt();
            switch (opcao) {

                case 1:
                    System.out.println(" Ver camisas ");
                    break;
                case 2:
                    System.out.println(" ver calças ");
                    break;
                case 3:
                    System.out.println("sair");
                    break;
                default:
                    System.out.println(" opção invalida ");
                    break;
            }
        }while (opcao != 3);

    }
}
