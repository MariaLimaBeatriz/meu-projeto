package org.example.aula12;

import java.util.HashSet;
import java.util.List;

//2. Crie um HashSet de cores usando addAll. Depois use contains dentro
//   de um if para avisar se a cor "verde" já está no conjunto ou não.
public class HashS1 {
    static void main() {

        HashSet<String> cores = new HashSet<>();

        cores.addAll(List.of("Verde", "Azul", "Rosa", "Amarelo"));

        if (cores.contains("Verde")) {
            System.out.println(" Tem a cor verde");
        } else {
            System.out.println("Não tem a cor verde");
        }

    }
}
