package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

// - Crie uma lista vazia de nomes. Adicione três nomes e imprima a lista inteira.
public class Array1 {
    static void main() {

        ArrayList<String>lista = new ArrayList<>();

        lista.addAll(List.of("Bia", "Maria", "Carlos"));
        System.out.println(lista);


    }
}
