package br.com.alura.screenmatch.model;

import calculator.Classified;

public class Episode implements Classified {
    private int number;
    private String nome;
    private Serie serie;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalViews() {
        return totalViews;
    }

    public void setTotalViews(int totalViews) {
        this.totalViews = totalViews;
    }

    private int totalViews;

    @Override
    public int getClassified() {
        if (totalViews >= 100) {
            return 4;
        } else {
            return 2;
        }
    }
}
