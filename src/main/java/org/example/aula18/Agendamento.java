package org.example.aula18;


public class Agendamento {
    String nomePet;
    String servico;
    String horario;
    boolean perfume;
    boolean laco;
    String obervacao;
    double desconto;

    public Agendamento(String nomePet, String servico, String horario, boolean perfume, boolean laco, String obervacao, double desconto) {
        this.nomePet = nomePet;
        this.servico = servico;
        this.horario = horario;
        this.perfume = perfume;
        this.laco = laco;
        this.obervacao = obervacao;
        this.desconto = desconto;
    }

    public String mostrar() {

        System.out.println("Pet " + nomePet);
        System.out.println("Serviço " + servico);
        System.out.println("Horario " + horario);
        System.out.println("Perfume: " + (perfume ? "Sim" : "Não"));
        System.out.println("laço: " + (laco ? " Sim " : " Não "));
        System.out.println(" Obeservacao " + obervacao);
        System.out.println(" O desconto é de: " + desconto + "%");

     return "";
    }
}
