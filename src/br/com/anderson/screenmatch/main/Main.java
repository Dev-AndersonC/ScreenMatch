package br.com.anderson.screenmatch.main;// Nomeclatura de pacotes é ao inverso, como abaixo
import br.com.anderson.screenmatch.calculations.Calculator;
import br.com.anderson.screenmatch.calculations.Recommendation;
import br.com.anderson.screenmatch.models.Episodes;
import br.com.anderson.screenmatch.models.Movie;
import br.com.anderson.screenmatch.models.Series;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        //        Para treinamento, vamos manter os nomes das variaveis, methods e classes em ingles.
        Movie myfilm = new Movie();
        myfilm.setName("Rango");
        myfilm.setReleaseYear(2011);
        myfilm.setTitlesLength(8820); // unico verdadeiramente proximo ao real


        Movie myfilm2 = new Movie();
        myfilm2.setName("Avatar");
        myfilm2.setReleaseYear(2015);
        myfilm2.setTitlesLength(10510);

        Series myserie = new Series();
        myserie.setName("Teen Wolf");
        myfilm2.setReleaseYear(2011);
        myserie.setTitlesLength(110572);


//        myfilm.Datasheet(); // Mostra nome é ano do filme, uma mini ficha tecnica
        myfilm.Evaluates(8.0);
        myfilm.Evaluates(2.2);
        myfilm.Evaluates(4.1);
        System.out.println(myfilm.getReviews());

//        System.out.println(myfilm.GetMedia());

        Calculator calculator = new Calculator();
        calculator.AddTitles(myfilm);
        calculator.AddTitles(myfilm2);
        calculator.AddTitles(myserie);
        System.out.println(calculator.getTotalTime());

        Recommendation filter = new Recommendation();
        filter.filter(myfilm);

        Episodes episodes = new Episodes();
        episodes.setNumber(1);
        episodes.setSerie(myserie);
        episodes.setTotalViews(300);
        filter.filter(episodes);

        var mysecondfilm = new Movie();
        mysecondfilm.setName("A culpa é das estrelas");
        mysecondfilm.setReleaseYear(2014);
        mysecondfilm.setTitlesLength(400);

        ArrayList<Movie> arrayList = new ArrayList<>();
        arrayList.add(myfilm);
        arrayList.add(myfilm2);
        arrayList.add(mysecondfilm);

        System.out.println("Tamanho da lista: " + arrayList.size());
//        System.out.println("Primeiro filme: " + arrayList.get(0));

        for (int i = 0; i < arrayList.size(); i++) {
            System.out.println(arrayList.get(i).toString());
            
        }

    }


}