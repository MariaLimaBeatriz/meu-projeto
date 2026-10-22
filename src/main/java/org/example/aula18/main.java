package org.example.aula18;
//    c) Mel, banho, 16h, só com hidratação, sem observação,
//      sem desconto
public class main {
    static void main() {

        Agendamento petA = new Agendamento("Thor", "banho", "14h", true, true, "Alergico a Shampoo", 10.0);


    Agendamento petB = new Agendamento("Luna", "tosa", "10h", false, false, "Sem obs", 0.0);

    Agendamento petC = new Agendamento("Mel", "Banho", "16h", true, false, "sem obs", 0.0);
        System.out.println(petA.mostrar());
        System.out.println(petB.mostrar());
        System.out.println(petC.mostrar());


}




}
