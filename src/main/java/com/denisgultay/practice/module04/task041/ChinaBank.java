package com.denisgultay.practice.module04.task041;

public class ChinaBank extends Bank{

    public ChinaBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    int getLimitOfWithdrawl() {
        getCurrency();
        int limitOfWithdrawl = 0;
        if (getCurrency() == Currency.USD){
            limitOfWithdrawl = 100;
        }
        else {
            limitOfWithdrawl = 150;
        }
        return limitOfWithdrawl;
    }

    int getLimitOfFunding() {
        getCurrency();
        int limitOfFunding;
        if (getCurrency() == Currency.USD){
            limitOfFunding = 10000;
        } else {
            limitOfFunding = 5000;
        }
        return limitOfFunding;
    }

    int getMonthlyRate() {
        return 0;
    }

    int getCommission(int summ) {
        return 0;
    }

    double moneyPaidMonthlyForSalary() {
        return 0;
    }
}
