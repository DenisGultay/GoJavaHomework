package com.denisgultay.practice.module10.task101;

import com.denisgultay.practice.module10.task102.MyFirstException;

public class MainForExceptions {

    public static void main(String[] args) {

        try {
            throw new Exception("Exeption!!!");
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            System.out.println("It's OK!!!");
        }
    }
}
