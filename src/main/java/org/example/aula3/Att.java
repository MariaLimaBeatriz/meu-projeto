package org.example.aula3;

public class Att {
    static void main() {
        //3 — Crie uma variável opcao com um número de 1 a 4 e, usando switch, mostre o pedido escolhido no cardápio: 1 é Café, 2 é Cappuccino, 3 é Chocolate quente e 4 é Chá. Qualquer outro número mostra "Opção inválida".
           // ATIVIDADE 3
       int opcao = 3;

       switch (opcao){
           case 1:
               System.out.println("cafe");
               break;
           case 2:
               System.out.println("cappucino");
               break;
           case 3:
               System.out.println("chocolate");
               break;
           case 4:
               System.out.println("cha");
               break;
           default:
               System.out.println("opcao invalida");

       }

    }
}
