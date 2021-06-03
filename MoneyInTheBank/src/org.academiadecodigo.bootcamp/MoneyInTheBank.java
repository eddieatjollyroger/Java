package org.academiadecodigo.bootcamp;

public class MoneyInTheBank {
    public static void main(String[] args) {

        System.out.println();
        Persona JohnyBoi = new Persona();
        JohnyBoi.receiveMoney(250);
        JohnyBoi.deposit(200);
        JohnyBoi.spendMoney(30);
        JohnyBoi.withdraw(50);
        System.out.println("______________________________");
        System.out.println("Final money in wallet " + JohnyBoi.moneyInWallet()+ "$\n" + "Final balance in the bank " + JohnyBoi.moneyInBank() + "$");
        System.out.println("______________________________");
    }
    }
