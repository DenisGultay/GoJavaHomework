package com.denisgultay.practice.module10.task103;

import com.denisgultay.practice.module07.task071.User;

public class TryCatchExample {

    public static void main(String[] args) {

        User nullUser = null;
        try {
            System.out.println(nullUser.getClass());
        } catch (NullPointerException ex) {
        }
    }

}
