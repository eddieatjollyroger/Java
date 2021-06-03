package org.academiadecodigo.maindalorians;

public class Hotel {
   private Person[] persons;
    private Room room;
    private String name;
    private final int roomMax = 5;

    public Hotel(Person[] persons){

        this.persons = new Person[roomMax];
        for (int i = 0; i < roomMax  ; i++) {
            this.room = new Room(persons[i]);
            this.persons[i] = persons[i];
        }
    }



    public void checkIn() {
         for (Person person : persons) {
                if (room.checkAvailability()) {
                room.checkInPerson();
                System.out.println(person.getName() + " Has been checked the fk in");
            }
        }
        System.out.println("_________________________________");
        System.out.println("Sorry, no more rooms available");
        System.out.println("_________________________________");
    }

    public void checkOut() {
        for (Person person : persons) {
            room.checkOutPerson();
            System.out.println(person.getName() + " Has been checked the fk out");
        }
    }
    }



