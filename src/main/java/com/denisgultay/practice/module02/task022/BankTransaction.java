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

        double commision = withdrawal * 0.05;

        double newBalance = balance - withdrawal - commision;

        if ((withdrawal + commision) <= balance) {

            System.out.println("OK " + commision + " " + newBalance);

        } else
            System.out.println("NO");


    }
}
