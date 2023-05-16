package br.com.loja.Logistica.orcamento.situacao;

import br.com.loja.Logistica.DomainExcepetion;
import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class SituacoOrcamento {
    public BigDecimal calcularValorDescontoExtra(Orcamento orcamento){
        return BigDecimal.ZERO;
    }

    public void aprovar(Orcamento orcamento) {
        throw new DomainExcepetion("Orçamento não pode ser aprovado");
    }
    public void reprovar(Orcamento orcamento) {
        throw new DomainExcepetion("Orçamento não pode ser reprovado");
    }
    public void finalizar(Orcamento orcamento) {
        throw new DomainExcepetion("Orçamento não pode ser finalizado");
    }
}
