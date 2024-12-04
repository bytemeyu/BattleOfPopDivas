package com.bytemeyu.battleofpopdivas.popdiva;

public class PopDiva implements PopDivaInterface{
    private String name;
    private String musicalGenre;
    private String nationality;
    private int grammyNominations;
    private int grammyWins;
    private int scandalsScore;
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

    public int getScandalsScore() {
        return scandalsScore;
    }

    public void setScandalsScore(int scandalsScore) {
        this.scandalsScore = scandalsScore;
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
        System.out.println("Grammy Nominations: " + this.getGrammyNominations());
        System.out.println("Grammy Wins: " + this.getGrammyWins());
        System.out.println("Scandals Score: " + this.getScandalsScore());
        System.out.println("Wins: " + this.getWins());
        System.out.println("Losses: " + this.getLosses());
        System.out.println("Draws: " + this.getDraws());
        System.out.println("_________");
    }

    @Override
    public boolean presentation() {
        System.out.println("We present " + this.getName() + ", " + this.getNationality() + " " + this.getMusicalGenre() + " singer!");
        return true;
    }

    @Override
    public void addGrammyNominations(int grammyNomination) {
        int totalGrammyNominations = this.getGrammyNominations() + grammyNomination;
        this.setGrammyNominations(totalGrammyNominations);
    }

    @Override
    public void addGrammyWins(int grammyWin) {
        int totalGrammyWins = this.getGrammyWins() + grammyWin;
        this.setGrammyWins(totalGrammyWins);
    }

    @Override
    public void addScandalsScore(String severityOfTheScandal) {
        int scoreIncrement = 0;

        switch (severityOfTheScandal) {
            case "minor":
                scoreIncrement = 1;
                break;
            case "noteworthy":
                scoreIncrement = 2;
                break;
            case "significant":
                scoreIncrement = 3;
                break;
            case "public outrage":
                scoreIncrement = 6;
                break;
            default:
                System.out.println("Invalid scandal severity: " + severityOfTheScandal);
        }

        int totalScandalsScore = this.getScandalsScore() + scoreIncrement;
        this.setScandalsScore(totalScandalsScore);
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
