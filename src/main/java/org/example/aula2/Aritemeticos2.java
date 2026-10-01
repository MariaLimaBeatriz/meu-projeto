package org.example.aula2;

public class Aritemeticos2 {
    // atividade 3
    static void main() {
        double numero1 = 4.5;
        double numero = 8.6;
        //atividade 3
        System.out.println("Soma " + (numero1 + numero));
        System.out.println("Subtração " + (numero1 - numero));
        System.out.println("Multiplicação " + (numero1 * numero));
        System.out.println("Divisão " + (numero1 / numero));
        System.out.println("Resto " + (numero1  % numero));

        // atividade 4
        int nota1 = 8;
        int nota2 = 6;
        int nota3 = 10;
        int soma = nota1 + nota2 + nota3;
        int media = soma / 3;

        System.out.println("Soma: " + soma);
        System.out.println("Média: " + media);
    }
}
