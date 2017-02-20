package com.denisgultay.practice.module04.task043;

import com.denisgultay.practice.module04.task041.Bank;
import com.denisgultay.practice.module04.task042.Currency;

public class EUBank extends Bank {

    final int LIMIT_OF_WITHDRAWAL_USD = 2000;
    final int LIMIT_OF_WITHDRAWAL_EUR = 2200;
    final int LIMIT_OF_FUNDING_USD = 10000;
    final int LIMIT_OF_FUNDING_EUR = 20000;
    final int VALUE_OF_RATE_USD = 0;
    final int VALUE_OF_RATE_EUR = 1;
    final int SUMM_FOR_CHANGE_COMMISION = 1000;
    final int VALUE_OF_COMMISION_USD_LESS_1000 = 5;
    final int VALUE_OF_COMMISION_USD_MORE_1000 = 7;
    final int VALUE_OF_COMMISION_EUR_LESS_1000 = 2;
    final int VALUE_OF_COMMISION_EUR_MORE_1000 = 4;

    public EUBank(long id, String bankCountry, Currency currency, int numberOfEmployees, double avrSalaryOfEmployee, long rating, long totalCapital) {
        super(id, bankCountry, currency, numberOfEmployees, avrSalaryOfEmployee, rating, totalCapital);
    }


    public int getLimitOfWithdrawl() {
        int limitOfWithdrawl;
        if (getCurrency() == Currency.USD) {
            limitOfWithdrawl = LIMIT_OF_WITHDRAWAL_USD;
        } else {
            limitOfWithdrawl = LIMIT_OF_WITHDRAWAL_EUR;
        }
        return limitOfWithdrawl;
    }


    public int getLimitOfFunding() {
        int limitOfFunding;
        if (getCurrency() == Currency.USD) {
            limitOfFunding = LIMIT_OF_FUNDING_USD;
        } else {
            limitOfFunding = LIMIT_OF_FUNDING_EUR;
        }
        return limitOfFunding;
    }

    public int getMonthlyRate() {
        int valueOfRate;
        if (getCurrency() == Currency.USD) {
            valueOfRate = VALUE_OF_RATE_USD;
        } else {
            valueOfRate = VALUE_OF_RATE_EUR;
        }
        return valueOfRate;
    }

    public int getCommission(int summ) {
        int valueOfCommision;
        if (getCurrency() == Currency.USD && summ < SUMM_FOR_CHANGE_COMMISION) {
            valueOfCommision = VALUE_OF_COMMISION_USD_LESS_1000;
        } else {
            if (getCurrency() == Currency.USD && summ > SUMM_FOR_CHANGE_COMMISION) {
                valueOfCommision = VALUE_OF_COMMISION_USD_MORE_1000;
            } else {
                if (getCurrency() == Currency.EUR && summ < SUMM_FOR_CHANGE_COMMISION) {
                    valueOfCommision = VALUE_OF_COMMISION_EUR_LESS_1000;
                } else {
                    valueOfCommision = VALUE_OF_COMMISION_EUR_MORE_1000;
                }
            }
        }
        return valueOfCommision;
    }

    public double moneyPaidMonthlyForSalary() {
        return super.moneyPaidMonthlyForSalary();
    }


}

