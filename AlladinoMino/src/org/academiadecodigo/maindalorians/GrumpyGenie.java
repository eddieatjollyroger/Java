package org.academiadecodigo.maindalorians;

public class GrumpyGenie extends Genie{
    private final int One = 1;
    private final int MaxWishes = 3;
    private int Wishes;
    private Lamp lamp;

    public GrumpyGenie(Lamp lamp){
        super(lamp);
        this.lamp = lamp;
    }
    public int getWishes() {
        return Wishes;
    }
@Override
    public void grantWish (String genie) {
        if(Wishes < MaxWishes) {super.grantWish(genie);
        Wishes = MaxWishes;
        lamp.setWishesGranted(One);
    }
        else {
            System.out.println();
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("No wish for you from genie " + genie + " in lamp " + lamp.getName());
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        }
    }

    @Override
    public String toString() {
        return "Grumpy Genie";
    }
}

