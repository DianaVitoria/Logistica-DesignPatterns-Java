package br.com.loja.Logistica.desconto;

import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public class DescontoComValorMaiorQueQuinhetos extends Desconto {
    public DescontoComValorMaiorQueQuinhetos(Desconto proximo) {
        super(proximo);
    }

    public BigDecimal calcular(Orcamento orcamento){
            if (orcamento.getValor().compareTo(new BigDecimal("500")) > 0) {
                return orcamento.getValor().multiply(new BigDecimal("0.05"));
            }
            return proximo.calcular(orcamento);
        }

}

