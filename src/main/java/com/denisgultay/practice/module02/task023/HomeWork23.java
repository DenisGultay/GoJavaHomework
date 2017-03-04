package com.denisgultay.practice.module02.task023;

/**
 * Created by Користувач on 01.02.2017.
 */
public class HomeWork23 {

    String[] ownerNames = {"Monika", "Rachel", "Phoebe", "Joey", "Chandler", "Ross"};
    int[] balance = {1300, 1000, 500, 200, 1200, 1500};


    public static void main(String[] args) {
        HomeWork23 transaction = new HomeWork23();
        transaction.arrayTransaction("Denis", 200);
    }

    public void arrayTransaction(String ownerName, int withdrawal) {
        double commision = withdrawal * 0.05;
        int position = 0;
        for (int i = -1; i < ownerNames.length; i++) {
            if (ownerNames[i] == ownerName) {
                position = i;
            } else {
                System.out.println("Wrong owner name");
            }
            break;
        }
        double newBalance = balance[position] - withdrawal - commision;
        if ((withdrawal + commision) > balance[position]) {
            System.out.println(ownerName + " " + "NO");
        }
        System.out.println(ownerName + " " + withdrawal + " " + newBalance);
    }
}

