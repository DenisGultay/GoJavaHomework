package com.denisgultay.practice.module02.task022;

/**
 * Created by Користувач on 01.02.2017.
 */
public class BankTransaction {

    public static void main(String[] args) {
        BankTransaction transaction = new BankTransaction();
        transaction.singleTransaction(500, 480);
        transaction.singleTransaction(1500, 300);
    }

    public void singleTransaction(int balance, int withdrawal) {
        double persentOfCommission = 0.05;
        double commisionOfTransaction = withdrawal * persentOfCommission;
        double newBalance = balance - withdrawal - commisionOfTransaction;
        if ((withdrawal + commisionOfTransaction) <= balance) {
            System.out.println("OK " + commisionOfTransaction + " " + newBalance);
        } else {
            System.out.println("NO");
        }
    }
}
