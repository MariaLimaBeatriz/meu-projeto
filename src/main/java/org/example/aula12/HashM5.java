package org.example.aula12;

import java.util.HashMap;

//Crie um HashMap de estoque (produto -> quantidade) com dois itens.
//   Use getOrDefault para mostrar a quantidade de um produto que existe
//   e de um que não existe (devolvendo 0). Depois tente com get normal
//   no que não existe e compare.
public class HashM5 {

    static void main() {
        HashMap<String, Integer> estoque = new HashMap<>();

        estoque.put("Cafe", 4);
        estoque.put("Arroz", 5);

        estoque.getOrDefault("Cafe", 0);
        System.out.println("A quantide do cafe: "+ estoque.getOrDefault("Café", 4));
        System.out.println("A quantidade do feijao: " + estoque.getOrDefault("feijao", 0));
    }
}
