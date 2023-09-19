package br.com.alura.screenmatch.model;

import com.google.gson.annotations.SerializedName;
import com.sun.jdi.IntegerValue;
import main.MyYearError;

public class Video implements Comparable<Video>{
    @SerializedName("Title")
    private String name;
    @SerializedName("Year")
    private int yearOfRelease;
    private boolean included;
    private double grade;
    private int gradesAmount;
    private int durationMinutes;

    public Video(String name, int yearOfRelease)  {
        this.name = name;
        this.yearOfRelease = yearOfRelease;
    }

    public Video(VideoOmdb myVideoOmdb) {
        this.name = myVideoOmdb.title();

        if(myVideoOmdb.year().length() > 4){
            throw new MyYearError("O ano é inválido pois é maior que 4.");
        }
        this.yearOfRelease = Integer.valueOf(myVideoOmdb.year());
        this.durationMinutes = Integer.valueOf(myVideoOmdb.runtime().substring(0, 2));
    }

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

    @Override
    public int compareTo(Video anotherVideo) {
        return this.getName().compareTo(anotherVideo.getName());
    }

    @Override
    public String toString() {
        return  "name= '" + name + '\'' +
                ", yearOfRelease= " + yearOfRelease + ", duration= " + durationMinutes +
                '}';
    }
}
