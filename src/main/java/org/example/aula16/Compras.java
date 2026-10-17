package org.example.aula16;

public class Compras {
    static void main() {
        Carrinho telaProdutos = Carrinho.getInstance();
        Carrinho  telaPromocoes = Carrinho.getInstance();
        telaPromocoes.adicionarItem();
        telaProdutos.adicionarItem();
        telaPromocoes.adicionarItem();
        telaProdutos.adicionarItem();

        System.out.println(" Itens no carrinho " + Carrinho.getInstance().getQuantidadeItens());
    }
}
