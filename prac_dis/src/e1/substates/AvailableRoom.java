package e1.substates;

import e1.Room;

public class AvailableRoom implements RoomSubState {

    final private static AvailableRoom instance = new AvailableRoom();

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
        return "This room was approved by " + supervisor + ".";
    }

    public static AvailableRoom getInstance(){return instance;}
}
