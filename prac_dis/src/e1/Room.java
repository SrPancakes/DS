package e1;

import e1.states.FreeRoom;
import e1.states.RoomState;
import e1.substates.AvailableRoom;
import e1.substates.RoomSubState;

public class Room {

    private String client, supervisor, cleaner;

    private RoomState state = FreeRoom.getInstance();
    private RoomSubState subState = AvailableRoom.getInstance();

    public Room(String supervisor){
        this.supervisor = supervisor;
    }

    public void book(String client){
        this.client = client;
        aprooveRoom(supervisor);
        state.book(client, this);
    }

    public void cancelBook(){
        state.cancelBook(this);
    }

    public void clean(String cleaner){
        this.cleaner = cleaner;
        subState.clean(cleaner, this);
    }

    public void freeRoom(){
        state.freeRoom(this);
    }

    public void aprooveRoom(String supervisor){
        this.supervisor = supervisor;
        subState.aprooveRoom(supervisor, this);
    }

    public void setState(RoomState state){
        this.state = state;
    }

    public RoomState getState() {
        return state;
    }

    public void setSubState(RoomSubState subState){
        this.subState = subState;
    }

    public RoomSubState getSubState(){return subState;}

    @Override
    public String toString(){
        return state.information(client) + " " + subState.information(supervisor, cleaner);
    }

}
