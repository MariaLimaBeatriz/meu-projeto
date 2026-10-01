package org.example.aula3;
 // atividade 2
public class Attaula3 {

 static void main() {

     double saldoDaConta = 500.00;
     double valorDaCompra = 320.00;

     if (saldoDaConta >= valorDaCompra) {
         System.out.println(" Compra aprovada! " + (saldoDaConta - valorDaCompra) + " de saldo restante ");
     } else if (saldoDaConta < valorDaCompra) {
         System.out.println("Saldo insuficiente!" + (saldoDaConta - valorDaCompra) + " está faltando ");
     }
 }
}
