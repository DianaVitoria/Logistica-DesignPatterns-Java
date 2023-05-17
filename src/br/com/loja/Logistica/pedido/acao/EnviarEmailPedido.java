package br.com.loja.Logistica.pedido.acao;

import br.com.loja.Logistica.pedido.Pedido;

public  class EnviarEmailPedido implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Enviando Email.");
    }


}
