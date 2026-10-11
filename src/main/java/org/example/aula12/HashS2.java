package org.example.aula12;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

//Crie um ArrayList com nomes repetidos. Use new HashSet<>(lista) para
//   tirar os repetidos. Imprima os dois e compare.
public class HashS2 {
    static void main() {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.addAll(List.of("Ana", "Clara", "Ana", "Luiza", "Clara"));
        System.out.println(nomes);
        HashSet<String> lista = new HashSet<>();
        lista.addAll(List.of("Ana", "Clara", "Ana", "Luiza", "Clara"));
        System.out.println(lista);

    }
}
