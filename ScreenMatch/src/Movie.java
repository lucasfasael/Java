public class Movie {
    String name;
    int yearOfRelease;
    boolean included;
    double grade;
    private int gradesAmount;
    int durationMinutes;

    void movieDescription(){
        System.out.println(name);
        System.out.println(yearOfRelease);
        System.out.println(durationMinutes);
        System.out.println(showAverage());
    }
    void rate(double nota){
        grade += nota;
        gradesAmount++;
    }

    double showAverage(){
        return grade / gradesAmount;
    }

}
