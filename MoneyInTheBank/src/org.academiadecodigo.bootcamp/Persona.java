package org.academiadecodigo.bootcamp;

public class Persona {

    private Wallet wallet;
    private Bank bank;
    private String name;

    public Persona() {
    this.wallet = new Wallet();
    this.bank = new Bank();
    }
public void withdraw(int money) {
        bank.withdraw(money);
        wallet.addMoneyToWallet(money);
}
public void deposit(int money) {
        wallet.deposit(money);
        bank.addMoneyToBank(money);

    }
public void spendMoney(int money) {
        wallet.deposit(money);
}
public void receiveMoney(int money) {
        wallet.addMoneyToWallet(money);
}

    public int moneyInBank() {
        return bank.moneyInBank();
    }
    public int moneyInWallet(){
        return wallet.moneyInWallet();
    }
}
