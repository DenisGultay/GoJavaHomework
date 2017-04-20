package com.denisgultay.practice.module10.task104;

public class MySecondException  extends IndexOutOfBoundsException{
    private String exceptMessage;

    public MySecondException(String st) {
        super(st);
        exceptMessage = st;
    }

    public void printException(){
        System.out.println(exceptMessage);
    }
}
