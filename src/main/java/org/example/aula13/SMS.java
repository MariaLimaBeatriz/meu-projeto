package org.example.aula13;

import java.util.ArrayList;

public class SMS implements Notificacao{

    public void enviar(String mensagem) {

        System.out.println("SMS enviado: " + mensagem);
    }

    static void main() {


        ArrayList<Notificacao> SMS  = new ArrayList<>();

    for (Notificacao notificacao : SMS) {
        System.out.println();
    }}}

