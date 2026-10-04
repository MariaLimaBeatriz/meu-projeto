package org.example.aula10;

import java.util.Scanner;

public class excessoes6 {
    static void main() {
        String[] nome = {"bia", "maria", "joao", "carlos", "jose"};
    try {
        System.out.println(" o nome da posição 5 é: " + nome[5]);
    }catch (ArrayIndexOutOfBoundsException e) {
        System.out.println("a posição 5 não existe!");
    }}}