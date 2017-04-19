package com.denisgultay.practice.module10.task102;

public class MyFirstException extends Exception {

    private String exceptMessage;

    public MyFirstException(String st) {
        super(st);
        exceptMessage = st;
    }

    public void printException(){
        System.out.println(exceptMessage);
    }

}
