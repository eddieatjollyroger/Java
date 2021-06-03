package org.academiadecodigo.bootcamp;

public class Wallet {
    private int Money;

    public int moneyInWallet() {
        return Money;
    }

    public void addMoneyToWallet(int money) {
        Money += money;
        System.out.println("Moved " + money + "$ to wallet"); // + "\nTotal in wallet is " + Money + "$");
    }

    public void deposit (int money) {
        Money -= money;
        System.out.println("Took out " + money + "$ from wallet"); // + "\nTotal in wallet is " + Money + "$");
    }
}
