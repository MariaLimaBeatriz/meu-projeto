package org.example.aula12;

import java.util.ArrayDeque;

public class ArrayD2 {

    static void main() {
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Bia");
        fila.add("Ana");
        fila.add("Clara");

        System.out.println(fila.peek());
        System.out.println(fila);
        System.out.println(fila.poll());
        System.out.println(fila);

    }
}
