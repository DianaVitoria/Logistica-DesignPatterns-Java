package br.com.loja.Logistica.desconto;

import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public abstract class Desconto {

    protected Desconto proximo;

    public Desconto(Desconto proximo) {
        this.proximo = proximo;
    }

    public abstract BigDecimal calcular(Orcamento orcamento);
}
