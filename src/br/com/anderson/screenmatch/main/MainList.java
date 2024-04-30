package br.com.anderson.screenmatch.main;

import br.com.anderson.screenmatch.models.Movie;
import br.com.anderson.screenmatch.models.Series;
import br.com.anderson.screenmatch.models.Title;
import java.util.*;

public class MainList {
    public static void main(String[] args) {
        Movie fistMovie = new Movie();
        fistMovie.setName("Pokemon Heroes");
        fistMovie.setReleaseYear(2002);


        Movie secondMovie = new Movie();
        secondMovie.setReleaseYear(2011);
        secondMovie.setName("Heroes");

        Series fistSeries = new Series();
        fistSeries.setName("Avikings");
        fistSeries.setReleaseYear(2020);


        ArrayList<Title> arrayList = new ArrayList<>();
        arrayList.add(fistMovie);
        arrayList.add(secondMovie);
        arrayList.add(fistSeries);

//       arrayList.forEach(System.out::println);

       List<String> SearchForArtists = new LinkedList<>(); // usar interfaces, tornando de forma mais generica, transforma o codigo, mais facil para manipulação
//        Estudar Map, List, HasMap.
        SearchForArtists.add("eu");
        SearchForArtists.add("Pablo escobar");
        SearchForArtists.add("Tiririca");
        SearchForArtists.add("Musun");
        SearchForArtists.add("Didi");
        SearchForArtists.add("Tiago Ventura");


        Collections.sort(SearchForArtists);
        System.out.println(SearchForArtists);

        Collections.sort(arrayList);
        arrayList.sort(Comparator.comparing(Title::getReleaseYear)); // Usamos o comparator.comparing para comparar o titulo com o ano
        System.out.println(arrayList);



    }
}
