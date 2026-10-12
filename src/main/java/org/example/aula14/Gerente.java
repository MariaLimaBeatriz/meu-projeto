package org.example.aula14;

public class Gerente extends Funcionario {


    public void baterPonto() {
        System.out.println(nome + " Bateu o ponto");
    }

    public void aprovarFerias(String quem) {
        System.out.println(nome + " aprovou ferias de: " + quem);
    }
}
