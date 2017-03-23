package com.denisgultay.practice.module05.task057;

import com.denisgultay.practice.module05.task051_052.Room;
import com.denisgultay.practice.module05.task054.BookingComAPI;
import com.denisgultay.practice.module05.task054.GoogleAPI;
import com.denisgultay.practice.module05.task054.TripAdvisorAPI;
import com.denisgultay.practice.module05.task055.RoomDAOImplements;
import com.denisgultay.practice.module05.task056.Controller;

import java.text.DateFormat;

public class MainRoomClass {

    public static void main(String[] args) {

        BookingComAPI bookingComAPI = new BookingComAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        Controller controller = new Controller();
        RoomDAOImplements daoImplements = new RoomDAOImplements();

//        controller.requestRooms(100, 1, "Stryi", "Star");
//        System.out.println();
//        controller.requestRooms(100, 1, "Lviv", "Lviv-Hotel");
//        System.out.println();
//        controller.requestRooms(200, 3, "Truskavec", "Geneva");
//        System.out.println("------------------------------");
//
//        controller.check(bookingComAPI, tripAdvisorAPI);
//        System.out.println();
//        controller.check(bookingComAPI, googleAPI);
//        System.out.println();
//        controller.check(googleAPI, tripAdvisorAPI);
//        System.out.println("------------------------------");

        daoImplements.save(new Room(15, 400, 3, "Vlasta", "Lviv"));
        System.out.println();
        daoImplements.delete(new Room(15, 400, 3, "Vlasta", "Lviv"));
        System.out.println();
        daoImplements.update(new Room(3, 300, 2, "Ukraina", "Kyiv"));
        System.out.println();
        daoImplements.findById(15L);

    }
}

