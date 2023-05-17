package br.com.loja.Logistica.pedido;

import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class GeraPedidoHandler {


    //contrutor com injeção de dependencias: repository, service. etc;

    public void execute(GeradorDePedidos dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),
                dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(),
                LocalDateTime.now(), orcamento);

        System.out.println("Salvar pedido no Banco de dados.");
        System.out.println("Enviar email com dados do novo pedido");

    }

}
