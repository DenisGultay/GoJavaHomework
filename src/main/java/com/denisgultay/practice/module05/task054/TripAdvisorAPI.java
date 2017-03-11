package com.denisgultay.practice.module05.task054;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.RoomAPI;

public class TripAdvisorAPI implements RoomAPI {

    public Room[] roomsBase = new Room[5];

    public TripAdvisorAPI() {
        Room trAdRoom1 = new Room(11, 200, 3, "Geneva", "Truskavec");
        Room trAdRoom2 = new Room(12, 300, 2, "Polonuna", "Jaremche");
        Room trAdRoom3 = new Room(13, 300, 2, "Bukovel-hotel", "Bukovel");
        Room trAdRoom4 = new Room(14, 400, 2, "Kosino-hotel", "Kosino");
        Room trAdRoom5 = new Room(15, 400, 3, "Vlasta", "Lviv");

        roomsBase[0] = trAdRoom1;
        roomsBase[1] = trAdRoom2;
        roomsBase[2] = trAdRoom3;
        roomsBase[3] = trAdRoom4;
        roomsBase[4] = trAdRoom5;
    }


    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room[] rooms = new Room[5];
        for (int i = 0; i < roomsBase.length; i++) {
            if (price == roomsBase[i].getPrice() && persons == roomsBase[i].getPersons() && city == roomsBase[i].getCityName() && hotel == roomsBase[i].getHotelName())
                rooms[i] = roomsBase[i];
            if (rooms[i] == null) {

            } else {
                //             System.out.println(rooms[i]);
            }
        }
        return new Room[5];
    }

    public Room[] getRooms() {
        return new Room[0];
    }
}
