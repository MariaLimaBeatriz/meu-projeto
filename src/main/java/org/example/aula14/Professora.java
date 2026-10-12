package org.example.aula14;

public class Professora extends Pessoa{

    String disciplina;
    public void lancarNotas(String nomeAluna, double notas) {
        System.out.printf("%s lançou nota %.1f para %s\n", this.nome, notas, nomeAluna);
    }

    static void main() {

        Professora flora = new Professora();

        flora.nome = "Flora";
        flora.idade = 33;
        flora.apresentar("Flora", 33);
        flora.lancarNotas("ANA", 10);
    }
}
