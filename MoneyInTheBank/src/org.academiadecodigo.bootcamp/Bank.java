package org.academiadecodigo.bootcamp;



public class Bank {
private int Money;

    public int moneyInBank() {
        return Money;
    }

    public void addMoneyToBank(int money) {
        Money += money;
        System.out.println("Deposited " + money + "$ in Bank"); // + "\nNew total balance in the bank is " + Money + "$");
    }
    public void withdraw(int money) {
        Money -= money;
        System.out.println("Withdrew " + money + "$ from Bank"); //+ "\nNew total balance in the bank is " + Money + "$");
    }
}
