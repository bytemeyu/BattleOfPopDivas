package com.bytemeyu.battleofpopdivas.battle;

import com.bytemeyu.battleofpopdivas.popdiva.PopDiva;

import java.util.Random;

public class Battle implements BattleInterface{

    private PopDiva challenger;
    private PopDiva challenged;
    private boolean approved;

    public Battle(PopDiva challenger, PopDiva challenged) {
        this.setChallenger(challenger);
        this.setChallenged(challenged);
    }

    public PopDiva getChallenger() {
        return challenger;
    }

    public void setChallenger(PopDiva challenger) {
        this.challenger = challenger;
    }

    public PopDiva getChallenged() {
        return challenged;
    }

    public void setChallenged(PopDiva challenged) {
        this.challenged = challenged;

        if(this.getChallenger() != this.getChallenged()){
            this.approved = true;
        } else {
            this.approved = false;
        }
    }

    public boolean isApproved() {
        return this.approved;
    }

    public void setApproved() {
        this.approved = this.isApproved();
    }

    public void currentStatus() {
        System.out.println("_________");
        System.out.println("Challenger: " + this.getChallenger().getName());
        System.out.println("Challenged: " + this.getChallenged().getName());
        System.out.println("Approved? " + this.isApproved());
    }



    @Override
    public PopDiva vocalShowdown() {
        Random random = new Random();

        int challengerVocalScore = random.nextInt(11);
        int challengedVocalScore = random.nextInt(11);

        if(challengerVocalScore > challengedVocalScore) {
            System.out.println("Vocal showdown winner is " + this.getChallenger().getName() + "!");
            return this.getChallenger();
        } else {
            System.out.println("Vocal showdown winner is " + this.getChallenged().getName() + "!");
            return this.getChallenged();
        }
    }

    @Override
    public PopDiva danceOff() {
        Random random = new Random();

        int challengerDanceScore = random.nextInt(11);
        int challengedDanceScore = random.nextInt(11);

        if(challengerDanceScore > challengedDanceScore) {
            System.out.println("Dance off winner is " + this.getChallenger().getName() + "!");
            return this.getChallenger();
        } else {
            System.out.println("Dance off winner is " + this.getChallenged().getName() + "!");
            return this.getChallenged();
        }
    }

    @Override
    public PopDiva grammyRelevance() {
        int challengerNomination = this.getChallenger().getGrammyNominations();
        int challengerWins = this.getChallenger().getWins();
        int challengerGrammyRelevance = (challengerNomination/2) + challengerWins;

        int challengedNomination = this.getChallenged().getGrammyNominations();
        int challengedWins = this.getChallenged().getWins();
        int challengedGrammyRelevance = (challengedNomination/2) + challengedWins;

        if(challengerGrammyRelevance > challengedGrammyRelevance) {
            System.out.println("The singer who has the most relevance at the Grammys is " + this.getChallenger().getName() + "!");
            return this.getChallenger();
        } else {
            System.out.println("The singer who has the most relevance at the Grammy is " + this.getChallenged().getName() + "!");
            return this.getChallenged();
        }
    }

    @Override
    public PopDiva lossDueToScandals() {
        int challengerScandalsScore = this.getChallenger().getScandalsScore();
        int challengedScandalsScore = this.getChallenged().getScandalsScore();

        if(challengerScandalsScore < challengedScandalsScore) {
            System.out.println("The singer who was least involved in scandals was " + this.getChallenger().getName() + "!");
            return this.getChallenger();
        } else {
            System.out.println("The singer who was least involved in scandals was " + this.getChallenged().getName() + "!");
            return this.getChallenged();
        }
    }

    @Override
    public PopDiva battleAndDetermineWinner() {
        if(this.isApproved()) {
            int challengerOverallScore = 0;
            int challengedOverallScore = 0;

            if(vocalShowdown() == this.getChallenger()) {
                challengerOverallScore++;
            } else {
                challengedOverallScore++;
            }

            if(danceOff() == this.getChallenger()) {
                challengerOverallScore++;
            } else {
                challengedOverallScore++;
            }

            if(grammyRelevance() == this.getChallenger()) {
                challengerOverallScore++;
            } else {
                challengedOverallScore++;
            }

            if(lossDueToScandals() == this.getChallenger()) {
                challengerOverallScore++;
            } else {
                challengedOverallScore++;
            }

            if(challengerOverallScore > challengedOverallScore) {
                System.out.println("The biggest, wonderful, big winner is " + this.getChallenger().getName() + "!!!");
                return this.getChallenger();
            } else if(challengedOverallScore > challengerOverallScore) {
                System.out.println("The biggest, wonderful, big winner is " + this.getChallenged().getName() + "!!!");
                return this.getChallenged();
            } else {
                System.out.println("It's a draw!");
                return this.resolveDraw();
            }
        } else {
            System.out.println("This battle was not approved. Try another one.");
            return null;
        }
    }

    @Override
    public void recordBattleResult() {
        PopDiva winner = this.battleAndDetermineWinner();

        if(winner != null) {
            if(winner == this.getChallenger()) {
                this.getChallenger().winBattle();
                this.getChallenged().loseBattle();
            } else {
                this.getChallenged().winBattle();
                this.getChallenger().loseBattle();
            }
        }
    }

    @Override
    public PopDiva resolveDraw() {
        PopDiva tiebreaker = this.vocalShowdown();

        if(tiebreaker == this.getChallenger()) {
            System.out.println("The biggest, wonderful, big winner is " + this.getChallenger().getName() + "!!!");
            return this.getChallenger();
        } else {
            System.out.println("The biggest, wonderful, big winner is " + this.getChallenged().getName() + "!!!");
            return this.getChallenged();
        }
    }
}
