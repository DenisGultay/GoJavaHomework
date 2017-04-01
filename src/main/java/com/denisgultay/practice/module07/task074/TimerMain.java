package com.denisgultay.practice.module07.task074;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class TimerMain {

    public final static int NUMM_OF_LIST1000 = 1000;
    public final static int NUMM_OF_LIST10000 = 10000;

    public static void main(String[] args) {

        List<Integer> intArrList = new ArrayList<Integer>();
        List<Integer> intLinkList = new LinkedList<Integer>();
        List<String> strArrList = new ArrayList<String>();
        List<String> strLinkList = new LinkedList<String>();

        System.out.println("The duration of the method 'add' for ArrayList<Integer> " + TimeOfMethods.timeOfAddMethodForInt(intArrList, NUMM_OF_LIST10000) + " ms");
        System.out.println("The duration of the method 'add' for LinkedList<Integer> " + TimeOfMethods.timeOfAddMethodForInt(intLinkList, NUMM_OF_LIST10000) + " ms");
        System.out.println();
        System.out.println("The duration of the method 'set' for ArrayList<Integer> " + TimeOfMethods.timeOfSetMethodForInt(intArrList, NUMM_OF_LIST1000) + " ms");
        System.out.println("The duration of the method 'set' for LinkedList<Integer> " + TimeOfMethods.timeOfSetMethodForInt(intLinkList, NUMM_OF_LIST1000) + " ms");
        System.out.println();
        System.out.println("The duration of the method 'get' for ArrayList<Integer> " + TimeOfMethods.timeOfGetMethodForInt(intArrList, NUMM_OF_LIST10000) + " ms");
        System.out.println("The duration of the method 'get' for LinkedList<Integer> " + TimeOfMethods.timeOfGetMethodForInt(intLinkList, NUMM_OF_LIST10000) + " ms");
        System.out.println();
        System.out.println("The duration of the method 'remove' for ArrayList<Integer> " + TimeOfMethods.timeOfRemoveMethodForInt(intArrList, NUMM_OF_LIST1000) + " ms");
        System.out.println("The duration of the method 'remove' for LinkedList<Integer> " + TimeOfMethods.timeOfRemoveMethodForInt(intLinkList, NUMM_OF_LIST1000) + " ms");

        System.out.println();
        System.out.println();

        System.out.println("The duration of the method 'add' for ArrayList<String> " + TimeOfMethods.timeOfAddMethodForStr(strArrList, NUMM_OF_LIST1000) + " ms");
        System.out.println("The duration of the method 'add' for LinkedList<String> " + TimeOfMethods.timeOfAddMethodForStr(strLinkList, NUMM_OF_LIST1000) + " ms");
        System.out.println();
        System.out.println("The duration of the method 'set' for ArrayList<String> " + TimeOfMethods.timeOfSetMethodForStr(strArrList, NUMM_OF_LIST10000) + " ms");
        System.out.println("The duration of the method 'set' for LinkedList<String> " + TimeOfMethods.timeOfSetMethodForStr(strLinkList, NUMM_OF_LIST10000) + " ms");
        System.out.println();
        System.out.println("The duration of the method 'get' for ArrayList<String> " + TimeOfMethods.timeOfGetMethodForStr(strArrList, NUMM_OF_LIST1000) + " ms");
        System.out.println("The duration of the method 'get' for LinkedList<String> " + TimeOfMethods.timeOfGetMethodForStr(strLinkList, NUMM_OF_LIST1000) + " ms");
        System.out.println();
        System.out.println("The duration of the method 'remove' for ArrayList<String> " + TimeOfMethods.timeOfRemoveMethodForStr(strArrList, NUMM_OF_LIST10000) + " ms");
        System.out.println("The duration of the method 'remove' for LinkedList<String> " + TimeOfMethods.timeOfRemoveMethodForStr(strLinkList, NUMM_OF_LIST10000) + " ms");

    }

}
