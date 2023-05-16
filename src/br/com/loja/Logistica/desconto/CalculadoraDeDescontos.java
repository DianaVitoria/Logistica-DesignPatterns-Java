package br.com.loja.Logistica.desconto;

import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public class CalculadoraDeDescontos  {

    public BigDecimal calcular(Orcamento orcamento){
    Desconto cadeiaDeDesconto = new DescontoMaisDeCincoItens
            (new DescontoComValorMaiorQueQuinhetos( new SemDesconto()));

    return cadeiaDeDesconto.calcular(orcamento);
    }
}
