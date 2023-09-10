package components;

public class Audio {
    private String title;
    private double duration;
    private int totalOfPlays;
    private int likes;
    private int rating;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getDuration() {
        return duration;
    }

    public void setDuration(double duration) {
        this.duration = duration;
    }

    public int getTotalOfPlays() {
        return totalOfPlays;
    }

    public int getLikes() {
        return likes;
    }

    public int getRating() {
        return rating;
    }

    public void rate(){
        likes++;
        System.out.println("Música curtida com sucesso: " + likes + " likes atualmente.");
    }

    public void play(){
        totalOfPlays++;
        System.out.println("Música tocando (8)");
    }

    public int showAverage(){
        if(totalOfPlays / likes >= 5){
            return 4;
        } else {
            return 2;
        }
    }
}
