package org.example.aula13;

public class Gato implements Animal{
    static void main() {
        Animal bidu = new Cachorro();
        Animal salem= new Gato();

    }

    @Override
    public void emitirSom() {
        System.out.println("Miau");
    }
}
