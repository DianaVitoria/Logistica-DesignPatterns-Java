package br.com.loja.Logistica.pedido.acao;

import br.com.loja.Logistica.pedido.Pedido;

public class SalvarPedidoBC implements AcaoAposGerarPedido {

    public void executarAcao(Pedido pedido){
        System.out.println("Salvando pedido no Banco de Dados.");
    }

}
