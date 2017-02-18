package com.denisgultay.practice.module04.task041;

public class BankSystemImplements implements BankSystem {


    public void withdrawOfUser(UserOfBank user, int amountOfWithdrawl) {

        double commisionOfTransaction = amountOfWithdrawl * user.getBank().getCommission(amountOfWithdrawl) / 100;
        double newBalance = user.getBalance() - amountOfWithdrawl - commisionOfTransaction;
        if ((amountOfWithdrawl + commisionOfTransaction) <= user.getBalance() && amountOfWithdrawl < user.getBank().getLimitOfWithdrawl()) {
            System.out.println("OK; " + " Знято: " + amountOfWithdrawl + " ; " + "Комісія транзакції: " + commisionOfTransaction + " ; " + "Баланс: " + newBalance);
        } else {
            System.out.println("NO");
        }
    }

    public void fundUser(UserOfBank user, int amountOfFunding) {
        double newBalance = user.getBalance() + amountOfFunding;
        if (amountOfFunding > user.getBank().getLimitOfFunding()) {
            System.out.println("NO" + " Перевищена сума транзакції!!!");
        } else {
            System.out.println("OK; " + "Внесено на рахунок: " + amountOfFunding + " ; " + "Баланс: " + newBalance);
        }

    }

    public void transferMoney(UserOfBank fromUser, UserOfBank toUser, int amount) {

    }

    public void paySalary(UserOfBank user) {

    }

}
