package org.example.Atividade;

import java.util.Scanner;

public class Att5 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        for(int i = 1; i <= 3; i++) {
            Produto novoProduto = new Produto();

            System.out.println(" Digite o nome do produto:");
            novoProduto.nome = scanner.nextLine();
            System.out.println("digite o valor do produto:");
            novoProduto.preco = scanner.nextDouble();

            if(novoProduto.preco > 100){
                System.out.printf("O valor é %.2f. Produto caro!",novoProduto.nome,novoProduto.preco);
            }

        }

        }

}
