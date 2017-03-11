package com.denisgultay.practice.module05.task056;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.RoomAPI;
import com.denisgultay.practice.module05.task054.BookingComAPI;
import com.denisgultay.practice.module05.task054.GoogleAPI;
import com.denisgultay.practice.module05.task054.TripAdvisorAPI;

import java.util.Arrays;

public class Controller {

    public RoomAPI[] apis = new RoomAPI[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        int apisLength0 = apis[0].findRooms(price, persons, city, hotel).length;
        int apisLength1 = apis[1].findRooms(price, persons, city, hotel).length;
        int apisLength2 = apis[2].findRooms(price, persons, city, hotel).length;

        Room[] allRequestRooms = new Room[apis.length];
        int count = 0;
        System.arraycopy(apis[0].findRooms(price, persons, city, hotel), count, allRequestRooms, count, apisLength0-1);
        System.arraycopy(apis[1].findRooms(price, persons, city, hotel), count, allRequestRooms, apisLength0, apisLength1);
        System.arraycopy(apis[2].findRooms(price, persons, city, hotel), count, allRequestRooms, (apisLength0 + apisLength1), apisLength2);
        System.out.println(allRequestRooms[count]);
        count++;

        return allRequestRooms;
    }
}








