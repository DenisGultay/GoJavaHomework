package com.denisgultay.practice.module05.task054;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.RoomAPI;

public class GoogleAPI implements RoomAPI {

    public Room findRooms(int price, int persons, String city, String hotel) {

        for (int i = 0; i < roomsBase.length; i++) {
            Room room = null;
            if (room != null && room.equals(roomsBase[i])) {

                return roomsBase[i];
            }
        }
        return null;
    }
}
