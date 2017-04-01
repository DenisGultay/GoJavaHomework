package com.denisgultay.practice.module07.task074;

import java.util.List;

public final class TimeOfMethods {

    private TimeOfMethods() {
    }

    public static final long timeOfAddMethodForInt(List<Integer> list, int numOfList) {
        long start, finish, timeOfMethod;
        start = System.currentTimeMillis();
        for (int i = 0; i < numOfList; i++) {
            list.add(new Integer(i));    // додаємо в кінець списка
  //          list.add(list.size() / 2, new Integer(i));  // додаємо в середину списка
        }
        finish = System.currentTimeMillis();
        timeOfMethod = finish - start;
        return timeOfMethod;
    }

    public static final long timeOfSetMethodForInt(List<Integer> list, int numOfList) {
        for (int i = 0; i < numOfList; i++) {
            list.add(new Integer(i));
        }
        long start, finish, timeOfMethod;
        start = System.currentTimeMillis();
        for (int i = 1; i < numOfList; i++) {
            list.set(5001, i);
        }
        finish = System.currentTimeMillis();
        timeOfMethod = finish - start;
        return timeOfMethod;
    }

    public static final long timeOfGetMethodForInt(List<Integer> list, int numOfList) {
        for (int i = 0; i < numOfList; i++) {
            list.add(new Integer(i));
        }
        long start, finish, timeOfMethod;
        start = System.currentTimeMillis();
        for (int i = 0; i < numOfList; i++) {
            list.get(0);
        }
        finish = System.currentTimeMillis();
        timeOfMethod = finish - start;
        return timeOfMethod;
    }

    public static final long timeOfRemoveMethodForInt(List<Integer> list, int numOfList) {
        for (int i = 0; i < numOfList; i++) {
            list.add(new Integer(i));
        }
        long start, finish, timeOfMethod;
        start = System.currentTimeMillis();
        for (int i = 0; i < numOfList; i++) {
            list.remove(list.size()-1);    // видаляємо останній елемент списка
      //      list.remove(list.size() / 2);  // видаляємо елемент з середини списка
        }
        finish = System.currentTimeMillis();
        timeOfMethod = finish - start;
        return timeOfMethod;
    }


    public static final long timeOfAddMethodForStr(List<String> list, int numOfList) {
        long start, finish, timeOfMethod;
        start = System.currentTimeMillis();
        for (int i = 0; i < numOfList; i++) {
            list.add(new String( "" + i));    // додаємо в кінець списка
  //          list.add(list.size() / 2, new String( "" + i));  // додаємо в середину списка
        }
        finish = System.currentTimeMillis();
        timeOfMethod = finish - start;
        return timeOfMethod;
    }

    public static final long timeOfSetMethodForStr(List<String> list, int numOfList) {
        for (int i = 0; i < numOfList; i++) {
            list.add(new String( "" + i));
        }
        long start, finish, timeOfMethod;
        start = System.currentTimeMillis();
        for (int i = 1; i < numOfList; i++) {
            list.set(5001, "" + i);
        }
        finish = System.currentTimeMillis();
        timeOfMethod = finish - start;
        return timeOfMethod;
    }

    public static final long timeOfGetMethodForStr(List<String> list, int numOfList) {
        for (int i = 0; i < numOfList; i++) {
            list.add(new String( "" + i));
        }
        long start, finish, timeOfMethod;
        start = System.currentTimeMillis();
        for (int i = 0; i < numOfList; i++) {
            list.get(0);
        }
        finish = System.currentTimeMillis();
        timeOfMethod = finish - start;
        return timeOfMethod;
    }

    public static final long timeOfRemoveMethodForStr(List<String> list, int numOfList) {
        for (int i = 0; i < numOfList; i++) {
            list.add(new String( "" + i));
        }
        long start, finish, timeOfMethod;
        start = System.currentTimeMillis();
        for (int i = 0; i < numOfList; i++) {
            list.remove(list.size()-1);    // видаляємо останній елемент списка
      //      list.remove(list.size() / 2);  // видаляємо елемент з середини списка
        }
        finish = System.currentTimeMillis();
        timeOfMethod = finish - start;
        return timeOfMethod;
    }

}
