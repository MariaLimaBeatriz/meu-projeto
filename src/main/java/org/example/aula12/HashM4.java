package org.example.aula12;

import java.util.HashMap;

//5. Crie um HashMap de notas com três alunas. Imprima o mapa e o tamanho.
//   Remova uma delas e imprima de novo.
public class HashM4 {

    static void main() {

        HashMap<String, Double> notas = new HashMap<>();

        notas.put("Clara", 10.5);
        notas.put("Caio", 8.5);
        notas.put("Julia", 5.6);

        System.out.println(notas);
        System.out.println(notas.size());
        notas.remove("Caio");
        System.out.println(notas);
    }
}
