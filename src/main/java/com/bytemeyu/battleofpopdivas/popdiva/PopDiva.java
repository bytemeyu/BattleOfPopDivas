package com.bytemeyu.battleofpopdivas.popdiva;

public class PopDiva implements PopDivaInterface{
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

    public void currentStatus() {
        System.out.println("_________");
        System.out.println(this.getName());
        System.out.println(this.getMusicalGenre());
        System.out.println(this.getNationality());
        System.out.println(this.getGrammyNominations());
        System.out.println(this.getGrammyWins());
        System.out.println(this.getPopDivaScandals());
        System.out.println(this.getWins());
        System.out.println(this.getLosses());
        System.out.println(this.getDraws());
        System.out.println("_________");
    }

    @Override
    public boolean introduceYourself() {
        return false;
    }

    @Override
    public boolean winBattle() {
        return false;
    }

    @Override
    public boolean loseBattle() {
        return false;
    }

    @Override
    public boolean drawBattle() {
        return false;
    }
}
