package org.example.aula12;

import java.util.HashMap;

public class HashM {

    static void main() {
    // Recebe dois valores, o primeiro acesso o valor do segundo.
        HashMap<String, String> emails = new HashMap<>();

        emails.put("Bia", "maria@gmail.com"); // Bia seria a minha chave e o valor seria o e-mail.
        System.out.println(emails.get("Bia")); // printo a chave e ele mostra no terminal o valor que seria o e-mail.
    }
}
