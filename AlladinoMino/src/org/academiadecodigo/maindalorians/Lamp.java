package org.academiadecodigo.maindalorians;


public class Lamp {
    private int GenieNumber;
    private  int MaxGenies;
    private  int Demonio;
    private final int Friendly = 0;
    private final int Grumpy = 1;
    private boolean Recycled = true;
    private String name;
    private Genie genie;
    private int WishesGranted;
    private int Recharged;
    private Genie satanas;

    public Lamp(String name, int MaxGenies){
this.MaxGenies = MaxGenies;
Demonio = MaxGenies;
this.GenieNumber = 0;
this.name = name;
    }

    public void setWishesGranted(int wishesGranted) {
        WishesGranted += wishesGranted;
    }

    public int getWishesGranted() {
        return WishesGranted;
    }

    public String getName() {
        return name;
    }

    public void rubLamp (){
        if (GenieNumber < MaxGenies) {
        switch (GenieNumber % 2) {
            case Friendly: {
          FriendlyGenie friendsForever = new FriendlyGenie(this);
          this.genie = friendsForever;
                System.out.println();
                System.out.println("New Genie! \nIts a friendly Genie! from lamp " + name);

          GenieNumber++;
          break;
            }
            case Grumpy: {
                GrumpyGenie grumpspumps = new GrumpyGenie(this);
                this.genie = grumpspumps;
                System.out.println();
                System.out.println("New Genie! \nIts a not so friendly Genie! from lamp " + name);

                GenieNumber++;
                break;
            }
        }
        }
        else if(GenieNumber == MaxGenies && Recycled == true){
            DemonGenie satanas = new DemonGenie(this);
            this.genie = satanas;
            System.out.println();
            System.out.println("New Genie! \nIts a demonomononic Genie! from lamp " + name);
            Recycled = false;
        }
        else {
            System.out.println();
            System.out.println("-------------------------------------");
            System.out.println("Cant generate genies until recharged");
            System.out.println("-------------------------------------");
        }
    }
    public void grantWishGenie(){
        genie.grantWish(genie.toString());
    }
public void compareLamps(Lamp lamp2){
        if (this.Recharged == lamp2.Recharged &&
                this.MaxGenies == lamp2.MaxGenies &&
                this.GenieNumber == lamp2.GenieNumber){
            System.out.println();
            System.out.println("Yay lamps are the same :) \nBoth lamps have been recharged " + this.Recharged + " time(s) have the max capacity of " + MaxGenies + " and still have " + (MaxGenies-GenieNumber) + " genies in the bank");

        }
        else {
            System.out.println();
            System.out.println("Nay lamps are not the same :(");
            System.out.println();
            System.out.println(this.getName() + " has been recharged " + this.Recharged +" times has the max capacity of " + this.MaxGenies + " and has "+ (this.MaxGenies - this.GenieNumber) +  " genies in the bank \nWhile "+ lamp2.getName() +" has been recharged "+ lamp2.Recharged + " time(s) has the max capacity of " + lamp2.MaxGenies + " and has "+ (lamp2.MaxGenies - lamp2.GenieNumber) +" genies in the bank");

        }
}

    public void recycleLamp (){
        if(GenieNumber == Demonio) {
            Recycled = true;
            GenieNumber = 0;
            Recharged++;
            System.out.println();
            System.out.println("--------------");
            System.out.println("Lamp recharged");
            System.out.println("--------------");
        }
        else {
            System.out.println();
            System.out.println("-----------------------------------");
            System.out.println("Cannot be recharged without a demon");
            System.out.println("-----------------------------------");
        }
    }
}
