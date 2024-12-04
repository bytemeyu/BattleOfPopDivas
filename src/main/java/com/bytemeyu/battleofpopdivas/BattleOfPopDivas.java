package com.bytemeyu.battleofpopdivas;

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
    }
}