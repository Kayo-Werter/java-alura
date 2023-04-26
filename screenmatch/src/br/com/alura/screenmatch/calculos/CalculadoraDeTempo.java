package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return this.tempoTotal;
    }

    /* Nesse método utilizamos o polimorfismo, isso nos permite fazer referência a qualquer objeto do tipo titulo*/
    public void inclui(Titulo titulo) {
        System.out.println("Adicionando duração em minutos de: " + titulo);
        this.tempoTotal += titulo.getDuracaoEmMinutos();
    }
}
