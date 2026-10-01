package org.example.aula2;

public class Concatenacao {
    static void main() {

                // CONCATENAÇÃO
                String nome = "Clarissa";
                String cidadeOndeMora = "Recife";
                int idade = 19;
                System.out.println("meu nome é " + nome +  " moro em " + cidadeOndeMora + " e tenho " + idade  + " anos");

                // CONCATENAÇÃO 2
                String produto = "caneca";
                double preco = 12.50;
                int quantidade = 4;
                double total = preco * quantidade;
                System.out.println("Comprei " + quantidade + " unidades de " + produto + " por R$ " + preco + " cada. Total: R$ " + total);

                // CONCATENAÇÃO 3
                int numero1 = 10;
                int numero2 = 5;
                int total3 = numero1 + numero2;
                System.out.println("A soma do numero " + numero1 + " e numero " + numero2 + " é igual a " +  total3);
    }
}
