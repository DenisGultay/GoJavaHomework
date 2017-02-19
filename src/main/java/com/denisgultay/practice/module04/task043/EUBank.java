package com.denisgultay.practice.module04.task043;

import com.denisgultay.practice.module04.task041.Bank;
import com.denisgultay.practice.module04.task042.Currency;

public class EUBank extends Bank {

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    public int getLimitOfWithdrawl() {
        getCurrency();
        int limitOfWithdrawl = 0;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawl = 2000;
        } else {
            limitOfWithdrawl = 2200;
        }
        return limitOfWithdrawl;
    }


    public int getLimitOfFunding() {
        getCurrency();
        int limitOfFunding;
        if (getCurrency() == Currency.USD) {
            limitOfFunding = 10000;
        } else {
            limitOfFunding = 20000;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate() {
        getCurrency();
        int valueOfRate;
        if (getCurrency() == Currency.USD) {
            valueOfRate = 0;
        } else {
            valueOfRate = 1;
        }
        return valueOfRate;
    }

    public int getCommission(int summ) {
        getCurrency();
        int valueOfCommision;
        if (getCurrency() == Currency.USD && summ < 1000) {
            valueOfCommision = 5;
        } else {
            if (getCurrency() == Currency.USD && summ > 1000) {
                valueOfCommision = 7;
            } else {
                if (getCurrency() == Currency.EUR && summ < 1000) {
                    valueOfCommision = 2;
                } else {
                    valueOfCommision = 4;
                }
            }
        }
        return valueOfCommision;
    }

    @Override
    public double moneyPaidMonthlyForSalary() {
        return super.moneyPaidMonthlyForSalary();
    }


}

