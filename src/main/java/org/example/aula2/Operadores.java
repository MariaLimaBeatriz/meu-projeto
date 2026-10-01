package org.example.aula2;
public class Operadores {
    static void main() {
        // Caso3
        int a = 5;
        int b = 5;

        if (a==b) {
            System.out.println("nota a E b igual");
        } else if(a != b) {
            System.out.println("nota a e b diferentes");
        } else {
            System.out.println("invalido");
        }


        if(a > b){
            System.out.println("nota a Eh maior que b");
        } else if(a<b){
            System.out.println("nota a Eh menor que b");
        } else{
            System.out.println("invalido");
        }

    }
}
