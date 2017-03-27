package com.denisgultay.practice.module05.task056;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.ArraysChange;
import com.denisgultay.practice.module05.task053.RoomAPI;
import com.denisgultay.practice.module05.task054.BookingComAPI;
import com.denisgultay.practice.module05.task054.GoogleAPI;
import com.denisgultay.practice.module05.task054.TripAdvisorAPI;

import java.util.ArrayList;
import java.util.Arrays;

public class Controller {

    ArraysChange arraysChange;

    private static RoomAPI[] apis = new RoomAPI[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requestRooms(int price, int persons, String city, String hotel) {

        Room[] allRequestRooms = apis[0].findRooms(price, persons, city, hotel);
        for (int i = 1; i < apis.length; i++) {
            for (int j = 0; j < apis[i].findRooms(price, persons, city, hotel).length; j++) {
                if (allRequestRooms.length == 0) {
                    allRequestRooms = apis[i].findRooms(price, persons, city, hotel);
                } else {
                    allRequestRooms = arraysChange.arraysExtends(allRequestRooms, apis[i].findRooms(price, persons, city, hotel)[j]);
                }
            }
        }
        System.out.println(Arrays.toString(allRequestRooms));
        return allRequestRooms;
    }

    public Room[] check(RoomAPI api1, RoomAPI api2) {
        Room[] checkRooms = new Room[api1.getRooms().length];
        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
                if (api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    checkRooms[i] = api1.getRooms()[i];
                }
            }
        }
        checkRooms = arraysChange.arrayDecrease(checkRooms);
        for (int i = 1; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
                if (api2.getRooms()[j].equals(api1.getRooms()[i])) {
                    checkRooms = arraysChange.arraysExtends(checkRooms, api2.getRooms()[j]);
                    if (checkRooms[i].getId() == checkRooms[j].getId() && i != j) {
                        checkRooms[i] = null;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(checkRooms));
        return checkRooms;
    }


}










