package com.denisgultay.practice.module04.task041;

public class Main {

    public static void main(String[] args) {

        EUBank raiffaizen = new EUBank(111111L, "Germany", Currency.EUR, 250, 1500.0, 150L, 15000000L);
        EUBank creditAgricol = new EUBank(222222L, "France", Currency.EUR, 300, 1800.0, 165L, 20000000L);
        USBank bankOfAmerica = new USBank(333333L, "USA", Currency.USD, 350, 2100.0, 110l, 18000000L);
        System.out.println(raiffaizen.getLimitOfWithdrawl());
        System.out.println(bankOfAmerica.getCommission(2500));
        System.out.println(creditAgricol.getLimitOfFunding());
        System.out.println(creditAgricol.moneyPaidMonthlyForSalary());

    }
}
