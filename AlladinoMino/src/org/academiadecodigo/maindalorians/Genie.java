package org.academiadecodigo.maindalorians;

abstract public class Genie {
    private final int One = 1;
    private final int MaxWishes = 3;
    private int Wishes;
    private Lamp lamp;
    private String name;

    public Genie(Lamp lamp){
       this.Wishes = 0;
       this.lamp = lamp;
    }
    public int getWishes() {
        return Wishes;
    }
    public void grantWish (String genie) {
        if (Wishes < MaxWishes) {
            System.out.println();
            System.out.println("Your " + genie + " says here's your wish from lamp " + lamp.getName());
            Wishes++;
            lamp.setWishesGranted(One);
        }
        else {
            System.out.println();
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
            System.out.println("No wish for you from your "+ genie + " in lamp " + lamp.getName());
            System.out.println("XXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXXX");
        }
    }

}
