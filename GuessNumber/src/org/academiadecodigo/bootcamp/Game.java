package org.academiadecodigo.bootcamp;

public class Game {

    public int randomNumber;
    public Game(int min, int max) {
       GameGuess(min, max);
    }
    public int GameGuess(int min, int max) {

        randomNumber = (int) (Math.random() * (max - min + 1) + min);
         return randomNumber;
    }
}
