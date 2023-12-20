package e1.substates;

import e1.Room;

public class PendingRoom implements RoomSubState {

    final private static PendingRoom instance = new PendingRoom();

    @Override
    public void clean(String cleaner, Room room) {
        room.setSubState(PendingApprovalRoom.getInstance());
    }

    @Override
    public void freeRoom(Room room) {
    }

    @Override
    public void aprooveRoom(String supervisor, Room room) {
    }

    @Override
    public String information(String supervisor, String cleaner) {
        return "Cleaning pending.";
    }

    public static PendingRoom getInstance() { return instance; }

}
