package com.denisgultay.practice.module05.task054;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.RoomAPI;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GoogleAPI implements RoomAPI {

    private Room[] roomsBase = new Room[5];

    public GoogleAPI() {
        Room googleRoom1 = new Room(6, 200, 2, "Karpaty", "Stryi");
        Room googleRoom2 = new Room(7, 100, 1, "Lviv-Hotel", "Lviv");
        Room googleRoom3 = new Room(8, 300, 2, "George", "Lviv");
        Room googleRoom4 = new Room(9, 300, 2, "Dnipro-hotel", "Dnipro");
        Room googleRoom5 = new Room(10, 200, 3, "Geneva", "Truskavec");

        roomsBase[0] = googleRoom1;
        roomsBase[1] = googleRoom2;
        roomsBase[2] = googleRoom3;
        roomsBase[3] = googleRoom4;
        roomsBase[4] = googleRoom5;
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {
        ArrayList<Room> roomsByParametrs = new ArrayList<Room>();
        for (int i = 0; i < roomsBase.length; i++) {
            if (price == roomsBase[i].getPrice() && persons == roomsBase[i].getPersons() && city == roomsBase[i].getCityName() && hotel == roomsBase[i].getHotelName())
                roomsByParametrs.add(roomsBase[i]);
        }
        Room[] newRoomsByParameters = roomsByParametrs.toArray(new Room[roomsByParametrs.size()]);
  //      System.out.println(Arrays.toString(newRoomsByParameters));
        return newRoomsByParameters;
    }

    public Room[] getRooms() {
        return roomsBase;
    }

}