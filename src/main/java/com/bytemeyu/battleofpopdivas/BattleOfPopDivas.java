package com.bytemeyu.battleofpopdivas;

import com.bytemeyu.battleofpopdivas.battle.Battle;
import com.bytemeyu.battleofpopdivas.battle.BattleInterface;
import com.bytemeyu.battleofpopdivas.popdiva.PopDiva;

public class BattleOfPopDivas {
    public static void main(String[] args) {

        PopDiva diva1 = new PopDiva("Beyoncé Giselle Knowles-Carter", "R&B, Pop, Country", "North American");
        diva1.presentation();
        diva1.addGrammyNominations(30);
        diva1.addGrammyNominations(2);
        diva1.addGrammyWins(5);
        diva1.addScandalsScore("minor");
        diva1.addScandalsScore("public outrage");
        diva1.currentStatus();

        PopDiva diva2 = new PopDiva("Madonna Louise Veronica Ciccone", "Pop, Pop Dance, Power Ballads", "North American");
        diva2.presentation();
        diva2.addGrammyNominations(45);
        diva2.addGrammyNominations(1);
        diva2.addGrammyWins(9);
        diva2.addScandalsScore("noteworthy");
        diva2.addScandalsScore("significant");
        diva2.currentStatus();

        PopDiva diva3 = new PopDiva("Olivia Rodrigo", "Teen Pop, Pop Rock, Pop", "North American");
        diva3.presentation();
        diva3.addGrammyNominations(9);
        diva3.addGrammyNominations(2);
        diva3.addGrammyWins(1);
        diva3.addScandalsScore("minor");
        diva3.currentStatus();

        Battle battle1 = new Battle(diva1, diva2);
        battle1.currentStatus();
        battle1.battleAndDetermineWinner();

        diva1.currentStatus();
        diva2.currentStatus();

        Battle battle2 = new Battle(diva1, diva1);
        battle2.currentStatus();
        battle2.battleAndDetermineWinner();

        Battle battle3 = new Battle(diva2, diva3);
        battle3.currentStatus();
        battle3.battleAndDetermineWinner();

        diva2.currentStatus();
        diva3.currentStatus();
    }
}