package br.com.loja.Logistica.orcamento;

import br.com.loja.Logistica.DomainExcepetion;
import br.com.loja.Logistica.http.HttpAdapter;

import java.util.Map;
import java.util.Objects;

public class RegistroOrcamento {

    private HttpAdapter http;

    public RegistroOrcamento(HttpAdapter http) {
        this.http = http;
    }

    public void registrar (Orcamento orcamento){
        if (!orcamento.isFinalizado()){
            throw new DomainExcepetion("Orçamento não finalizado!");

        }

        String url = "http://";
        Map<String, Object> dados = Map.of("valor", orcamento.getValor(),
                "quantidadedeItem", orcamento.getQuantidadeItens());


        http.post(url, dados);
    }
}
