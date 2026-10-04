package org.example.aula10;

import java.util.Scanner;

public class Excessoes2 {
    static void main() {

        Scanner scanner = new Scanner(System.in);
        int[] notas = {1, 2, 3, 4, 5};
        System.out.println("Temos 5 posições de notas, escolha uma posição ");


      try {
        int posicao = scanner.nextInt();
        System.out.println("A nota da sua posicação é: " + notas[posicao]);

    } catch (ArrayIndexOutOfBoundsException e) {
        System.out.println(" As posições são apenas de 0 a 4!");
    }
      finally{
          scanner.close();
    }}}


