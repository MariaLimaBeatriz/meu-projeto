package org.example.aula12;
//1. Crie uma fila e coloque três pessoas nela com add. Imprima a fila
//   e quantas pessoas tem.
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Arrayd {

    static void main() {

    //ArrayDeque é utilizado para "gerenciar" filas, conseguir remover itens da fila.
        ArrayDeque<String> fila = new ArrayDeque<>();
        fila.add("Bia");
        fila.add("Ana");
        fila.add("Clara");
        System.out.println(fila);

        //System.out.println(fila.peek()); // imprimir a primeira posição da fila
        //System.out.println(fila.poll()); // remover a proxima da fila.
        //System.out.println(fila);
    }
}
