package org.academiadecodigo.maindalorians;

public class AlladinoMino {
    public static void main(String[] args) {

        Lamp alladino = new Lamp ("Alladino", 3);
        Lamp jasmina = new Lamp("Jasmina", 3);
        alladino.rubLamp();
        jasmina.rubLamp();
        alladino.grantWishGenie();
        jasmina.grantWishGenie();
        alladino.compareLamps(jasmina);
        alladino.grantWishGenie();
        alladino.grantWishGenie();
        alladino.grantWishGenie();
        jasmina.grantWishGenie();
        alladino.rubLamp();
        alladino.grantWishGenie();
        alladino.grantWishGenie();
        alladino.recycleLamp();
        alladino.rubLamp();
        alladino.rubLamp();
        alladino.grantWishGenie();
        alladino.compareLamps(jasmina);
        alladino.rubLamp();
        alladino.recycleLamp();
        alladino.rubLamp();
        alladino.compareLamps(jasmina);

    }
}
