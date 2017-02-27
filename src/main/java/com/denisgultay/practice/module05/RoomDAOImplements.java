package com.denisgultay.practice.module05;

import com.denisgultay.practice.module05.task051.Room;

public class RoomDAOImplements implements RoomDAO {

    Room[] roomsBase;

    public Room save(Room room) {
        int count = getRoomsNumber(roomsBase);
        roomsBase [count] = room;
        return room;
    }

    private int getRoomsNumber (Room[] roomsBase){
        int count = 0;
        for (Room room: roomsBase) {
            if (roomsBase != null) {
                count++;
            }
        }
        return count;
    }

    public boolean delete(Room room) {
        for (int i = 0; i < roomsBase.length ; i++) {
            Room roomInBase = roomsBase[i];
            if (room.equals(roomInBase)){
                System.arraycopy(roomsBase, i+1, roomsBase, i, roomsBase.length-i-1);
            roomsBase[roomsBase.length-1] = null;
            }
        }
        return true;
    }

    public Room update(Room room) {


        return null;
    }

    public Room findById(long id) {
        return null;
    }
}
