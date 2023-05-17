package br.com.loja.Logistica.pedido;

import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;
import java.time.LocalDateTime;


public class GeradorDePedidos {

    private String cliente;
    private BigDecimal valorOrcamento;
    private int quantidadeItens;

    //injeção de pedidos: pedidoRepository, emailService.. uso de api para o banco de dados.
    public GeradorDePedidos(String cliente, BigDecimal valorOrcamento, int quantidadeItens) {
        this.cliente = cliente;
        this.valorOrcamento = valorOrcamento;
        this.quantidadeItens = quantidadeItens;
    }

    public void executa(){


    }

    public String getCliente() {
        return cliente;
    }

    public BigDecimal getValorOrcamento() {
        return valorOrcamento;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }
}
