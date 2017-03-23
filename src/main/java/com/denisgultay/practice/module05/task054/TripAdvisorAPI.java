package com.denisgultay.practice.module05.task054;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.RoomAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class TripAdvisorAPI implements RoomAPI {

    private Room[] roomsBase = new Room[5];

    public TripAdvisorAPI() {
        Room trAdRoom1 = new Room(11, 200, 3, "Geneva", "Truskavec");
        Room trAdRoom2 = new Room(12, 100, 1, "Lviv-Hotel", "Lviv");
        Room trAdRoom3 = new Room(13, 300, 2, "Bukovel-hotel", "Bukovel");
        Room trAdRoom4 = new Room(14, 100, 1, "Lviv-Hotel", "Lviv");
        Room trAdRoom5 = new Room(15, 400, 3, "Vlasta", "Lviv");

        roomsBase[0] = trAdRoom1;
        roomsBase[1] = trAdRoom2;
        roomsBase[2] = trAdRoom3;
        roomsBase[3] = trAdRoom4;
        roomsBase[4] = trAdRoom5;
    }


    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] roomsByParameters = new Room[roomsBase.length];
        int count = 0;
        for (int i = 0; i < roomsBase.length; i++) {
            if (price == roomsBase[i].getPrice() && persons == roomsBase[i].getPersons() && city == roomsBase[i].getCityName() && hotel == roomsBase[i].getHotelName())
                roomsByParameters[count] = roomsBase[i];
            count++;
        }
        roomsByParameters = arrayDecrease(roomsByParameters);
        //       System.out.println(Arrays.toString(roomsByParameters));
        return roomsByParameters;
    }

    public Room[] arraysExtends(Room[] rooms, Room newElement) {     // метод для розширення массиву
        Room[] newArray = new Room[rooms.length + 1];
        for (int i = 0; i < rooms.length; i++) {
            newArray[i] = rooms[i];
            newArray[newArray.length - 1] = newElement;
        }
        //     System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public Room[] arrayDecrease(Room[] array) {          // метод для зменшення массиву(відкидаємо "null")
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

    public Room[] getRooms() {
        return roomsBase;
    }
}
