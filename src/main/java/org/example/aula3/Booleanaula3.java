package org.example.aula3;
// Atividade 4
public class Booleanaula3 {
    static void main() {

        int idade = 17;
        boolean temAutorizacao = true;

        if(idade >= 18 || temAutorizacao) {
            System.out.println("Entrada liberada!");
        } else
            System.out.println("entrada negada!");
    }
}
