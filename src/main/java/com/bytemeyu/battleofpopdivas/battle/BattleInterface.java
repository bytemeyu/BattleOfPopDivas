package com.bytemeyu.battleofpopdivas.battle;

import com.bytemeyu.battleofpopdivas.popdiva.PopDiva;

public interface BattleInterface {
    public abstract PopDiva vocalShowdown();
    public abstract PopDiva danceOff();
    public abstract PopDiva battleForChartPosition();
    public abstract PopDiva determineWinner();
    public abstract void recordBattleResult();
    public abstract void resolveDraw();
}