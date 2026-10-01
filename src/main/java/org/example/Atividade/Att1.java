package org.example.Atividade;
//  Crie um programa que peça ao usuário para digitar o nome de um lanche e o valor dele. Em seguida, verifique: se o valor for maior que R$ 30.00, aplique um desconto de R$ 5.00. No final, exiba uma mensagem usando concatenação e printf para formatar o preço com duas casas decimais.
//Exemplo de saída: "O lanche Xis-Bacon custa R$ 28.50 \n"
import java.util.Scanner;

public class Att1 {
    static void main() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o nome do lanche:");
        String nome = scanner.nextLine();

        System.out.println("Digite o valor do lache:");
        double valor = scanner.nextDouble();

        if (valor > 30.00) {
            System.out.println(" Desconto aplicado " + (valor - 5.00));
        }
        System.out.printf("O seu lanche %s custa %.2f\n", nome, valor);
    }   }

