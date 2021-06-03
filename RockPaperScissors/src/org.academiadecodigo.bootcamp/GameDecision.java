package org.academiadecodigo.bootcamp;

public enum GameDecision {
    ROCK(1),
    PAPER(2),
    SCISSORS(3);

    private String name;
    private int choice;
    GameDecision(int choice) {
        this.choice = choice;
    }
public static String getName(int choice) {
     String name = "";
        if (choice == 1) {
         name = "Rock" ;
     }
     else if (choice == 2) {
         name = "Paper";
     }
       else if (choice == 3) {
           name = "Scissors";
        }
       return name;
 //       GameDecision[] instances = GameDecision.values();
   //     GameDecision decision = instances[choice - 1];
    //   decision.name();

}


    public int getChoice(){
        return this.choice;
    }
}
