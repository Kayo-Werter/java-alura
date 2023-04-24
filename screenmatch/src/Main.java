import br.com.alura.screenmatch.modelos.Filme;

public class Main {
    public static void main(String[] args) {
        int valor = 555;
        Filme meuFilme = new Filme();
        meuFilme.setNome("O poderoso chefãoo");
        meuFilme.setAnoLancamento(1970);
        meuFilme.setDuracaoEmMinutos(180);

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());



    }
}
