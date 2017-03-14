package com.denisgultay.practice.module05.task056;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.RoomAPI;
import com.denisgultay.practice.module05.task054.BookingComAPI;
import com.denisgultay.practice.module05.task054.GoogleAPI;
import com.denisgultay.practice.module05.task054.TripAdvisorAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller {

    public static RoomAPI[] apis = new RoomAPI[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        ArrayList<Room> requestRooms = new ArrayList<Room>();
        for (int i = 0; i < apis.length; i++) {
            for (int j = 0; j < apis[i].findRooms(price, persons, city, hotel).length; j++) {
                if (apis[i].findRooms(price, persons, city, hotel)[j] != null) {
                    requestRooms.add(apis[i].findRooms(price, persons, city, hotel)[j]);
                }
            }
        }
        Room[] allRequestRooms = requestRooms.toArray(new Room[requestRooms.size()]);
        System.out.println(Arrays.toString(allRequestRooms));
        return allRequestRooms;
    }

    public Room[] check(RoomAPI api1, RoomAPI api2) {
        ArrayList<Room> listOfRooms = new ArrayList<Room>();
        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    listOfRooms.add(api1.getRooms()[i]);
                    listOfRooms.add(api2.getRooms()[j]);
                }
            }
        }
        Room[] checkRooms = listOfRooms.toArray(new Room[listOfRooms.size()]);
        System.out.println(Arrays.toString(checkRooms));

        return checkRooms;
    }
}










