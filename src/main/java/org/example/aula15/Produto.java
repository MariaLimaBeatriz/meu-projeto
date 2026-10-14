package org.example.aula15;

public class Produto {

    private String codigoInterno = "X-99";
    String nome = "Caneta";
    public double preco = 5.50;

    private void setCodigoInterno(String codigoInterno) {
        this.codigoInterno = codigoInterno;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    private String getCodigoInterno() {
        return codigoInterno;
    }

    public String getNome() {
        return nome;
    }

    public double getPreco() {
        return preco;
    }
}
