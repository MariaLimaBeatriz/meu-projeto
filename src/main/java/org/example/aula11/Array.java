package org.example.aula11;

import java.util.ArrayList;
import java.util.List;


public class Array {
    static void main() {
     // Intenger - int
        ArrayList<Integer> lista = new ArrayList<>();

        lista.addAll(List.of(1,5,10,30,70)); // utilizado para mostrar a lista toda e não precisar colocar 1 por 1.
        System.out.println(lista);
        lista.remove(3); // remove a posição da lista.
        System.out.println(lista);
        System.out.println(lista.get(1)); // utilizado para pegar a posição e printar no terminar.
        lista.set(0,40); // usado para trocar a posição, primeiro coloco a posição e depois o número que quero trocar
        System.out.println(lista);
        System.out.println(lista.size()); // usado para informar sobre o tamanho da lista
        System.out.println(lista.contains(10)); // usado para verificar se contem um item na lista (true/false)
        System.out.println(lista.indexOf(70)); // usado para mostrar em qual posição está o valor que vocr colocou
    }

}
