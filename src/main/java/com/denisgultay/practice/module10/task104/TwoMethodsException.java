package com.denisgultay.practice.module10.task104;

import com.denisgultay.practice.module10.task102.MyFirstException;

public class TwoMethodsException {

    public static void main(String[] args) {
        try {
            f();
        } catch (MySecondException se) {
            se.printException();
        }
    }

    public static void f() throws IndexOutOfBoundsException {
        try {
            g();
        } catch (MyFirstException ex) {
            ex.printException();
            MySecondException mse = new MySecondException("This is exception from \"f\"");
            mse.printException();
            throw mse;
        }
    }

    public static void g() {
        MyFirstException mfe = new MyFirstException("This is exception from \"g\"");
    }
}
