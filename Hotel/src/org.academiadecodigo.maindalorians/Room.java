package org.academiadecodigo.maindalorians;

public class Room {

    private final int roomMax = 5;
    private int roomCounter;
    private Person person;
    private Hotel hotel;
    private Person name;

    public Room(Person person) {
        name = person;

    }


    public boolean checkAvailability () {

        if (roomCounter < roomMax) {
            return true;
        }
       else {
           return false;
       }

    }
    public void checkInPerson (){
        roomCounter++;

        //System.out.println(roomCounter);
    }
    public void checkOutPerson (){
        roomCounter--;
        //System.out.println(roomCounter);
    }
}
