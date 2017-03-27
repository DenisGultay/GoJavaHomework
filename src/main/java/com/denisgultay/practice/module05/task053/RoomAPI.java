package com.denisgultay.practice.module05.task053;

import com.denisgultay.practice.module05.task051_052.Room;

public interface RoomAPI {

    Room[] findRooms(int price, int persons, String city, String hotel);

    Room[] getRooms();

}


