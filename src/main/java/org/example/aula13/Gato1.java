package org.example.aula13;

import java.util.ArrayList;
import java.util.List;

public class Gato1 implements Animal{
    public void emitirSom() {
        System.out.println("miau");
    }



      static void main() {
          Animal bidu = new Cachorro();
          bidu.emitirSom();
          Animal salem = new Gato1();
          salem.emitirSom();

          ArrayList<Animal> animais = new ArrayList<>();
          animais.add(new Cachorro());
          animais.add(new Gato());

          for (Animal animal : animais) {
              animal.emitirSom();

}}}
