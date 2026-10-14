package org.example.aula15;
//  Crie a classe ContaBancaria com os atributos titular (String) e
//   saldo (double), os DOIS private.
//
//   Na Main, crie uma conta e tente fazer estas duas linhas:
//
//   System.out.println(c.titular);
//   c.saldo = -5000;
public class ContaBancaria {

    private String titular;
    private double saldo;
    private String numeroConta = "001-X";

    public String getNumeroConta() {
        return numeroConta;
    }

    public void setTitular(String titular) {
        if (titular == null||titular.isEmpty()){
            System.out.println("Inválido! Mantido " + this.titular);
            return;
        }


        this.titular = titular;
    }

    public double getSaldo() {
        return saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void Depositar(double valor){
        if (valor > 0) {
            System.out.println("Valor depositado com sucesso");
        } else {
            System.out.println(" Valor depositado deve ser maior que zero");
        }
    }

    public void sacar(double valor){
        if (valor > saldo) {
            System.out.println("Saldo insuficente");
        } else {
            System.out.println("Saque realizado com sucesso");
        }
    }

    private void temSaldo(double valor) {

    }
}
