package com.denisgultay.practice.module05.task056;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task053.RoomAPI;
import com.denisgultay.practice.module05.task054.BookingComAPI;
import com.denisgultay.practice.module05.task054.GoogleAPI;
import com.denisgultay.practice.module05.task054.TripAdvisorAPI;

import java.util.Arrays;

public class Controller {

    public static RoomAPI[] apis = new RoomAPI[3];

    public Controller() {
        apis[0] = new BookingComAPI();
        apis[1] = new GoogleAPI();
        apis[2] = new TripAdvisorAPI();
    }

    public Room[] requstRooms(int price, int persons, String city, String hotel) {

        Room[] allRequestRooms = new Room[apis.length];
        int count = 0;
        for (int i = 0; i < apis.length; i++) {
            for (int j = 0; j < apis[i].findRooms(price, persons, city, hotel).length; j++) {
                if (apis[i].findRooms(price, persons, city, hotel)[j] != null) {
                    allRequestRooms[count] = apis[i].findRooms(price, persons, city, hotel)[j];
                    System.out.println(allRequestRooms[count]);
                    count++;
                }
            }
        }
        return allRequestRooms;
    }

    public Room[] check(RoomAPI api1, RoomAPI api2) {
        Room[] checkRooms = new Room[apis.length];
        int count = 0;
        for (int i = 0; i < api1.getRooms().length; i++) {
            for (int j = 0; j < api2.getRooms().length; j++) {
              if(api1.getRooms()[i].equals(api2.getRooms()[j])){
                 checkRooms[count] = api1.getRooms()[i];
                 checkRooms[count+1] = api2.getRooms()[j];
                  System.out.println(checkRooms[count]);
                  System.out.println(checkRooms[count + 1]);
              }
            }
        }
        return checkRooms;
    }

}








