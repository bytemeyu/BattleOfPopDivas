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

        PopDiva diva3 = new PopDiva("Olivia Rodrigo", "Teen Pop, Pop Rock, Pop", "North American");
        diva3.presentation();
        diva3.currentStatus();

        Battle battle1 = new Battle(diva1, diva3);
        battle1.currentStatus();
        //battle1.vocalShowdown();
        //battle1.grammyRelevance();
        System.out.println(battle1.battleAndDetermineWinner());
    }
}