package br.com.alura.screenmatch;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;

public class PrincipalComListas {
    public static void main(String[] args) {

        /* Classe criada para fazer teste utilizando listas */
        Filme meuFilme = new Filme("O poderoso chefão", 19770);
        meuFilme.avalia(9);

        Filme outroFilme = new Filme("Avatar", 2023);
        outroFilme.avalia(6);

        var maisUmFilme = new Filme("Dogville", 2003);
        maisUmFilme.avalia(10);
        Serie lost = new Serie("Lost", 2019);

        Filme f1 = maisUmFilme;

        ArrayList<Titulo> listaDeAssistidos = new ArrayList<>();
        listaDeAssistidos.add(maisUmFilme);
        listaDeAssistidos.add(meuFilme);
        listaDeAssistidos.add(outroFilme);
        listaDeAssistidos.add(lost);


        /* Utilização do foreach para percorrer nossa lista. */
        for (Titulo item: listaDeAssistidos) {
            System.out.println(item.getNome());
            if (item instanceof Filme filme && filme.getClassificacao () > 2) {
                System.out.println("Classificação: " + filme.getClassificacao());
            }

        }
    }
}
