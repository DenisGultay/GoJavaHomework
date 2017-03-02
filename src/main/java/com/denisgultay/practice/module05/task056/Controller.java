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

    }
/*  public Room[] requstRooms(int price, int persons, String city, String hotel) {

        for (int i = 0; i < apis.length; i++) {
             if (apis[1].findRooms(200, 2, "Stryi","Perlyna") != null) {
                 int count= 0;
                 Room [] requstRoomsArray = new Room[count];
             }
             if (apis[2].findRooms(200, 2, "Stryi","Perlyna") != null) {
                 if ()
             }

            }

        }

        return new Room[5];
    }

*/
}



