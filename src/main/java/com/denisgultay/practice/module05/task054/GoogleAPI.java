package com.denisgultay.practice.module05.task054;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.RoomAPI;

public class GoogleAPI implements RoomAPI {

    public Room[] roomsBase;

    public GoogleAPI() {
        Room googleRoom1 = new Room(6,200,3, "Karpaty", "Stryi");
        Room googleRoom2 = new Room(7,200,1, "Nadiya", "Iv.- Frankivsk");
        Room googleRoom3 = new Room(8,300,2, "George", "Lviv");
        Room googleRoom4 = new Room(9,300,2, "Dnipro-hotel", "Dnipro");
        Room googleRoom5 = new Room(10,400,3, "Rixos", "Truskavec");

        roomsBase[0] = googleRoom1;
        roomsBase[1] = googleRoom2;
        roomsBase[2] = googleRoom3;
        roomsBase[3] = googleRoom4;
        roomsBase[4] = googleRoom5;
    }

    public Room[] findRooms(int price, int persons, String city, String hotel) {

        for (int i = 0; i < roomsBase.length; i++) {
            Room room = null;
            if (room != null && room.equals(roomsBase[i])) {
            }
        }
        return new Room[0];
    }
}
