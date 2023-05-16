package br.com.loja.Logistica.orcamento;

import br.com.loja.Logistica.orcamento.situacao.EmAnalise;
import br.com.loja.Logistica.orcamento.situacao.SituacoOrcamento;

import java.math.BigDecimal;

public class Orcamento {

    private BigDecimal valor;
    private int quantidadeItens;
    private SituacoOrcamento situacao;

    public Orcamento(BigDecimal valor, int quantidadeItens) {
        this.valor = valor;
        this.quantidadeItens = quantidadeItens;
        this.situacao = new EmAnalise();

    }
    public void aplicarDescontoExtra(){
        BigDecimal valorDoDescontoExtra = this.situacao.calcularValorDescontoExtra(this);
         this.valor = this.valor.subtract(valorDoDescontoExtra);
    }
    public void aprovar(){
        this.situacao.aprovar(this);
    }
    public void reprovar(){
        this.situacao.reprovar (this);
    }
    public void finalizar(){
        this.situacao.finalizar (this);
    }

    public BigDecimal getValor() {
        return valor;
    }

    public int getQuantidadeItens() {
        return quantidadeItens;
    }

    public SituacoOrcamento getSituacao() {
        return situacao;
    }

    public void setSituacao(SituacoOrcamento situacao) {
        this.situacao = situacao;
    }
}