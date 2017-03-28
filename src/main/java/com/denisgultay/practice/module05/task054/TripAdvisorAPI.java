package com.denisgultay.practice.module05.task054;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.ArraysChange;
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
            if (price == roomsBase[i].getPrice() && persons == roomsBase[i].getPersons() && city.equals(roomsBase[i].getCityName()) && hotel.equals(roomsBase[i].getHotelName())) {
                roomsByParameters[count] = roomsBase[i];
                count++;
            }
        }
        roomsByParameters = ArraysChange.arrayDecrease(roomsByParameters);
        //       System.out.println(Arrays.toString(roomsByParameters));
        return roomsByParameters;
    }

    public Room[] getRooms() {
        return roomsBase;
    }
}
