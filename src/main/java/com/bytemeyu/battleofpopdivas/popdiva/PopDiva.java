package com.bytemeyu.battleofpopdivas.popdiva;

public class PopDiva {
    private String name;
    private String musicalGenre;
    private String nationality;
    private int grammyNominations;
    private int grammyWins;
    private int popDivaScandals;
    private int wins;
    private int losses;
    private int draws;

    public PopDiva(String name, String musicalGenre, String nationality) {
        this.name = name;
        this.musicalGenre = musicalGenre;
        this.nationality = nationality;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMusicalGenre() {
        return musicalGenre;
    }

    public void setMusicalGenre(String musicalGenre) {
        this.musicalGenre = musicalGenre;
    }

    public String getNationality() {
        return nationality;
    }

    public void setNationality(String nationality) {
        this.nationality = nationality;
    }

    public int getGrammyNominations() {
        return grammyNominations;
    }

    public void setGrammyNominations(int grammyNominations) {
        this.grammyNominations = grammyNominations;
    }

    public int getGrammyWins() {
        return grammyWins;
    }

    public void setGrammyWins(int grammyWins) {
        this.grammyWins = grammyWins;
    }

    public int getPopDivaScandals() {
        return popDivaScandals;
    }

    public void setPopDivaScandals(int popDivaScandals) {
        this.popDivaScandals = popDivaScandals;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }
}
