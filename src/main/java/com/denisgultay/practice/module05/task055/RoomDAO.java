package com.denisgultay.practice.module05.task055;

import com.denisgultay.practice.module05.task051_052.Room;

public interface RoomDAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
