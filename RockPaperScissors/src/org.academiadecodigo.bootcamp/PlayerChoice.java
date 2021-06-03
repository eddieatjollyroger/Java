package org.academiadecodigo.bootcamp;

public class PlayerChoice {

    public int randomNumber;
    public PlayerChoice() {
        this.randomNumber = (int)(Math.random() * (double)(3 - 1 + 1) + (double)1);
    };

    //Choose a hand it's a method
}
