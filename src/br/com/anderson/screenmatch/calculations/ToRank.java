package br.com.anderson.screenmatch.calculations;
// interface e aonde o a regra de negocio funciona; muito ultilizada na criação de tabelas para o sql
public interface ToRank {
    int getRank(); // Normalmente metodos de interfaces não possuem corpo, pois quem for implementar
    // a implementar a interface deve, escrever aquele metodo
}
