package org.example.aula10;

public class Excessoes4 {
    static void main() {
        String nome = null;

        try {
            System.out.println(nome.length());
        }
        catch (NullPointerException e) {
            System.out.println(" nome não preenchido");

    }
}}
