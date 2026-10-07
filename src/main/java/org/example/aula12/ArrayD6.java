package org.example.aula12;

import java.util.ArrayDeque;

public class ArrayD6 {

    static void main() {
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Clara");

        if (fila.isEmpty()) {

            System.out.println("não tem ninguém na fila!");
        } else {

            System.out.println(" Próximo da fila " + fila.peek());
            
        }
    }
}
