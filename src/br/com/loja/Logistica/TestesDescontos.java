package br.com.loja.Logistica;

import br.com.loja.Logistica.desconto.CalculadoraDeDescontos;
import br.com.loja.Logistica.imposto.CalculadoraDeImpostos;
import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesDescontos {
    public static void main(String[] args) {
        Orcamento primeiro = new Orcamento(new BigDecimal("200"), 6);
        Orcamento segundo = new Orcamento(new BigDecimal("1000"), 1);

        CalculadoraDeDescontos calculadora = new CalculadoraDeDescontos();
        System.out.println(calculadora.calcular(primeiro));
        System.out.println(calculadora.calcular(segundo));



    }
}