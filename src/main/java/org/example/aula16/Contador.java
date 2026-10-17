package org.example.aula16;

public class Contador {
    static void main() {

        ContadorVisitas pagina1 = ContadorVisitas.getInstance();
        ContadorVisitas pagina2 = ContadorVisitas.getInstance();
        pagina1.RegistrarVisita();
        pagina2.RegistrarVisita();
        pagina1.RegistrarVisita();
        System.out.println(" A quantidade de paginas é: " + pagina1.getTotal());
    }
}
