package br.com.alura.screenmatch.principal;

import br.com.alura.screenmatch.modelos.Film;
import br.com.alura.screenmatch.modelos.Serie;
import br.com.alura.screenmatch.modelos.Titulo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class principalComListas {
    public static void main(String[] args) {
        Film meuFilme = new Film("Matrix ", 1999);
        meuFilme.setTotaldeVisualizacoes(300);
        Film outroFilme = new Film("Avatar ", 2010);
        var filmeDoFernando = new Film("Capitão América ", 2015);
        Serie strangerThings = new Serie("Stranger things ", 2016);

        ArrayList<Titulo> lista = new ArrayList<>();
        lista.add(filmeDoFernando);
        lista.add(outroFilme);
        lista.add(meuFilme);
        lista.add(strangerThings);
        Collections.sort(lista);
        for (Titulo item: lista){
            System.out.println(item);
            if(item instanceof Film film) {
                System.out.println("Classificação: " + film.getClassificao());
            }
        }
        ArrayList<String> buscar = new ArrayList<>();
        buscar.add("Adam Sandler");
        buscar.add("Fernando");
        buscar.add("Chris");
        buscar.add("Zoe");
        Collections.sort(buscar);
        System.out.println(buscar);
        lista.sort(Comparator.comparing(Titulo::getAnoDeLancamento));
        System.out.println(lista);

    }
}
