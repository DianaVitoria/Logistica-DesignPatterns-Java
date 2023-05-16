package br.com.loja.Logistica.imposto;

import java.math.BigDecimal;

import br.com.loja.Logistica.Orcamento;

public class ISS {

    public BigDecimal calcular(Orcamento orcamento) {
        return orcamento.getValor().multiply(new BigDecimal("0.06"));
    }

}