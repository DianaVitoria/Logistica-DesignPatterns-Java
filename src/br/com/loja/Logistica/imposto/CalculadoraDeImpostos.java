package br.com.loja.Logistica.imposto;

import java.math.BigDecimal;

import br.com.loja.Logistica.orcamento.Orcamento;

public class CalculadoraDeImpostos {

    public BigDecimal calcular(Orcamento orcamento, Imposto imposto) {
        return imposto.calcular(orcamento);
    }

}