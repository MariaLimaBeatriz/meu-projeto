package org.example.aula12;

import java.util.ArrayList;
import java.util.List;

//. Crie um HashSet vazio. Imprima o isEmpty(). Adicione um valor e
//   imprima o isEmpty() de novo.
public class HashS4 {
    static void main() {

        ArrayList<String> nomes = new ArrayList<>();
        nomes.addAll(List.of());
        System.out.println(nomes.isEmpty());

        nomes.addAll(List.of("Bia"));
        System.out.println(nomes.isEmpty());
    }
}
