package com.denisgultay.practice.module10.task102;

public class MainForMyFirstException {

    public static void main(String[] args) {

        try {
          throw new  MyFirstException("This is my exception!");
        } catch (MyFirstException e) {
            e.printException();
            System.out.println("We catch " + e.getClass().getName() + " exception");
        }finally {
            System.out.println("I work everytime");
        }

        System.out.println("-----------------------------------------------------------");

        try {
            throw new MyFirstException("Another my exception!");
        } catch (MyFirstException fe) {
            System.out.println("We catch " + fe.getClass().getName() + " exception");
        } catch (RuntimeException ex) {
            ex.getStackTrace();
        }
    }
}
