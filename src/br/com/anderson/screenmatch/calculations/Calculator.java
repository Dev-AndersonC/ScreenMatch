package br.com.anderson.screenmatch.calculations;

import br.com.anderson.screenmatch.models.Title;

public class Calculator {
    private int totalTime;

    public int getTotalTime() {
        return totalTime;
    }

    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }

    public void AddTitles(Title titles){
        totalTime += titles.getMovieLength();
//        Adiciona titulos e calcula seu tempo
    }


}
