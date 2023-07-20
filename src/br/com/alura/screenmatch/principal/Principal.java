package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.calculos.CalculadoraDeTempo;
import br.com.alura.screenmatch.calculos.FiltroRecomendacao;
import br.com.alura.screenmatch.modelos.Episodio;
import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args){
        Film meuFilme = new Film("Matrix ", 1999);
        meuFilme.setAnoDeLancamento(1999);
        meuFilme.setDuracaoEmMinutos(135);
        meuFilme.setIncluidoNoPLano(true);

        Film outroFilme = new Film("Avatar ", 2010);
        outroFilme.setDuracaoEmMinutos(200);
        outroFilme.setIncluidoNoPLano(true);
        outroFilme.setTotaldeVisualizacoes(400);

        var filmeDoFernando = new Film("Capitão América ", 2015);
        filmeDoFernando.setDuracaoEmMinutos(200);
        filmeDoFernando.setIncluidoNoPLano(true);
        filmeDoFernando.setTotaldeVisualizacoes(500);

        //meuFilme.exibeFichaTecnica();
        //meuFilme.avalia(9);
        //meuFilme.avalia(8);
        //meuFilme.avalia(9);
        //System.out.println("O total de avaliações é " + meuFilme.getTotalDeAvaliacoes());
        //System.out.println("Média de avaliações do filme "+ meuFilme.pegaMedia());


        Serie strangerThings = new Serie("Stranger things ", 2016);
        strangerThings.exibeFichaTecnica();
        strangerThings.setTemporada(4);
        strangerThings.setEpisodiosPorTemporada(8);
        strangerThings.setMinutosPorEpisodio(40);

        //System.out.println("Tempo para maratonar Stranger Things: " + strangerThings.getDuracaoEmMinutos() + " minutos");



        CalculadoraDeTempo calculadora = new CalculadoraDeTempo();
        calculadora.inclui(meuFilme);
        calculadora.inclui(outroFilme);
        calculadora.inclui(strangerThings);
        System.out.println(calculadora.getTempoTotal());

        FiltroRecomendacao filtro = new FiltroRecomendacao();
        filtro.filtrar(meuFilme);

        Episodio episodio = new Episodio("Episodio: ");
        episodio.setNumero(1);
        episodio.setSerie(strangerThings);
        episodio.setTotaldeVisualizacoes(300);
        filtro.filtrar(episodio);

        ArrayList<Film> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(filmeDoFernando);
        listaDeFilmes.add(outroFilme);
        listaDeFilmes.add(meuFilme);
        System.out.println("Tamanho da lista: " + listaDeFilmes.size());
        System.out.println("Primeiro filme: " + listaDeFilmes.get(0).getNome());
        System.out.println("To string do filme: " + listaDeFilmes.get(0).toString());
        System.out.println(listaDeFilmes);



    }
}