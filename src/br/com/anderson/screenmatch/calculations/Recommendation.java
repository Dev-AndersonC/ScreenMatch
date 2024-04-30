package br.com.anderson.screenmatch.calculations;

public class Recommendation {
    private String Recommendation;

    public void filter(ToRank torank){
        if( torank.getRank() >= 4) {
            System.out.println("Four Stars");
        } else if ( torank.getRank() >= 2) {
            System.out.println("Two Stars");
        } else {
        System.out.println("no evaluation");
        }
    }
}
