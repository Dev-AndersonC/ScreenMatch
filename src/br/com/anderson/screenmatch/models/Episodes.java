package br.com.anderson.screenmatch.models;

import br.com.anderson.screenmatch.calculations.ToRank;

public class Episodes implements ToRank {
    private int number;
    private String name;
    private Series serie;
    private int TotalViews;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Series getSerie() {
        return serie;
    }

    public void setSerie(Series serie) {
        this.serie = serie;
    }



    public int getTotalViews() {
        return TotalViews;
    }

    public void setTotalViews(int totalViews) {
        TotalViews = totalViews;
    }
    @Override
    public int getRank() {
        if(TotalViews > 100) {
            return 4;
        } else {
        return 2;
        }
    }
}
