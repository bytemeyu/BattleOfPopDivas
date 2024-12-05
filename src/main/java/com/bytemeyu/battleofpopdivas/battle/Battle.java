package com.bytemeyu.battleofpopdivas.battle;

import com.bytemeyu.battleofpopdivas.popdiva.PopDiva;

public class Battle implements BattleInterface{

    private PopDiva challenger;
    private PopDiva challenged;
    private boolean approved;
    private int rounds;

    public Battle(PopDiva challenger, PopDiva challenged, int rounds) {
        this.setChallenger(challenger);
        this.setChallenged(challenged);
        this.setRounds(rounds);
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

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
    }

    public void currentStatus() {
        System.out.println("_________");
        System.out.println("Challenger: " + this.getChallenger().getName());
        System.out.println("Challenged: " + this.getChallenged().getName());
        System.out.println("Approved? " + this.isApproved());
        System.out.println("Rounds: " + this.getRounds());
    }



    @Override
    public PopDiva vocalShowdown() {
        return null;
    }

    @Override
    public PopDiva danceOff() {
        return null;
    }

    @Override
    public PopDiva battleForChartPosition() {
        return null;
    }

    @Override
    public PopDiva determineWinner() {
        return null;
    }

    @Override
    public void recordBattleResult() {

    }

    @Override
    public void resolveDraw() {

    }
}
