package br.com.loja.Logistica.pedido;

import br.com.loja.Logistica.orcamento.Orcamento;
import br.com.loja.Logistica.pedido.acao.AcaoAposGerarPedido;
import br.com.loja.Logistica.pedido.acao.EnviarEmailPedido;
import br.com.loja.Logistica.pedido.acao.SalvarPedidoBC;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

public class GeraPedidoHandler {

    private List<AcaoAposGerarPedido> acoes;

    public GeraPedidoHandler(List<AcaoAposGerarPedido> acoes) {
        this.acoes = acoes;
    }

    //contrutor com injeção de dependencias: repository, service. etc;

    public void execute(GeradorDePedidos dados){
        Orcamento orcamento = new Orcamento(dados.getValorOrcamento(),
                dados.getQuantidadeItens());

        Pedido pedido = new Pedido(dados.getCliente(),
                LocalDateTime.now(), orcamento);

        acoes.forEach(a -> a.executarAcao(pedido));

    }

}
