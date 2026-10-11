package org.example.aula12;

import java.util.HashSet;
import java.util.List;

//5. Crie um HashSet com três frutas e percorra ele com for,
//   imprimindo uma por linha.
public class HashS3 {
    static void main() {

        HashSet<String> frutas = new HashSet<>();
        frutas.addAll(List.of("uva", "Laranja", "Banana"));

        for( String fruta : frutas) {
            System.out.println(fruta);

        }
    }
}
