package org.academiadecodigo.bootcamp;


public class GuessNumber {
    public static int min = 1;
    public static int max = 10;

    public static int[] arrayP1 = new int[max];
    //public static int[] arrayP2 = new int[max];

    public static Player player1 = new Player(min, max, arrayP1);
    public static Player player2 = new Player(min, max, arrayP1);
    public static Game Gamer = new Game(min, max);


    public static void main(String[] args) {

        System.out.println("The selected number is " + Gamer.GameGuess(min, max));
        int i = 0;
        int x = 0;
        int z = 0;
        while (i < 1) {
            for (int j = 0; j < arrayP1.length; j++) {
                if (player1.guess != arrayP1[j] && arrayP1[j] < 1 && player1.guess != arrayP1[0]) {
                    arrayP1[j] = player1.guess;
                    if (player1.guess == Gamer.randomNumber) {

                        System.out.println("Player 1 tried the following numbers before winning");
                        while (x < arrayP1.length && arrayP1[x] != 0) {

                            System.out.print(arrayP1[x] + "\t");
                            x++;
                        }
                        i++;
                        System.out.println();
                        break;
                    } else {
                        player1.playerGuess(min, max, arrayP1);
                        break;
                    }
                }
            }
            ;
            for (int j = 0; j < arrayP1.length; j++) {
                if (player2.guess != arrayP1[j] && arrayP1[j] < 1 && player2.guess != arrayP1[0]) {
                    arrayP1[j] = player2.guess;
                    if (player2.guess == Gamer.randomNumber) {

                        System.out.println("Player 2 tried the following numbers before winning");
                        while (z < arrayP1.length && arrayP1[z] != 0) {

                            System.out.print(arrayP1[z] + "\t");
                            z++;
                        }
                        i++;
                        System.out.println();
                        break;
                    } else {
                        player2.playerGuess(min, max, arrayP1);
                        break;
                    }
                }
            };
            player1.playerGuess(min, max, arrayP1);
            player2.playerGuess(min, max, arrayP1);
        }
    }
};
