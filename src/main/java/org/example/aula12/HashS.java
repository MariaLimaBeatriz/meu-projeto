package org.example.aula12;

import java.util.HashSet;
import java.util.List;

public class HashS {

    static void main() {

        //1. Crie um HashSet de nomes e adicione quatro valores, sendo um deles
        //   repetido. Imprima o conjunto e o tamanho. Repare no que aconteceu
        //   com o repetido.
        HashSet<String> nome = new HashSet<>();

        nome.addAll(List.of(" Bia", "Ana", "Clara", "Ana"));
        System.out.println(nome);
        System.out.println(nome.size());

    }
}
