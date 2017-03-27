package com.denisgultay.practice.module05.task053;

import com.denisgultay.practice.module05.task051_052.Room;

public final class ArraysChange {

    private ArraysChange() {
    }

    public static final Room[] arraysExtends(Room[] rooms, Room newElement) {       // метод для розширення массиву
        Room[] newArray = new Room[rooms.length + 1];
        for (int i = 0; i < rooms.length; i++) {
            newArray[i] = rooms[i];
            newArray[newArray.length - 1] = newElement;
        }
        //          System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public static final Room[] arrayDecrease(Room[] array) {         // метод для зменшення массиву(відкидаємо "null")
        int nullElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                nullElements++;
            }
        }
        int newSize = array.length - nullElements;
        Room[] newRoomsArray = new Room[newSize];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                newRoomsArray[count] = array[i];
                count++;
            }
        }
        //      System.out.println(Arrays.toString(newRoomsArray));
        return newRoomsArray;
    }
}
