package engine.world;

import java.util.HashSet;

import engine.items.Item;

public class Room {
    
    private String roomCode;
    private String onFirstEnterMessage;
    private String generalMessage;
    private HashSet<Item> roomItems;
    
    public Room(String roomCode, String onFirstEnterMessage, String generalMessage, HashSet<Item> roomItems){

        this.roomCode = roomCode;
        this.onFirstEnterMessage = onFirstEnterMessage;
        this.generalMessage = generalMessage;

        roomItems = new HashSet<>();

    }
}
