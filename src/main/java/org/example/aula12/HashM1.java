package org.example.aula12;

import java.util.HashMap;

//1. Crie um HashMap de nomes e idades com três pessoas. Imprima o mapa
//   inteiro e depois use get para mostrar a idade de uma delas.
public class HashM1 {
    static void main() {
        HashMap<String, Integer> cadastro = new HashMap<>();

        cadastro.put("Bia", 15);
        cadastro.put("Ana", 25);
        cadastro.put("Caio", 40);
        System.out.println(cadastro);
        System.out.println(cadastro.get("Bia") + "  é a idade de Bia");
        System.out.println(cadastro.get("Ana") + " é a idade de Ana ");
        System.out.println(cadastro.get("Caio") + "  é a idade de Caio");

    }
}
