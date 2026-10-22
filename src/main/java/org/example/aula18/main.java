package org.example.aula18;
//    c) Mel, banho, 16h, só com hidratação, sem observação,
//      sem desconto
public class main {
    static void main() {

        Agendamento petA = Agendamento.builder()
                .nomePet("Thor")
                .servico("Banho")
                .horario("14h")
                .perfume(true)
                .laco(true)
                .obervacao("Alergico a Shampoo")
                .desconto(10)
                .build();
        petA.mostrar();

        System.out.println(" ---------------- próximo pet -------------");

        Agendamento petB = Agendamento.builder()

                .nomePet("Luna")
                .servico("Tosa")
                .horario("10h")
                .obervacao("sem obs")
                .perfume(false)
                .laco(false)
                .desconto(0)

                .build();

        petB.mostrar();

        System.out.println(" ---------------- próximo pet -------------");

        Agendamento petC = Agendamento.builder()

                .nomePet("Mel")
                .servico("banho")
                .horario("16h")
                .perfume(false)
                .laco(false)
                .obervacao("Sem obs")
                .desconto(0)

                .build();

        petC.mostrar();

}




}
