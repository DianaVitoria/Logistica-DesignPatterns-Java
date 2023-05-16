package br.com.loja.Logistica.imposto;

import java.math.BigDecimal;

import br.com.loja.Logistica.Orcamento;

public interface Imposto {

    BigDecimal calcular(Orcamento orcamento);

}