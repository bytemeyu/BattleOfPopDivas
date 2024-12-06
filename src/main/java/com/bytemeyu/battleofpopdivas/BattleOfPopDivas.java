package com.bytemeyu.battleofpopdivas;

import com.bytemeyu.battleofpopdivas.battle.Battle;
import com.bytemeyu.battleofpopdivas.battle.BattleInterface;
import com.bytemeyu.battleofpopdivas.popdiva.PopDiva;

public class BattleOfPopDivas {
    public static void main(String[] args) {

        PopDiva diva1 = new PopDiva("Beyoncé Giselle Knowles-Carter", "R&B, Pop, Country", "North American");
        diva1.presentation();
        diva1.addGrammyNominations(3);
        diva1.addGrammyNominations(5);
        diva1.addScandalsScore("public outrage");
        diva1.addScandalsScore("minor");
        diva1.addGrammyWins(32);
        diva1.currentStatus();

        PopDiva diva2 = new PopDiva("Madonna Louise Veronica Ciccone", "Pop, Pop Dance, Power Ballads", "North American");
        diva2.presentation();
        diva2.currentStatus();

        Battle battle1 = new Battle(diva2, diva1, 3);
        battle1.currentStatus();
    }
}