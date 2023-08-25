public class Main {
    public static void main(String[] args) {
        Movie myMovie = new Movie();

        myMovie.name = "Spirited Away";
        myMovie.yearOfRelease = 2003;
        myMovie.grade = 0;
        myMovie.included = true;
        myMovie.gradesAmount = 0;
        myMovie.durationMinutes = 125;

        myMovie.rate(8);
        myMovie.rate(9);
        myMovie.movieDescription();


    }
}
