package com.bytemeyu.battleofpopdivas.popdiva;

public interface PopDivaInterface {
    public abstract void currentStatus();
    public abstract boolean presentation();
    public abstract void addGrammyNominations(int grammyNomination);
    public abstract void addGrammyWins(int grammyWin);
    public abstract void addScandalsScore(String severityOfTheScandal);
    public abstract boolean winBattle ();
    public abstract boolean loseBattle();
    public abstract boolean drawBattle();
}
