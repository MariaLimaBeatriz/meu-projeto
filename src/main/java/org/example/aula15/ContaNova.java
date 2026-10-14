package org.example.aula15;

public class ContaNova {
    static void main() {


        ContaBancaria conta1 = new ContaBancaria();

        System.out.println(conta1.getTitular());
        System.out.println(conta1.getSaldo());

        conta1.setTitular("Ana");
        System.out.println(conta1.getTitular());
        conta1.setTitular("");
        System.out.println(conta1.getTitular());

        conta1.getNumeroConta();
        System.out.println("numero da conta é: " + conta1.getNumeroConta());
    }
}
