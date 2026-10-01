package org.example.aula3;
// atividade 1SS
public class Atividadeaula3 {
    static void main() {

        int idade = 20;

        if(idade <= 13) {
            System.out.println("crianca");
        } else if (idade > 13 && idade <= 17) {
            System.out.println("adolescente");
        } else if (idade >= 18 && idade <= 59){
            System.out.println("adulto");
        } else {
            System.out.println("idoso");
        }
    }
}
