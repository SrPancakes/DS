package e1.substates;

import e1.Room;

public class BusyRoom implements RoomSubState {

    final private static BusyRoom instance = new BusyRoom();

    @Override
    public void clean(String cleaner, Room room) {
    }

    @Override
    public void freeRoom(Room room) {
        room.setSubState(PendingRoom.getInstance());
    }

    @Override
    public void aprooveRoom(String supervisor, Room room) {
    }

    @Override
    public String information(String supervisor, String cleaner){
        return "Ocuppied";
    }

    public static BusyRoom getInstance() { return instance; }

}
