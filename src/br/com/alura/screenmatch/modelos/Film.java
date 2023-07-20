package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.calculos.Classificavel;

public class Film extends  Titulo implements Classificavel {
    private String diretor;


    private int TotaldeVisualizacoes;

    public Film(String nome, int anoDeLancamento) {
        super(nome, anoDeLancamento);
    }

    public int getTotaldeVisualizacoes() {
        return TotaldeVisualizacoes;
    }

    public void setTotaldeVisualizacoes(int totaldeVisualizacoes) {
        TotaldeVisualizacoes = totaldeVisualizacoes;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    @Override
    public int getClassificao() {
        if (TotaldeVisualizacoes > 100){
            return 4;
        }else{
            return 3;
        }
    }

    @Override
    public String toString() {
        return "Filme: " + getNome() + "(" + getAnoDeLancamento() + ")";
    }
}