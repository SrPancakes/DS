package e1.states;

import e1.Room;

public class BookedRoom implements RoomState {

    final private static BookedRoom instance = new BookedRoom();

    @Override
    public void book(String client, Room room) {
        throw new UnsupportedOperationException("Already booked!");
    }

    @Override
    public void cancelBook(Room room) {
        room.setState(FreeRoom.getInstance());
    }

    @Override
    public void freeRoom(Room room) {
        throw new UnsupportedOperationException("Room is not busy!");
    }

    @Override
    public String information(String client){
        return "Booked by " + client + ".";
    }

    public static BookedRoom getInstance() { return instance; }

}
