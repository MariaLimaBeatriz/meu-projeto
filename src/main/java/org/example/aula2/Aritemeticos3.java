package org.example.aula2;

public class Aritemeticos3 {
    static void main() {
        // atividade 5
        int a = 3;
        int b = 4;
        int c = 5;

        int operacao = a + b * c;
        System.out.println(" resultado " + operacao);

        // atividade 6

        int resultado = (a + b) * c;
        System.out.println(" resultado " + resultado);
        // obs: estava dando erro, percebi que estava usando as mesma variaveis dentro do mesmo main().

        // DESAFIO
        int segundos = 3785;

        System.out.println("Minutos inteiros: " + (segundos / 60) + " eh sobram: " + (segundos % 60));

    }
}
