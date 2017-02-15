package com.denisgultay.practice.module04.task041;

public class EUBank extends Bank{

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    int getLimitOfWithdrawl() {
        getCurrency();
        int limitOfWithdrawl = 0;
        if (getCurrency() == Currency.USD){
            limitOfWithdrawl = 2000;
        }
         else {
                limitOfWithdrawl = 2200;
        }
        return limitOfWithdrawl;
    }


    int getLimitOfFunding() {
        getCurrency();
        int limitOfFunding;
        if (getCurrency() == Currency.USD){
            limitOfFunding = 10000;
        } else {
            limitOfFunding = 20000;
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
