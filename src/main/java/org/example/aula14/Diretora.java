package org.example.aula14;

public class Diretora extends Gerente {

    public void definirMeta(String meta) {
        System.out.println(nome + " Definiou a meta como " + meta);

    }

    static void main() {

        Diretora carla = new Diretora();

        carla.nome = "Carla";
        carla.baterPonto();
        carla.definirMeta("Vender curso ");
        carla.aprovarFerias("Luis ");

    }
}
