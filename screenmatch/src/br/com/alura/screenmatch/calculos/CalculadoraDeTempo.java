package br.com.alura.screenmatch.calculos;

import br.com.alura.screenmatch.modelos.Filme;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

public class CalculadoraDeTempo {
    private int tempoTotal;

    public int getTempoTotal() {
        return tempoTotal;
    }

    // *** SOBRECARGA DE MÉTODOS ***

//    public void inclui(Filme m) {
//        tempoTotal += m.getDuracaoEmMinutos();
//    }
//
//    public void inclui(Serie s) {
//        tempoTotal += s.getDuracaoEmMinutos();
//    }


    // *** POLIMORFISMO ***

    // não sei quem vou chamar em tempo de compilação
    // em tempo de execução o titulo será resolvido em filme ou série

    public void inclui(Titulo t) {
        System.out.println("Adicionando duração em minutos de " + t);
        tempoTotal += t.getDuracaoEmMinutos();
    }
}
