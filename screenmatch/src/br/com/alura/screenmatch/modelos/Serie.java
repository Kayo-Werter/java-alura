package br.com.alura.screenmatch.modelos;

public class Serie extends Titulo {
    private int temporadas;
    private boolean ativa;
    private int epsodiosPorTemporadas;
    private int minutosPorEpsodio;

    public int getTemporadas() {
        return temporadas;
    }

    public void setTemporadas(int temporadas) {
        this.temporadas = temporadas;
    }

    public boolean isAtiva() {
        return ativa;
    }

    public void setAtiva(boolean ativa) {
        this.ativa = ativa;
    }

    public int getEpsodiosPorTemporadas() {
        return epsodiosPorTemporadas;
    }

    public void setEpsodiosPorTemporadas(int epsodiosPorTemporadas) {
        this.epsodiosPorTemporadas = epsodiosPorTemporadas;
    }

    public int getMinutosPorEpsodio() {
        return minutosPorEpsodio;
    }

    public void setMinutosPorEpsodio(int minutosPorEpsodio) {
        this.minutosPorEpsodio = minutosPorEpsodio;
    }
}
