package org.example.aula13;

public class Cachorro implements Animal {
    public void emitirSom() {
        System.out.println("au au");
    }

     static void main() {
         Cachorro meuCachorro = new Cachorro();
         meuCachorro.emitirSom();
    }}