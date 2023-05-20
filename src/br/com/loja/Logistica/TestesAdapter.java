package br.com.loja.Logistica;

import br.com.loja.Logistica.http.JavaHttpClient;
import br.com.loja.Logistica.orcamento.Orcamento;
import br.com.loja.Logistica.orcamento.RegistroOrcamento;

import java.math.BigDecimal;

public class TestesAdapter {
    public static void main(String[] args) {
        Orcamento orcamento = new Orcamento(BigDecimal.TEN,1);
        orcamento.aprovar();
        orcamento.finalizar();
        RegistroOrcamento registro = new RegistroOrcamento(new JavaHttpClient());
        registro.registrar(orcamento);
    }
}
