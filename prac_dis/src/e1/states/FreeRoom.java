package e1.states;

import e1.Room;

public class FreeRoom implements RoomState {

    final private static FreeRoom instance = new FreeRoom();

    @Override
    public void book(String client, Room room) {
        room.setState(BookedRoom.getInstance());
    }

    @Override
    public void cancelBook(Room room) {
    }

    @Override
    public void freeRoom(Room room) {

    }

    @Override
    public String information(String client) {
        return "Free.";
    }

    public static FreeRoom getInstance() { return instance; }



}
