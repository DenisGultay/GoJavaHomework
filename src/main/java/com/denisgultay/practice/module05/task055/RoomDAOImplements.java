package com.denisgultay.practice.module05.task055;

import com.denisgultay.practice.module05.task051_052.Room;

public class RoomDAOImplements implements RoomDAO {

    private Room[] totalRoomsBase = new Room[0];

    public Room save(Room room) {
          Room [] newRoomsBase = new Room[totalRoomsBase.length];
        for (int i = 0; i < totalRoomsBase.length; i++) {
            newRoomsBase = arraysExtends(totalRoomsBase, room);
        }
        System.out.println(room.toString() + "was saved");
        return room;
    }

    public boolean delete(Room room) {
        Room [] newRoomsBase = new Room[totalRoomsBase.length];
        for (int i = 0; i < totalRoomsBase.length; i++) {
            if (room.equals(totalRoomsBase[i])) {
                totalRoomsBase[i] = null;
            }
        }
        newRoomsBase = arrayDecrease(totalRoomsBase);
        return true;
    }

    public Room update(Room room) {
        for (int i = 0; i < totalRoomsBase.length; i++) {
            if(room.getId()!= totalRoomsBase[i].getId()){
                save(room);
            }
        }
        System.out.println("Room: " + room.toString() + " " + "added");
        return room;
    }

    public Room findById(long id) {
        Room roomByID = new Room();
        for (int i = 0; i < totalRoomsBase.length; i++) {
            if (id == totalRoomsBase[i].getId()) {
                roomByID = totalRoomsBase[i];
                System.out.println(roomByID.toString());
            } else {
                System.out.println("Room not found");
            }
        }
        return roomByID;
    }

    public Room[] arraysExtends(Room[] rooms, Room newElement) {       // метод для розширення массиву
        Room[] newArray = new Room[rooms.length + 1];
        for (int i = 0; i < rooms.length; i++) {
            newArray[i] = rooms[i];
            newArray[newArray.length - 1] = newElement;
        }
        //          System.out.println(Arrays.toString(newArray));
        return newArray;
    }

    public Room[] arrayDecrease(Room[] array) {         // метод для зменшення массиву(відкидаємо "null")
        int nullElements = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                nullElements++;
            }
        }
        int newSize = array.length - nullElements;
        Room[] newRoomsArray = new Room[newSize];
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != null) {
                newRoomsArray[count] = array[i];
                count++;
            }
        }
        //      System.out.println(Arrays.toString(newRoomsArray));
        return newRoomsArray;
    }
}
