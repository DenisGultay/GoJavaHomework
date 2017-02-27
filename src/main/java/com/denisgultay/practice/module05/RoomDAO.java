package com.denisgultay.practice.module05;

public interface RoomDAO {

    Room save(Room room);
    boolean delete(Room room);
    Room update(Room room);
    Room findById(long id);
}
