import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Filme meuFilme = new Filme("O poderoso chefão", 19770);
        meuFilme.setDuracaoEmMinutos(180);
        System.out.println("Duração do Filme: " + meuFilme.getDuracaoEmMinutos());

        meuFilme.exibeFichaTecnica();

        meuFilme.avalia(8);
        meuFilme.avalia(5);
        meuFilme.avalia(10);

        System.out.println("total de avaliações: " + meuFilme.getTotalAvaliacoes());
        System.out.println(meuFilme.pegaMedia());

        Serie lost = new Serie("Lost", 2019);
        lost.exibeFichaTecnica();
        lost.setTemporadas(10);
        lost.setEpisodiosPorTemporadas(10);
        lost.setMinutosPorEpisodio(50);
        System.out.println("Duração para maratonar Lost: " + lost.getDuracaoEmMinutos());


        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.setDuracaoEmMinutos(200);

        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui((lost));
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtra(meuFilme);

        Episodio episodio = new Episodio();
        episodio.setNumero(1);
        episodio.setSerie(lost);
        episodio.setTotalVisualizacoes(300);
        filtro.filtra(episodio);


        /* Podemos inicilizar uma variável com a funcionalidade var antes do nome da variável. O compilador insere
           automaticamente o tipo de variável com base no valor atribuído a ela, podendo tornar o código mais limpo
           e legível. Porém, a utilização da decração de uma variável dessa forma possui algumas limitações.

           1- Impossibilitando a criação da variável sem o seu tipo e obrigatoriamente temos que colocar um valor
           inicial. */
        
        var maisUmFilme = new Filme("Dogville", 2003);
        maisUmFilme.setDuracaoEmMinutos(200);
        maisUmFilme.avalia(10);


        // Utilizando conceitos de Arraylist
        ArrayList<Filme> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(maisUmFilme);
        listaDeFilmes.add(meuFilme);
        listaDeFilmes.add(outroFilme);

        // Para obtermos o tamanho da lista podemos utilizar o método size()
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println(listaDeFilmes);



    }
}
