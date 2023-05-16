package br.com.loja.Logistica.orcamento.situacao;

import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public class EmAnalise extends SituacoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
       return orcamento.getValor().multiply(new BigDecimal("0.05"));
    }

    public void aprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Aprovado());
    }
    public void reprovar(Orcamento orcamento) {
        orcamento.setSituacao(new Reprovado());
    }

}
