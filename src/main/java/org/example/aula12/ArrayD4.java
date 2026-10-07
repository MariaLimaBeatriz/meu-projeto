package org.example.aula12;

import java.util.ArrayDeque;

public class ArrayD4 {
    static void main() {

        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Bia");
        fila.add("Ana");
        fila.add("Clara");

        while (!fila.isEmpty()) {

            String proximoCliente = fila.poll();
            System.out.println("Atendendo: " + proximoCliente);
        }
            System.out.println("Fila vazia!");

        }
    }

