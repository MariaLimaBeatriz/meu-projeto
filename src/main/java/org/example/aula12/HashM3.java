package org.example.aula12;

import java.util.HashMap;

//3. Crie uma agenda (nome -> telefone) com duas pessoas. Use containsKey
//   dentro de um if para mostrar o telefone de alguém que está na agenda
//   e de alguém que não está.
public class HashM3 {
    static void main() {

        HashMap<String, Integer> agenda = new HashMap<>();
        agenda.put("Ana", 729976546);
        agenda.put("Caio", 659354237);

        if (agenda.containsKey(729976546)) {
            System.out.println("Esse numero é Ana");
        } else {
            System.out.println(867463929);
            System.out.println(" Esse numero não está na lista");
        }



    }
}
