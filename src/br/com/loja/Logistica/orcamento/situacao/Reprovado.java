package br.com.loja.Logistica.orcamento.situacao;

import br.com.loja.Logistica.orcamento.Orcamento;

public class Reprovado extends SituacoOrcamento {
    public void finalizar(Orcamento orcamento) {
        orcamento.setSituacao(new Finalizado());
    }

}
