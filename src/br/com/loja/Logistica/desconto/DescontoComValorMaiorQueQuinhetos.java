package br.com.loja.Logistica.desconto;

import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoComValorMaiorQueQuinhetos extends Desconto {
    public DescontoComValorMaiorQueQuinhetos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal efetuarCalculo(Orcamento orcamento){
        return orcamento.getValor().multiply(new BigDecimal("0.05"));
        }

    @Override
    public boolean deveAplicar(Orcamento orcamento) {
        return orcamento.getValor().compareTo(new BigDecimal("500")) > 0;
    }

}

