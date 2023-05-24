package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.*;

public class PrincipalComListas {
    public static void main(String[] args) {

        /* Classe criada para fazer teste utilizando listas */
        Filme meuFilme = new Filme("O poderoso chefão", 1970);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var maisUmFilme = new Filme("Dogville", 2003);
        maisUmFilme.avalia(10);
        Serie lost = new Serie("Lost", 2000);

        Filme f1 = maisUmFilme;

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(maisUmFilme);
        lista.add(meuFilme);
        lista.add(outroFilme);
        lista.add(lost);


        /* Utilização do foreach para percorrer nossa lista. */
        for (Titulo item: lista) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao() > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }
        }

        /* Criando, adicionando e ordenando uma lista.
        * Além do ArrayList existem outras classes no java que podemos utilizar para representar uma List.
        * cada um possui um comportamento diferente, a que utilizaremos em nossos códigos será de acordo com a
        * necessidade.
        * ex: LinkedList, Vector, Stack */
        List<String> buscaPorArtista = new LinkedList<>();
        buscaPorArtista.add("Adam Sandler");
        buscaPorArtista.add("Paulo Vieira");
        buscaPorArtista.add("Kayo Werter");

        /* Para ordenação de listas com tipos primitivos utilizando o Colletions.sort(NomeDaLista) */
        System.out.println("Antes da ordenação: ");
        System.out.println(buscaPorArtista);

        Collections.sort(buscaPorArtista);

        System.out.println("Depois da ordenação: ");
        System.out.println(buscaPorArtista);

        System.out.println("Lista de Títulos ordenados");
        Collections.sort(lista);
        System.out.println(lista);

        /* Utilizando o Comparator para ordenar de acordo com o ano de lançamento.*/
        lista.sort(Comparator.comparing(Titulo::getAnoLancamento));
        System.out.println("Ordenando por ano de lançamento: ");
        System.out.println(lista);
    }
}
