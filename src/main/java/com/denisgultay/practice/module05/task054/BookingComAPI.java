package com.denisgultay.practice.module05.task054;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.ArraysChange;
import com.denisgultay.practice.module05.task053.RoomAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class BookingComAPI implements RoomAPI {

    private Room[] roomsBase = new Room[5];

    public BookingComAPI() {
        Room bComRoom1 = new Room(1, 100, 1, "Lviv-Hotel", "Lviv");
        Room bComRoom2 = new Room(2, 200, 1, "Premier Palace", "Kyiv");
        Room bComRoom3 = new Room(3, 100, 1, "Lviv-Hotel", "Lviv");
        Room bComRoom4 = new Room(4, 200, 2, "Perlyna", "Stryi");
        Room bComRoom5 = new Room(5, 100, 1, "Star", "Stryi");

        roomsBase[0] = bComRoom1;
        roomsBase[1] = bComRoom2;
        roomsBase[2] = bComRoom3;
        roomsBase[3] = bComRoom4;
        roomsBase[4] = bComRoom5;
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] roomsByParameters = new Room[roomsBase.length];
        int count = 0;
        for (int i = 0; i < roomsBase.length; i++) {
            if (price == roomsBase[i].getPrice() && persons == roomsBase[i].getPersons() && city.equals(roomsBase[i].getCityName()) && hotel.equals(roomsBase[i].getHotelName())) {
                roomsByParameters[count] = roomsBase[i];
                count++;
            }
        }
        roomsByParameters = ArraysChange.arrayDecrease(roomsByParameters);
        //                 System.out.println(Arrays.toString(roomsByParameters));
        return roomsByParameters;
    }

    public Room[] getRooms() {
        return roomsBase;
    }

}