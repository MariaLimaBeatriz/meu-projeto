package org.example.aula12;

import java.util.HashMap;

// Crie um HashMap de produtos e preços. Coloque "café" com valor 5.00,
//   imprima, e depois faça put de "café" DE NOVO com valor 7.50.
//   Imprima outra vez e veja o que aconteceu com o tamanho.
public class HashM2 {
    static void main() {

        HashMap<String, Double> catalogo = new HashMap<>();

        catalogo.put("Cafe", 5.00);
        System.out.println(catalogo.get("Cafe"));
        catalogo.put("Cafe", 7.50);
        System.out.println(catalogo.get("Cafe"));
        System.out.println(catalogo.size());




    }
}
