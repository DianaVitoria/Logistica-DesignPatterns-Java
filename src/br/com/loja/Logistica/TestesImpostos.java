package br.com.loja.Logistica;

import br.com.loja.Logistica.imposto.CalculadoraDeImpostos;
import br.com.loja.Logistica.imposto.ICMS;
import br.com.loja.Logistica.imposto.ISS;
import br.com.loja.Logistica.orcamento.Orcamento;

import java.math.BigDecimal;

public class TestesImpostos {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(new BigDecimal("100"), 1);
        CalculadoraDeImpostos calculadora = new CalculadoraDeImpostos();

    }
}