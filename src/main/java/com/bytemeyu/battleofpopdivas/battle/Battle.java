package com.bytemeyu.battleofpopdivas.battle;

import com.bytemeyu.battleofpopdivas.popdiva.PopDiva;

public class Battle implements BattleInterface{

    private PopDiva challenger;
    private PopDiva challenged;
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
    }

    public int getRounds() {
        return rounds;
    }

    public void setRounds(int rounds) {
        this.rounds = rounds;
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
