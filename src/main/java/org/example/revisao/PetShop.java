package org.example.revisao;

import java.util.*;

public class PetShop {

    static void main() {

        String nome = "Lila";
        String especie = "Gato";
        double peso = 10;
        int opcao = -1;
        int total = 0;

        Pet[] pets = new Pet[5];

        System.out.println(" o seu pet é: " + nome + " da especie " + especie + " e tem " + peso);
        Scanner scanner = new Scanner(System.in);

        while (opcao != 0) {

            try {
                System.out.println(" Olá, Bem- vindo ao nosso cadastro do PetShop! \nDigite opção 1 para cadastrar o seu pet ou opção zero para sair ");
                opcao = scanner.nextInt();

                switch (opcao) {

                    case 1:
                        Pet novoPet1 = new Pet();
                        System.out.println(" para cadastrar o seu pet digite o nome");
                        novoPet1.nome = scanner.next();
                        System.out.println(" Digite a especie do seu pet ");
                        novoPet1.especie = scanner.next();
                        System.out.println(" digite o peso do seu pet ");
                        novoPet1.peso = scanner.nextDouble();

                        pets[total] = novoPet1;
                        total++;

                        System.out.println(" Ficha do pet cadastrado");
                        System.out.println(" O nome do Pet é : " + novoPet1.nome);
                        System.out.println(" A especie do Pet é: " + novoPet1.especie);
                        System.out.printf("Peso: %.1f kg\n", novoPet1.peso);
                        System.out.println(novoPet1.definirPorte());


                        System.out.println("Pets cadastrados: " + total);

                        break;
                    case 0:

                        System.out.println("Encerrando cadastro.");


                        break;


                    case 2:

                        System.out.println("\nPETS CADASTRADOS");
                        for (int i = 0; i < total; i++) {
                            System.out.printf("%s (%s) - %.1f kg -%s\n",
                                    pets[i].nome, pets[i].especie, pets[i].peso, pets[i].definirPorte());
                            System.out.println(" Qual Pet deseja verificar se está no cadastro? ");
                        }


                    case 3:

                        String procurandoPet = scanner.next();

                        boolean achou = false;

                        for (int i = 0; i < total; i++) {
                            if (pets[i].nome.equalsIgnoreCase(procurandoPet)) {
                                System.out.printf("Encontrado: %s (%s) - %.1f kg\n",
                                        pets[i].nome, pets[i].especie, pets[i].peso);
                                achou = true;

                            }
                            if (!achou) {

                                System.out.println("Pet não encontrado.");
                            }
                        }
                        break;

                    case 4:
                        HashSet<String> especies = new HashSet<>();
                        for (int i = 0; i < total; i++) {
                            especies.add(pets[i].especie);
                        }
                        for (String item : especies) {

                          System.out.println(especies);

                          System.out.println(especies.size());

                }
                    default:
                        System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Digite apenas números!");
                scanner.nextLine();

            }
            System.out.println("\nPETS CADASTRADOS");
            for (int i = 0; i < total; i++) {
                System.out.printf("%s (%s) - %.1f kg -%s\n",
                        pets[i].nome, pets[i].especie, pets[i].peso, pets[i].definirPorte());


            }
        }
    }
}