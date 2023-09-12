package main;

import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import br.com.alura.screenmatch.model.Video;

import java.util.*;

public class MainWithList {
    public static void main(String[] args) {
        Serie superNatural = new Serie("Better Call Saul", 2009);
        Movie myMovie = new Movie("Spirited Away", 2003);
        myMovie.rate(9);
        Movie myMovie2 = new Movie("O preço do amanhã", 2008);
        myMovie2.rate(5);

        superNatural.rate(10);

        ArrayList<Video> lista = new ArrayList<Video>();

        lista.add(myMovie);
        lista.add(myMovie2);
        lista.add(superNatural);

        for (Video item: lista) {
            System.out.println(item.getName());
            if(item instanceof Movie movie && movie.getClassified() >= 2) {
                System.out.println(((Movie) item).getClassified());
            }
        }

        //lista.forEach(video -> System.out.println(video));

        List<String> listOfNames = new LinkedList<>()   ;

        listOfNames.add("Cenoura");
        listOfNames.add("Batata");
        listOfNames.add("Feijão");

        //Collections.sort(lista);


        lista.sort(Comparator.comparing(Video::getYearOfRelease));
        System.out.println(lista);
    }
}
