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

        Room[] allRequestRooms = new Room[apis[0].findRooms(price, persons, city, hotel).length];
        for (int i = 0; i < apis[0].findRooms(price, persons, city, hotel).length; i++) {
            allRequestRooms = apis[0].findRooms(price, persons, city, hotel);
        }
        for (int i = 0; i < apis[1].findRooms(price, persons, city, hotel).length; i++) {
            if (allRequestRooms.length == 0) {
                allRequestRooms = apis[1].findRooms(price, persons, city, hotel);
            } else {
                allRequestRooms = apis[1].arraysExtends(allRequestRooms, apis[1].findRooms(price, persons, city, hotel)[i]);
            }
        }
        for (int i = 0; i < apis[2].findRooms(price, persons, city, hotel).length; i++) {
            if (allRequestRooms.length == 0) {
                allRequestRooms = apis[2].findRooms(price, persons, city, hotel);
            } else {
                allRequestRooms = apis[2].arraysExtends(allRequestRooms, apis[2].findRooms(price, persons, city, hotel)[i]);
            }
        }
        System.out.println(Arrays.toString(allRequestRooms));
        return allRequestRooms;
    }

    public Room[] check(RoomAPI api1, RoomAPI api2) {
        Room[] checkRooms = new Room[2];
 //       int count = 0;
        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
                if(api1.getRooms()[i].equals(api2.getRooms()[j])) {
                    checkRooms[0] = api1.getRooms()[i];
                    checkRooms[1] = api1.getRooms()[j];
                }
      //              count++;
    //                checkRooms = api2.arraysExtends(checkRooms, api2.getRooms()[j]);

            }
        }
        System.out.println(Arrays.toString(checkRooms));
            return checkRooms;
        }


    }










