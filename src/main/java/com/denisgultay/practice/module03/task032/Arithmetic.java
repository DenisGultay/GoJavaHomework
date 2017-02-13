package com.denisgultay.practice.module03.task032;

public class Arithmetic {

    public static void main(String[] args) {

        Arithmetic myNumbers = new Arithmetic();
        myNumbers.addNumbers(95, 117);

        System.out.println(myNumbers.addNumbers(45, 15)); // для прикладу

        Adder myAdder = new Adder();
        myAdder.checkNumber(197, 115);
        myAdder.checkNumber(26, 95);

        System.out.println(myAdder.checkNumber(26, 95));   // для прикладу
        System.out.println(myAdder.checkNumber(268, 26));//для прикладу
    }


    public int addNumbers(Integer a, Integer b) {
        return a + b;
    }
}
