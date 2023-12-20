package e1;

import e1.states.FreeRoom;
import e1.substates.PendingApprovalRoom;
import e1.substates.PendingRoom;

import java.util.ArrayList;
import java.util.List;

public class Hotel {

    final private String name;
    final private List<Room> rooms;

    public Hotel(String name){
        this.name = name;
        rooms = new ArrayList<>();
    }

    public void addRoom(Room room){
        rooms.add(room);
    }

    public void bookRoom(String client, int roomNumber){
        rooms.get(roomNumber).book(client);
    }

    public void cancelBook(int roomNumber){
        rooms.get(roomNumber).cancelBook();
    }

    public void clean(String cleaner, int roomNumber){
        rooms.get(roomNumber).clean(cleaner);
    }

    public void freeRoom(int roomNumber){
        rooms.get(roomNumber).freeRoom();
    }

    public void aprooveRoom(String supervisor, int roomNumber){
        rooms.get(roomNumber).aprooveRoom(supervisor);
    }

    public List<Room> getFreeRoms(){
        List<Room> freeRooms = new ArrayList<>();
        for(Room room : rooms) if(room.getState() == FreeRoom.getInstance()) freeRooms.add(room);
        return freeRooms;
    }

    public List<Room> getPendingRooms(){
        List<Room> pendingRooms = new ArrayList<>();
        for(Room room : rooms) if(room.getSubState() == PendingRoom.getInstance()) pendingRooms.add(room);
        return pendingRooms;
    }

    public List<Room> getPendingAproovalRooms(){
        List<Room> pendingAproovalRooms = new ArrayList<>();
        for(Room room : rooms) if(room.getSubState() == PendingApprovalRoom.getInstance()) pendingAproovalRooms.add(room);
        return pendingAproovalRooms;
    }

    public String getName(){
        return this.name;
    }

    @Override
    public String toString() {
        StringBuilder information = new StringBuilder();
        information.append("---------------------------");
        information.append("\nHotel: " + name);
        information.append("\n---------------------------");
        if(rooms.isEmpty()) information.append("\nNo rooms");
        for(Room room : rooms){
            information.append("\nRoom no. " + (rooms.indexOf(room)+1) + ": " + room.toString());
        }
        information.append("\n---------------------------");
        return information.toString();
    }
}
