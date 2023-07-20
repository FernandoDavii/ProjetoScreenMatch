package br.com.alura.screenmatch.modelos;

import br.com.alura.screenmatch.excecao.ErroDeConversaoDeAnoException;
import br.com.alura.screenmatch.principal.TituloOmdb;
import com.google.gson.annotations.SerializedName;

public class Titulo implements Comparable<Titulo> {
    private String nome;
    private boolean incluidoNoPLano;
    private int anoDeLancamento;
    private double somaDasAvaliacoes;
    private int totalDeAvaliacoes;
    private int duracaoEmMinutos;

    public Titulo(String nome, int anoDeLancamento) {
        this.nome = nome;
        this.anoDeLancamento = anoDeLancamento;
    }

    public Titulo(String nome) {
    }

    public Titulo(TituloOmdb meuTituloOmdb) throws ErroDeConversaoDeAnoException {
        this.nome = meuTituloOmdb.title();
        if (meuTituloOmdb.year().length() > 4){
            throw new ErroDeConversaoDeAnoException("Não consegui converter o ano, pois tem mais de 4 caraceres!");
        }
        this.anoDeLancamento = Integer.valueOf(meuTituloOmdb.year());
        this.duracaoEmMinutos = Integer.valueOf(meuTituloOmdb.runtime().substring(0, 2));
    }

    public void exibeFichaTecnica(){
        System.out.println("Nome do filme: " + nome);
        System.out.println("Ano de lançamento: " + anoDeLancamento);

    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIncluidoNoPLano(boolean incluidoNoPLano) {
        this.incluidoNoPLano = incluidoNoPLano;
    }

    public void setAnoDeLancamento(int anoDeLancamento) {
        this.anoDeLancamento = anoDeLancamento;
    }

    public void setDuracaoEmMinutos(int duracaoEmMinutos) {
        this.duracaoEmMinutos = duracaoEmMinutos;
    }

    public int getTotalDeAvaliacoes(){
        return totalDeAvaliacoes;
    }

    public String getNome() {
        return nome;
    }

    public boolean isIncluidoNoPLano() {
        return incluidoNoPLano;
    }


    public int getAnoDeLancamento() {
        return anoDeLancamento;
    }

    public int getDuracaoEmMinutos() {
        return duracaoEmMinutos;
    }

    public void avalia(double nota){
        somaDasAvaliacoes += nota;
        totalDeAvaliacoes++;
    }
    public double pegaMedia(){
        return somaDasAvaliacoes / totalDeAvaliacoes;
    }

    @Override
    public int compareTo(Titulo outroNome) {
        return this.getNome().compareTo(outroNome.getNome());
    }

    @Override
    public String toString() {
        return "nome= ( " + nome +
                ", anoDeLancamento= " + anoDeLancamento +
                 " Tempo: " + duracaoEmMinutos + ")";
    }
}
