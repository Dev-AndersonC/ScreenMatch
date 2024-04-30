package br.com.anderson.screenmatch.models;

import br.com.anderson.screenmatch.calculations.ToRank;

// extends ou extende, de determinada classe, cliando uma afiliação
public class Movie extends Title implements ToRank {
    private String director;

    public Movie(String avatar) {
    }

    public Movie() {
    }



    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getRank() {
        return (int) GetMedia() / 2;
    }

    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")";
    }
}
