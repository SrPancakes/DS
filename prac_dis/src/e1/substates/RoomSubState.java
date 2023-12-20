package e1.substates;

import e1.Room;

public interface RoomSubState {

    void clean(String cleaner, Room room);

    void freeRoom(Room room);

    void aprooveRoom(String supervisor, Room room);

    String information(String supervisor, String cleaner);

}
