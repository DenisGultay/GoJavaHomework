package com.denisgultay.practice.module04.task043;

import com.denisgultay.practice.module04.task041.Bank;
import com.denisgultay.practice.module04.task042.Currency;

public class USBank extends Bank {

    public USBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }

    public int getLimitOfWithdrawl() {
        getCurrency();
        int limitOfWithdrawl = 0;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawl = 1000;
        } else {
            limitOfWithdrawl = 1200;
        }
        return limitOfWithdrawl;
    }

    public int getLimitOfFunding() {
        getCurrency();
        int limitOfFunding;
        if (getCurrency() == Currency.EUR) {
            limitOfFunding = 10000;
        } else {
            limitOfFunding = 0;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate() {
        getCurrency();
        int valueOfRate;
        if (getCurrency() == Currency.USD) {
            valueOfRate = 1;
        } else {
            valueOfRate = 2;
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
                    valueOfCommision = 6;
                } else {
                    valueOfCommision = 8;
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