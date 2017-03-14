package com.denisgultay.practice.module05.task055;

import com.denisgultay.practice.module05.task051_052.Room;

import java.util.ArrayList;

public class RoomDAOImplements implements RoomDAO {

    private Room[] roomsBase = new Room[5];

    private ArrayList<Room> totalRoomsBase = new ArrayList<Room>();

    public Room save(Room room) {
        for (int i = 0; i < totalRoomsBase.size(); i++) {
            totalRoomsBase.add(room);
        }
        System.out.println(room.toString() + "was saved");
        return room;
    }

    public boolean delete(Room room) {
        for (int i = 0; i < totalRoomsBase.size(); i++) {
            if (room.equals(totalRoomsBase.get(i))) {
                totalRoomsBase.remove(i);
                System.out.println(totalRoomsBase.get(i) + "was deleted");
            }
        }
        return true;
    }

    public Room update(Room room) {
        for (int i = 0; i < totalRoomsBase.size()-1; i++) {
            if(room.getId()!= totalRoomsBase.get(i).getId()){
           }
        }
        save(room);
        System.out.println("Room: " + room.toString() + " " + "added");
        return room;
    }

    public Room findById(long id) {
        for (int i = 0; i < totalRoomsBase.size() - 1; i++) {

            if (id == totalRoomsBase.get(i).getId()) {
                return totalRoomsBase.get(i);
            } else {
                System.out.println("Room not found");
                break;
            }
        }
        return null;
    }
}
