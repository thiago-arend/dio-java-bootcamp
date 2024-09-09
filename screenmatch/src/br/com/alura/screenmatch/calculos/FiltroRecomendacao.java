package br.com.alura.screenmatch.calculos;

public class FiltroRecomendacao {
    public void filtra(Classificavel classificavel) {
        int classificacao = classificavel.getClassificacao();

        if (classificacao >= 4) {
            System.out.println("Está entre os preferidos do momento.");
        } else if (classificacao >= 2) {
            System.out.println("Muito bem avaliado no momento.");
        } else {
            System.out.println("Coloque na sua lista para assistir depois.");
        }
    }
}
