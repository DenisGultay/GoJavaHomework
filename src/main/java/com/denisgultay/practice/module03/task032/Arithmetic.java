package com.denisgultay.practice.module03.task032;

public class Arithmetic {

    public static void main(String[] args) {

        Arithmetic myNumbers = new Arithmetic();
        myNumbers.addNumbers(95, 117);

        Adder myAdder = new Adder();
        myAdder.checkNumber(197, 115);
        myAdder.checkNumber(26, 95);
    }


    public int addNumbers(Integer a, Integer b) {
        int sumOfNumbers = a + b;
        System.out.println(sumOfNumbers);
        return sumOfNumbers;
    }
}
