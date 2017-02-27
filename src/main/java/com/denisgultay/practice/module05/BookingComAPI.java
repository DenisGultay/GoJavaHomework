package com.denisgultay.practice.module05;

public class BookingComAPI implements RoomAPI {

    public Room findRooms(int price, int persons, String city, String hotel) {

        for (int i = 0; i < roomsBase.length ; i++) {
            Room room = null;
            if (room != null && room.equals(roomsBase[i])) {

                return roomsBase[i];
            }
        }
        return null;
    }
}
