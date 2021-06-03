package org.academiadecodigo.bootcamp;


public class RockPaperScissors {
public static void main(String[] args){

    GameDecision Rock = GameDecision.ROCK;
    GameDecision Paper = GameDecision.PAPER;
    GameDecision Scissors = GameDecision.SCISSORS;

    int rounds = 0;
    int P1wins = 0;
    int P2wins = 0;
    while (rounds < 3) {


        //compare ref not numbers!!!!!!!!!!!!!!!!!!!

        //only 2 plyers
        PlayerChoice P1 = new PlayerChoice();
        PlayerChoice P2 = new PlayerChoice();
        System.out.println("Player One picks " + GameDecision.getName(P1.randomNumber));
        System.out.println("Player Two picks " + GameDecision.getName(P2.randomNumber));
        System.out.println();

        //P1.randomNumber = 10; //NOOOOOOO


        if (P1.randomNumber == Rock.getChoice() && P2.randomNumber == Scissors.getChoice() || P1.randomNumber == Paper.getChoice() && P2.randomNumber == Rock.getChoice() || P1.randomNumber == Scissors.getChoice() && P2.randomNumber == Paper.getChoice()) {
            P1wins++;
        }
        else if (P2.randomNumber == Rock.getChoice() && P1.randomNumber == Scissors.getChoice() || P2.randomNumber == Paper.getChoice() && P1.randomNumber == Rock.getChoice() || P2.randomNumber == Scissors.getChoice() && P1.randomNumber == Paper.getChoice()) {
            P2wins++;
        }
        rounds++;
    }
    if (P1wins > P2wins) {
        System.out.println("Congrats " + "\n" + "Player One won " + P1wins + " out of " + rounds + " rounds");
    }
    else if (P1wins < P2wins){
        System.out.println("Congrats " + "\n" + "Player Two won " + P2wins + " out of " + rounds + " rounds");
    }
    else if (P1wins == P2wins){
        System.out.println("Guess nobody wins " + "\n" + "P1 wins = " + P1wins + "\n" + "P2 wins = "+ P2wins);
    }
}
}
