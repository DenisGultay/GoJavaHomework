package com.denisgultay.practice.module05.task057;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task054.BookingComAPI;
import com.denisgultay.practice.module05.task054.GoogleAPI;
import com.denisgultay.practice.module05.task054.TripAdvisorAPI;
import com.denisgultay.practice.module05.task056.Controller;

import java.text.DateFormat;

public class MainRoomClass {

    public static void main(String[] args) {

        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        Controller controller = new Controller();

       controller.requstRooms(100, 1, "Lviv", "Lviv-Hotel");

    }
}

