import br.com.alura.screenmatch.model.Episode;
import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;
import calculator.Calculator;
import calculator.FilterOfRecommendation;

public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();
        Movie myMovie2 = new Movie();

        myMovie.setName("Spirited Away");
        myMovie.setYearOfRelease(2003);
        myMovie.setDurationMinutes(125);

        myMovie.rate(8);
        myMovie.rate(9);
        myMovie.movieDescription();
        myMovie.setDirector("Hayao Miyazaki");
        System.out.println(myMovie.getDirector());

        Serie superNatural = new Serie();
        superNatural.setName("Super Natural");
        superNatural.setYearOfRelease(2008);
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
    }
}
