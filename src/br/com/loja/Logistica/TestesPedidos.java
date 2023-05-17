package br.com.loja.Logistica;

import br.com.loja.Logistica.pedido.GeraPedidoHandler;
import br.com.loja.Logistica.pedido.GeradorDePedidos;

import java.math.BigDecimal;
//represetação básica de interface
public class TestesPedidos {
    public static void main(String[] args) {
        String cliente = args[0];
        BigDecimal valorOrcamento = new BigDecimal(args[1]);
        int quantidadeItens = Integer.parseInt(args[2]);

        GeradorDePedidos gerador = new GeradorDePedidos(cliente, valorOrcamento,
                quantidadeItens);
        gerador.executa();
        GeraPedidoHandler handler = new GeraPedidoHandler(/*dependecias*/);
        handler.execute(gerador);



    }
}
