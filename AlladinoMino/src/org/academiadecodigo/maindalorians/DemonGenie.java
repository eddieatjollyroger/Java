package org.academiadecodigo.maindalorians;

public class DemonGenie extends Genie{
    private final int One = 1;
    private final int MaxWishes = 3;
    private int Wishes;
    private Lamp lamp;

    public DemonGenie(Lamp lamp) {
        super(lamp);
        this.lamp = lamp;
    }

    public int getWishes() {
        return Wishes;
    }
    @Override
    public void grantWish (String genie) {
        {
            System.out.println();
            System.out.println("Demomonic Genie says - " + "Here's your wish from lamp " + lamp.getName());
       Wishes++;
       lamp.setWishesGranted(One);
    }
    }
    public void recycleLamp() {
        lamp.recycleLamp();
    }
}
