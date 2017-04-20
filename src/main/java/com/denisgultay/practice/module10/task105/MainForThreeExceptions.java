package com.denisgultay.practice.module10.task105;

import com.denisgultay.practice.module10.task102.MyFirstException;
import com.denisgultay.practice.module10.task104.MySecondException;

public class MainForThreeExceptions {

    public static void main(String[] args) {
        try {
            threeExceptionsCreator();
        } catch (MyFirstException | MySecondException | MyThirdException allExc) {
            System.out.println("We catch all Exceptions");
        }
    }

    public static void threeExceptionsCreator() throws MyThirdException {

        try {
            throw new MyFirstException("This is ClassCastException!");
        } catch (MyFirstException mfe) {
            try {
                throw new MySecondException("This is IndexOutOfBoundsException");
            } catch (MySecondException mse) {
            }
        }
        throw new MyThirdException("This is ArithmeticException");
    }
}
