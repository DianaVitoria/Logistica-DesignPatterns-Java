package br.com.loja.Logistica.orcamento.situacao;

import br.com.loja.Logistica.DomainExcepetion;
import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public class Aprovado extends SituacoOrcamento {

    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
       return orcamento.getValor().multiply(new BigDecimal("0.02"));
    }

    @Override
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }
}
