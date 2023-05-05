package br.com.alura.screenmatch.modelos;

public class Titulo implements Comparable<Titulo>{
    private String nome;
    private int anoLancamento;
    private boolean incluidoNoPlano;
    private double somaDasAvaliacoes;
    private int totalAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoLancamento) {
        this.nome = nome;
        this.anoLancamento = anoLancamento;
    }

    public void setNome(String nome) {

        this.nome = nome;
    }

    public void setAnoLancamento(int anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public void setIncluidoNoPlano(boolean incluidoNoPlano) {
        this.incluidoNoPlano = incluidoNoPlano;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public String getNome() {
        return nome;
    }

    public int getAnoLancamento() {
        return anoLancamento;
    }

    public boolean isIncluidoNoPlano() {
        return incluidoNoPlano;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public int getTotalAvaliacoes(){
        return totalAvaliacoes;
    }
    public void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + this.nome);
        System.out.println("Ano de Lançamento: " + this.anoLancamento);
    }
    public void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes ++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

    /* Para fazer a ordenação de uma lista com vários títulos é necessário implementar a interface "comparable".
        Ela nos auxilia comparando os títulos e assim possibilitando a ordenação em uma lista. */
    @Override
    public int compareTo(Titulo outroTitulo) {
        return this.getNome().compareTo(outroTitulo.getNome());
    }
}
