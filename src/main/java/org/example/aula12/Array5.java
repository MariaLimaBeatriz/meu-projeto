package org.example.aula12;

import java.util.ArrayDeque;

public class Array5 {
    static void main() {
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Bia");
        fila.add("Ana");
        fila.add("Clara");

        if (fila.contains("Bia")) {

            System.out.println("O nome Bia está na lista!");

        } else {
            System.out.println(" o nome bia não está na lista!");
        }

        if (fila.contains("Zoe")) {

            System.out.println("O nome Zoe está na lista!");
        } else {


            System.out.println("O nome Zoe não está na lista");
        }

    }
}
