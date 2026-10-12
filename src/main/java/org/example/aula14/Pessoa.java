package org.example.aula14;
//. Crie a classe Pessoa com os atributos nome e idade, e o método
//   apresentar(), que imprime "Oi, sou [nome] e tenho [idade] anos."
public class Pessoa {
    public Pessoa() {

    }

    String nome;
    int idade;

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public  void  apresentar(String nome, int idade) {
        System.out.println("Olá sou " + this.nome + " e tenho " + this.idade);

    }
}
