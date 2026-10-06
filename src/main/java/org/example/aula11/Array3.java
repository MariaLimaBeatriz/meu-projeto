package org.example.aula11;

import java.util.ArrayList;
import java.util.List;

//Crie uma lista com quatro nomes. Troque o nome da posição 2 por outro e imprima a lista antes e depois.
public class Array3 {
    static void main() {

        ArrayList<String> lista = new ArrayList<>(List.of("Bia","Carlos","Maria","Ana"));
        System.out.println(lista);
        lista.set(1,"Gabriel");
        System.out.println(lista);

    }
}
