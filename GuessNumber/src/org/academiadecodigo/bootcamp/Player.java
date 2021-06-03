package org.academiadecodigo.bootcamp;

public class Player {
    public int guess;
    public Player(int min, int max, int[]array) {
        playerGuess(min, max, array);
    }

    public int playerGuess(int min, int max, int[]array) {
        this.guess = (int) (Math.random() * (max - min + 1) + min);
        for (int i = 0; i < array.length; i++){
            if (this.guess == array[i]) {
                playerGuess(min, max, array);
            }

        }
        return guess;
    }


}
