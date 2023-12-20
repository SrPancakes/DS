package e1.substates;

import e1.Room;

public class PendingApprovalRoom implements RoomSubState {

    final private static PendingApprovalRoom instance = new PendingApprovalRoom();
    @Override
    public void clean(String cleaner, Room room) {
    }

    @Override
    public void freeRoom(Room room) {
    }

    @Override
    public void aprooveRoom(String supervisor, Room room) {
        room.setSubState(AvailableRoom.getInstance());
    }

    @Override
    public String information(String supervisor, String cleaner) {
        return "Room cleaned by " + cleaner + ", pending approval.";
    }

    public static PendingApprovalRoom getInstance(){
        return instance;
    }
}
