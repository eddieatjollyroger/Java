package org.academiadecodigo.maindalorians;

public class FriendlyGenie extends Genie {
    private final int MaxWishes = 3;
    private int Wishes;
    private Lamp lamp;

    public FriendlyGenie(Lamp lamp){
        super(lamp);
    }

    public int getWishes() {
        return Wishes;
    }

    public void grantWish( String genie) {

        super.grantWish(genie);

    }



    @Override
    public String toString() {
        return "Friendly Genie";
    }
}



