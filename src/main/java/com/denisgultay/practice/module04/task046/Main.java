package com.denisgultay.practice.module04.task046;

import com.denisgultay.practice.module04.task042.Currency;
import com.denisgultay.practice.module04.task043.ChinaBank;
import com.denisgultay.practice.module04.task043.EUBank;
import com.denisgultay.practice.module04.task043.USBank;
import com.denisgultay.practice.module04.task044.UserOfBank;
import com.denisgultay.practice.module04.task045.BankSystemImplements;

public class Main {

    public static void main(String[] args) {

        EUBank raiffaizenBank = new EUBank(111111L, "Germany", Currency.EUR, 250, 1500.0, 150L, 15000000L);
        USBank bankOfAmerica = new USBank(333333L, "USA", Currency.USD, 350, 2100.0, 110l, 18000000L);
        ChinaBank bankOfChina = new ChinaBank(444444L, "China", Currency.USD, 500, 1300, 250l, 25000000L);

        BankSystemImplements user = new BankSystemImplements();

        UserOfBank newUser1 = new UserOfBank();
        newUser1.setId(100001L);
        newUser1.setName("Rachel");
        newUser1.setBalance(5000.0);
        newUser1.setMonthsOfEmployment(5);
        newUser1.setCompanyName("Central Perk");
        newUser1.setSalary(1000);
        newUser1.setBank(raiffaizenBank);

        UserOfBank newUser2 = new UserOfBank();
        newUser2.setId(200002L);
        newUser2.setName("Phoebe");
        newUser2.setBalance(2000.0);
        newUser2.setMonthsOfEmployment(6);
        newUser2.setCompanyName("Saloon");
        newUser2.setSalary(700);
        newUser2.setBank(raiffaizenBank);

        UserOfBank newUser3 = new UserOfBank();
        newUser3.setId(300003L);
        newUser3.setName("Monika");
        newUser3.setBalance(8000.0);
        newUser3.setMonthsOfEmployment(12);
        newUser3.setCompanyName("Alexander");
        newUser3.setSalary(1500);
        newUser3.setBank(bankOfAmerica);

        UserOfBank newUser4 = new UserOfBank();
        newUser4.setId(400004L);
        newUser4.setName("Joye");
        newUser4.setBalance(6000.0);
        newUser4.setMonthsOfEmployment(3);
        newUser4.setCompanyName("Hollywood");
        newUser4.setSalary(2000);
        newUser4.setBank(bankOfAmerica);

        UserOfBank newUser5 = new UserOfBank();
        newUser5.setId(500005L);
        newUser5.setName("Chandler");
        newUser5.setBalance(12000.0);
        newUser5.setMonthsOfEmployment(24);
        newUser5.setCompanyName("Statistic company");
        newUser5.setSalary(1800);
        newUser5.setBank(bankOfChina);

        UserOfBank newUser6 = new UserOfBank();
        newUser6.setId(600006L);
        newUser6.setName("Ross");
        newUser6.setBalance(15000.0);
        newUser6.setMonthsOfEmployment(18);
        newUser6.setCompanyName("Museum of paleontology");
        newUser6.setSalary(1600);
        newUser6.setBank(bankOfChina);

        user.withdrawOfUser(newUser1, 300);
        user.fundUser(newUser1, 250);
        user.transferMoney(newUser1, newUser2, 400);
        user.paySalary(newUser1);

        System.out.println();

        user.withdrawOfUser(newUser2, 2000);
        user.fundUser(newUser2, 13500);
        user.transferMoney(newUser2, newUser3, 250);
        user.paySalary(newUser2);

        System.out.println();

        user.withdrawOfUser(newUser3, 1500);
        user.fundUser(newUser3, 3500);
        user.transferMoney(newUser3, newUser5, 450);
        user.paySalary(newUser3);

        System.out.println();

        user.withdrawOfUser(newUser4, 22000);
        user.fundUser(newUser4, 500);
        user.transferMoney(newUser4, newUser1, 2500);
        user.paySalary(newUser4);

        System.out.println();

        user.withdrawOfUser(newUser5, 4500);
        user.fundUser(newUser5, 3500);
        user.transferMoney(newUser5, newUser6, 500);
        user.paySalary(newUser5);

        System.out.println();

        user.withdrawOfUser(newUser6, 500);
        user.fundUser(newUser6, 1000);
        user.transferMoney(newUser6, newUser2, 300);
        user.paySalary(newUser6);

    }
}


