package com.denisgultay.practice.module10.task102;

public class MainForMyFirstException {

    public static void main(String[] args) {

        MyFirstException mfe = new MyFirstException("This is my exception!");
        try {
            throw mfe;
        } catch (MyFirstException e) {
            e.printException();
            System.out.println("We catch " + e.getClass().getName() + " exception");
        }finally {
            System.out.println("I work everytime");
        }

        System.out.println("-----------------------------------------------------------");

        try {
            throw new MyFirstException("Another my exception!");
        } catch (MyFirstException ex) {
            ex.printException();
            System.out.println("We catch " + ex.getClass().getName() + " exception");
        }
    }
}
