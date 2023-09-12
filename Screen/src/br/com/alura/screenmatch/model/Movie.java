package br.com.alura.screenmatch.model;

import calculator.Classified;

public class Movie extends Video implements Classified {
    private String director;

    public Movie(String name, int yearOfRelease) {
        super(name, yearOfRelease);
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClassified() {
        return (int)showAverage() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + getName() + ", ano de lançamento: " + getYearOfRelease();
    }
}


