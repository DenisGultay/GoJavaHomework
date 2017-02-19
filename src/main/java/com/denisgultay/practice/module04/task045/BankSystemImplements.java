package com.denisgultay.practice.module04.task045;

import com.denisgultay.practice.module04.task044.UserOfBank;

public class BankSystemImplements implements BankSystem {

    public void withdrawOfUser(UserOfBank user, int amountOfWithdrawl) {
        double commisionOfTransaction = amountOfWithdrawl * user.getBank().getCommission(amountOfWithdrawl) / 100;
        double newBalance = user.getBalance() - amountOfWithdrawl - commisionOfTransaction;
        if ((amountOfWithdrawl + commisionOfTransaction) <= user.getBalance() && amountOfWithdrawl < user.getBank().getLimitOfWithdrawl()) {
            System.out.println(user.getName() + " : " + " OK; " + " Знято: " + amountOfWithdrawl + " " + user.getBank().getCurrency() + " ; " + "Комісія транзакції: " + commisionOfTransaction + " ; " + "Баланс: " + newBalance + " " + user.getBank().getCurrency());
        } else {
            System.out.println(user.getName() + " : " + " NO; " + "Перевищений ліміт зняття коштів!!!");
        }
    }

    public void fundUser(UserOfBank user, int amountOfFunding) {
        double newBalance = user.getBalance() + amountOfFunding;
        if (amountOfFunding > user.getBank().getLimitOfFunding()) {
            System.out.println(user.getName() + " : " + " NO; " + " Перевищений ліміт внесення коштів");
        } else {
            System.out.println(user.getName() + " : " + " OK; " + "Внесено на рахунок: " + amountOfFunding + " " + user.getBank().getCurrency() + " ; " + "Баланс: " + newBalance + " " + user.getBank().getCurrency());
        }

    }

    public void transferMoney(UserOfBank fromUser, UserOfBank toUser, int amountOfTransaction) {
        double fromUserBalance = fromUser.getBalance() - amountOfTransaction;
        double toUserBalance = toUser.getBalance() + amountOfTransaction;
        if (fromUser.getBank().getCurrency() == toUser.getBank().getCurrency()) {
            System.out.println(fromUser.getName() + " Знято: " + amountOfTransaction + " " + fromUser.getBank().getCurrency() + " ; " + "Баланс: " + fromUserBalance + " " + fromUser.getBank().getCurrency());
            System.out.println(toUser.getName() + " Отримано: " + amountOfTransaction + " " + toUser.getBank().getCurrency() + " ; " + " Баланс: " + toUserBalance + " " + toUser.getBank().getCurrency());
        } else {
            System.out.println("NO; " + "Валюта рахунків не співпадає");
        }
    }

    public void paySalary(UserOfBank user) {
        double balanceAfterSalary = user.getBalance() + user.getSalary();
        System.out.println(user.getName() + " Отримано зарплату: " + user.getSalary() + " " + user.getBank().getCurrency() + " ; " + "Баланс: " + balanceAfterSalary + " " + user.getBank().getCurrency());
    }

}
