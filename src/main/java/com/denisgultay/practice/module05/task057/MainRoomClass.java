package com.denisgultay.practice.module05.task057;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task054.BookingComAPI;
import com.denisgultay.practice.module05.task054.TripAdvisorAPI;

import java.text.DateFormat;

public class MainRoomClass {

    public static void main(String[] args) {

        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        bookingComAPI.findRooms(200, 2, "Stryi", "Perlyna");
    }
}

