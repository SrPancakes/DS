package e1.states;

import e1.Room;

public interface RoomState {

    void book(String client, Room room);

    void cancelBook(Room room);

    void freeRoom(Room room);

    String information(String client);

}
