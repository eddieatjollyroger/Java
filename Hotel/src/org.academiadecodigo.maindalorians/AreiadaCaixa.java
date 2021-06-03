package org.academiadecodigo.maindalorians;

public class AreiadaCaixa {
    public static void main(String[] args) {

        Person[] persons = new Person[] {
                new Person("Mestre"),
                new Person("Andre"),
                new Person("Joao"),
                new Person("Balao"),
                new Person("Feijao"),
                new Person("Pablito"),
                new Person("Estevez")
        };
        Hotel hotel = new Hotel(persons);
        hotel.checkIn();
        hotel.checkOut();

    }
}
