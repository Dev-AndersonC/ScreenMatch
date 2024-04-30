package br.com.anderson.screenmatch.models;

import br.com.anderson.screenmatch.exceptions.ErrorYear;
import com.google.gson.annotations.SerializedName;

public class Title implements Comparable<Title>{
    @SerializedName("Title") //forma para o json identificar.
    private String name; // nome do filme
    @SerializedName("Year")
    private int releaseYear; // ano de lançamento
    private boolean plan; // plano da plataforma
    private double evaluation; // avaliação
    private int Reviews; // Total de avaliações
//    @SerializedName("Runtime") -> converte para string -> int
    private int movieLength; // Duração do filme

    public Title(String name) {
        this.name = name;
    }

    public Title() {
    }

    public Title(TitleOmdb mytitle) {
        this.name = mytitle.title();

        if (mytitle.year().length() > 4) {
            throw new ErrorYear("Não consegui converte o ano");
        }
        this.releaseYear = Integer.valueOf(mytitle.year());
        this.movieLength = Integer.valueOf(mytitle.runtime().substring(0,2));
    }

    public int getReleaseYear() {
        return releaseYear;
    }

    public boolean isPlan() {
        return plan;
    }

    public double getEvaluation() {
        return evaluation;
    }

    public int getMovieLength() {
        return movieLength;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
//    this == Este { this, faz referencia ao atributo da propria classe}
        this.name = name;
    }

    public void setReleaseYear(int releaseYear) {
        this.releaseYear = releaseYear;
    }

    public void setTitlesLength(int movieLength) {
        this.movieLength = movieLength;
    }

    // Gets & Sets, são metodos acessores para manipular um certo atributo privado!
    public int getReviews(){
        return  Reviews;
    }

    public double GetMedia(){
        return evaluation / Reviews;
    }

    public void Datasheet(){
        System.out.println("Filme: " + name);
        System.out.println("Ano lançamento " + releaseYear);
        System.out.println("Duração" + movieLength);
    }

    public void Evaluates(double note){
        evaluation += note;
        Reviews+=1;

    }
    @Override
    public String toString() {
        return "Filme: " + this.getName() + " (" + this.getReleaseYear() + ")" + " Duração: " + getMovieLength();
    }

    @Override
    public int compareTo(Title title) { // Implementando o metodo Compare no title para fazer o titulo seja
        // comparavel e conseguimos ordenar de forma alfabetica.
        return this.getName().compareTo(title.getName());
    }
}
