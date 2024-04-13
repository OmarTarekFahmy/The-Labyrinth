package engine.world;

import java.util.HashSet;

import engine.enemies.Enemy;
import engine.items.Item;

public class Room {
    
    private String roomCode;
    private String onFirstEnterMessage;
    private String generalMessage;
    private String roomItemsAsString; //eg rock;rock;coin;sword
    private HashSet<Item> roomItems;
    private HashSet<Enemy> enemies;
    
    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getOnFirstEnterMessage() {
        return onFirstEnterMessage;
    }

    public void setOnFirstEnterMessage(String onFirstEnterMessage) {
        this.onFirstEnterMessage = onFirstEnterMessage;
    }

    public String getGeneralMessage() {
        return generalMessage;
    }

    public void setGeneralMessage(String generalMessage) {
        this.generalMessage = generalMessage;
    }

    public String getRoomItemsAsString() {
        return roomItemsAsString;
    }

    public void setRoomItemsAsString(String roomItemsAsString) {
        this.roomItemsAsString = roomItemsAsString;
    }

    public HashSet<Item> getRoomItems() {
        return roomItems;
    }

    public void setRoomItems(HashSet<Item> roomItems) {
        this.roomItems = roomItems;
    }

    public Room(String roomCode, String onFirstEnterMessage, String generalMessage, String roomItemsAsString){

        this.roomCode = roomCode;
        this.onFirstEnterMessage = onFirstEnterMessage;
        this.generalMessage = generalMessage;

        this.roomItemsAsString = roomItemsAsString;

    }
}
