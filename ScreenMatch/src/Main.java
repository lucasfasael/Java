import br.com.alura.screenmatch.model.Movie;
import br.com.alura.screenmatch.model.Serie;

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


    }
}
