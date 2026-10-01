package org.example.Atividade;

import java.util.Scanner;

public class Att7 {
    static void main() {

        int opcao = 0;

        while (opcao != 2) {
            Scanner scanner = new Scanner(System.in);
            System.out.println(" Olá, Bem-vindo ao sistema de cadastro de notas, Pressione 1 continuar, 2 para sair");
            opcao = scanner.nextInt();

            switch (opcao) {
                    case 1:

                    Aluna aluna = new Aluna();
                    System.out.println(" Digite a sua nota 1");
                    aluna.nota = scanner.nextDouble();

                    System.out.println(" Digite a sua nota 2 ");
                    aluna.nota2 = scanner.nextDouble();

                    System.out.print("Digite o seu nome");
                    aluna.nome = scanner.next();

                    aluna.media = (aluna.nota + aluna.nota2) / 2;

                    if (aluna.media >= 6) {
                        aluna.passou = true;
                    } else {
                        aluna.passou = false;
                    } System.out.printf(" A aluna %s, tirou a primeira nota %.1f e a segunda nota %.1f. Sua média final foi %.1f aprovada: %b\n", aluna.nome,aluna.nota,aluna.nota2,aluna.media,aluna.passou);

                     break;
                    case 2:
                        System.out.println("Encerrando o sistema. Até logo!");

                     break;

                    default:
                    System.out.println(" opção invalida ");

                    break;


            }
        } } }