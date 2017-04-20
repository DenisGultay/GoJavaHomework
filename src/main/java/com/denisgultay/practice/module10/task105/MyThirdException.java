package com.denisgultay.practice.module10.task105;

public class MyThirdException  extends ArithmeticException{

    private String exceptMessage;

    public MyThirdException(String st) {
        super(st);
        exceptMessage = st;
    }

    public void printException(){
        System.out.println(exceptMessage);
    }
}
