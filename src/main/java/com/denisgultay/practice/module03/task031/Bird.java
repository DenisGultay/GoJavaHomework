package com.denisgultay.practice.module03.task031;

public class Bird {

    public static void main(String[] args) {

        Bird myBird = new Bird();
        myBird.someoneSing("I am");
    }

    public void someoneSing(String a) {

        System.out.println(a + " walking");
        System.out.println(a + " flying");
        System.out.println(a + " singing");
        System.out.println(a + " Bird");
    }
}
