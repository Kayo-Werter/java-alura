package br.com.alura.screenmatch.excessao;

public class ErroDeConversaoDeAnoException extends RuntimeException {
    private String mensagem;


    public ErroDeConversaoDeAnoException(String mensagem) {
        this.mensagem = mensagem;
    }

    public String getMensagem() {
        return this.mensagem;
    }
}
