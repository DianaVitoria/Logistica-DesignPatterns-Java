package br.com.loja.Logistica;

import br.com.loja.Logistica.pedido.GeraPedidoHandler;
import br.com.loja.Logistica.pedido.GeradorDePedidos;
import br.com.loja.Logistica.pedido.acao.EnviarEmailPedido;
import br.com.loja.Logistica.pedido.acao.SalvarPedidoBC;


import java.math.BigDecimal;
import java.util.Arrays;

//represetação básica de interface
public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = "Ana";
        BigDecimal valorOrcamento = new BigDecimal("300");
        int quantidadeItens = Integer.parseInt("2");

        GeradorDePedidos gerador = new GeradorDePedidos(cliente, valorOrcamento,
                quantidadeItens);

        GeraPedidoHandler handler = new GeraPedidoHandler(
                Arrays.asList(new SalvarPedidoBC(), new EnviarEmailPedido()));
        handler.execute(gerador);



    }
}
