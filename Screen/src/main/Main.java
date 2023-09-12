package main;

import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import calculator.Calculator;
import calculator.FilterOfRecommendation;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie("Spirited Away", 2003);
        Movie myMovie2 = new Movie("O preço do amanhã", 2008);

        myMovie.setDurationMinutes(125);

        myMovie.rate(8);
        myMovie.rate(9);
        myMovie.movieDescription();
        myMovie.setDirector("Hayao Miyazaki");
        System.out.println(myMovie.getDirector());

        Serie superNatural = new Serie("Super Natural", 2008);
        superNatural.setSeasons(10);
        superNatural.setEpisodesBySeason(10);
        superNatural.setMinutesPerEpisode(60);
        System.out.println("A duração em minutos da série " + superNatural.getName() + " é de: " + superNatural.getDurationMinutes());

        Calculator calculator = new Calculator();

        calculator.includeDuration(superNatural);
        calculator.includeDuration(myMovie);

        System.out.println("Você irá demorar para assistir todos esses videos : " + calculator.getTotalOfDuration());


        FilterOfRecommendation filter = new FilterOfRecommendation();
        Episode episode = new Episode();
        episode.setNome("Pilot");
        episode.setNumber(1);
        episode.setTotalViews(99);
        episode.setSerie(superNatural);

        filter.filters(myMovie);
        filter.filters(episode);

        ArrayList<Movie> listaDeFilmes = new ArrayList<>();
        listaDeFilmes.add(myMovie);
        listaDeFilmes.add(myMovie2);
        System.out.println(listaDeFilmes.get(1).getName());
        System.out.println(listaDeFilmes.size());

        Movie[] cenoura = new Movie[10];
        cenoura[0] = myMovie2;
        System.out.println(cenoura[0].getName());

        System.out.println(listaDeFilmes);
    }
}
