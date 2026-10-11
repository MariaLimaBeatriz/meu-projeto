package org.example.aula13;

import java.util.ArrayList;
import java.util.List;

//. Crie um ArrayList com 5 notas e imprima todas usando for-each.
public class ForAtt2 {

    static void main() {
        ArrayList<Double> lista = new ArrayList<>();

        lista.addAll(List.of(5.5, 8.5, 4.5, 7.5,6.5));

        for( Double nota : lista) {
        }
        System.out.println(lista);

    }
}
