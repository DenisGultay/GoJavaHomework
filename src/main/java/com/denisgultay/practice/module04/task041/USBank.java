package com.denisgultay.practice.module04.task041;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    int getLimitOfWithdrawl() {
        getCurrency();
        int limitOfWithdrawl = 0;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawl = 1000;
        } else {
            limitOfWithdrawl = 1200;
        }
        return limitOfWithdrawl;
    }

    int getLimitOfFunding() {
        getCurrency();
        int limitOfFunding;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 10000;
        } else {
            limitOfFunding = 0;
        }
        return limitOfFunding;
    }

    int getMonthlyRate() {
        getCurrency();
        int valueOfRate;
        if (getCurrency() == Currency.USD) {
            valueOfRate = 1;
        } else {
            valueOfRate = 2;
        }
        return valueOfRate;
    }

    int getCommission(int summ) {
        getCurrency();
        int valueOfCommision;
        if (getCurrency() == Currency.USD && summ < 1000) {
            valueOfCommision = 5;
        } else {
            if (getCurrency() == Currency.USD && summ > 1000) {
                valueOfCommision = 7;
            } else {
                if (getCurrency() == Currency.EUR && summ < 1000) {
                    valueOfCommision = 6;
                } else {
                    valueOfCommision = 8;
                }
            }
        }
        return valueOfCommision;
    }

    @Override
    double moneyPaidMonthlyForSalary() {
        double moneyPaidMonthlyForSalary = getAvrSalaryOfEmployee() * getNumberOfEmployees();
        return super.moneyPaidMonthlyForSalary();
    }
}
