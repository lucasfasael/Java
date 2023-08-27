package br.com.alura.screenmatch.model;

public class Video {
    private String name;
    private int yearOfRelease;
    private boolean included;
    private double grade;
    private int gradesAmount;
    private int durationMinutes;

    public int getGradesAmount(){
        return gradesAmount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getYearOfRelease() {
        return yearOfRelease;
    }

    public boolean isIncluded() {
        return included;
    }

    public int getDurationMinutes() {
        return durationMinutes;
    }

    public void setYearOfRelease(int yearOfRelease) {
        this.yearOfRelease = yearOfRelease;
    }

    public void setIncluded(boolean included) {
        this.included = included;
    }

    public void setDurationMinutes(int durationMinutes) {
        this.durationMinutes = durationMinutes;
    }

    public void movieDescription(){
        System.out.println(name);
        System.out.println(yearOfRelease);
        System.out.println(durationMinutes);
        System.out.println(showAverage());
    }
    public void rate(double value){
        grade += value;
        gradesAmount++;
    }

    public double showAverage(){
        return grade / gradesAmount;
    }
}
