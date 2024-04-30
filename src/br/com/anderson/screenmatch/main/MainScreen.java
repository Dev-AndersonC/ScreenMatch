package br.com.anderson.screenmatch.main;

import br.com.anderson.screenmatch.exceptions.ErrorYear;
import br.com.anderson.screenmatch.models.Movie;
import br.com.anderson.screenmatch.models.Title;
import br.com.anderson.screenmatch.models.TitleOmdb;
import com.google.gson.FieldNamingPolicy;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import java.io.FileWriter;
import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

// Aprendendo a integrar a api, e trabalhar com json, aparentemente maven é igual ao nuget, onde fica alocado as biblitoecas do java.

public class MainScreen {
    public static void main(String[] args) throws IOException, InterruptedException {

        Scanner input = new Scanner(System.in);
        String search = "";
        List<Title> titles = new ArrayList<>();

        while (!search.equalsIgnoreCase("sair")) {
            System.out.println("Digite um filme: ");
            search = input.nextLine();

            if (search.equalsIgnoreCase("sair")) {
                break;
            }
//        "https://www.omdbapi.com/?t=matrix&apikey=d1ecf6bc" usar essa url para fazer a busca na api
            String url = "https://www.omdbapi.com/?t="+ search.replace(" ", "+") +"&apikey=d1ecf6bc";

                Gson gson  = new GsonBuilder().setFieldNamingPolicy(FieldNamingPolicy.UPPER_CAMEL_CASE)
                        .setPrettyPrinting() // setPretty Printing, funciona bem para deixa o json bem organizado, deixando detalhado.
                        .create(); // Faz a configuração do json entender que o padrão de escrita e upper_camel_case.

            try {
                HttpClient client = HttpClient.newHttpClient();
                HttpRequest request = HttpRequest.newBuilder()
                        .uri(URI.create(url))
                        .build();
                HttpResponse<String> response = client
                        .send(request, HttpResponse.BodyHandlers.ofString());

//        System.out.println(response.body());
                String json = response.body();

                TitleOmdb mytitle = gson.fromJson(json, TitleOmdb.class);

                Title mymovie = new Title(mytitle);
                System.out.println(mymovie);

                titles.add(mymovie);

//                FileWriter read = new FileWriter("Filmes.txt");
//                read.write(mymovie.toString());
//                read.close();
            } catch (NumberFormatException | ErrorYear exception) {
                System.out.println("Error");
                System.out.println(exception.getMessage());
            } catch (IllegalArgumentException ex ) {
                System.out.println("Erro ao compilar se vira!");
            }

            FileWriter read = new FileWriter("filmes.json");
            read.write(gson.toJson(titles));
            read.close();
        }
    }
}
