package org.example.aula16;

public class Singleton1 {
    //1. O que o padrão Singleton garante?
    //a) Que a classe tenha vários construtores
    //b)x Que exista apenas um objeto da classe no programa
    //c) Que a classe não tenha atributos
    //d) Que a classe possa ser herdada

    // 2. Por que o construtor de um Singleton é private?
    // o private garante que tenha apenas uma cópia daquele obejeto.

    // 3. Complete a lacuna:
    //
    //java
    //private __static____ Configuracao instancia;
    //a) final
    //b) public
    //c) static
    //d) void

    // 4. O que acontece se alguém tentar escrever isto fora da classe?
    //java
    //Configuracao c = new Configuracao();
    // apresentará erro de compilação, pois o private irá garantir que outras classes não criem o mesmo objeto.

    /*5. Qual é a forma correta de obter o objeto de um Singleton chamado Configuracao?
    a) new Configuracao()
    b) Configuracao.getInstancia() x
    c) Configuracao.instancia
    /*d) this.getInstancia()
}
     */
}
