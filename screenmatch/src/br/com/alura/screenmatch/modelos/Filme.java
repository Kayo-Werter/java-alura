package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
    private String diretor;

    /* Construtor da classe */
    public Filme(String nome, int anoDeLancamento){
        super(nome, anoDeLancamento);
    }

    /* Métodos */
    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificacao() {
        return (int) pegaMedia() / 2;
    }

    /* Toda classe possui herança da classe OBJECT (classe nativa do java), por isso, temos a opção de
       Sobreescrever o método toString. Assim, nossa visualização será da maneira que escolhermos para a classe em que
       estamos mudando o toString
    */
    @Override
    public String toString() {
        return "Filme: " + this.getNome() + " (" + this.getAnoLancamento() + ") ";
    }
}
