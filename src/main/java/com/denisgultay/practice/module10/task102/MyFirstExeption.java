package com.denisgultay.practice.module10.task102;

public class MyFirstExeption extends Exception {

    public MyFirstExeption() {
    }

    public MyFirstExeption(String st) {
        st = new String("Ooops, exception!");
    }
