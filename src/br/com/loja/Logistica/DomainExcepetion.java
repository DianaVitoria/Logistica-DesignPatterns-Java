package br.com.loja.Logistica;

public class DomainExcepetion extends RuntimeException {
    public DomainExcepetion(String mensagem) {
        super(mensagem);
    }
}
