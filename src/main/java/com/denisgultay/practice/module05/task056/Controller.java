package com.denisgultay.practice.module05.task056;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.RoomAPI;
import com.denisgultay.practice.module05.task054.BookingComAPI;
import com.denisgultay.practice.module05.task054.GoogleAPI;
import com.denisgultay.practice.module05.task054.TripAdvisorAPI;

public class Controller {

    public RoomAPI[] apis = new RoomAPI[3];

    public Controller() {
        apis[1] = new BookingComAPI();
        apis[2] = new GoogleAPI();
        apis[3] = new TripAdvisorAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        return new Room[5];
    }
}



