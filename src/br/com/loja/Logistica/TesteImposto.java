package br.com.loja.Logistica;

import br.com.loja.Logistica.imposto.CalculadoraDeImpostos;
import br.com.loja.Logistica.imposto.ISS;
import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public class TesteImposto {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

        System.out.println(calculadora.calcular(orcamento, new ISS(null)));
    }
}
