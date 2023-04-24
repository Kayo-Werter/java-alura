public class Filme {
    String nome;
    int anoLancamento;
    boolean incluidoNoPlano;
    double somaDasAvaliacoes;
    int totalAvaliacoes;
    int duracaoEmMinutos;

    void exibeFichaTecnica(){
        System.out.println("Nome do Filme: " + nome);
        System.out.println("Ano de Lançamento: " + anoLancamento);
    }
    void avalia(double nota) {
        somaDasAvaliacoes += nota;
        totalAvaliacoes ++;
    }
    double pegaMedia(){
        return somaDasAvaliacoes / totalAvaliacoes;
    }

}
