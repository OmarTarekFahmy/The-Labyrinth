package engine;

import java.util.HashMap;
import java.util.HashSet;


import engine.player.Inventory;
import engine.player.Player;
import engine.registries.ItemRegistry;
import engine.registries.WeaponRegistry;
import engine.text.TextWriter;
import engine.world.Room;
import engine.dataloader.*;
import engine.enemies.EnemyRegistry;
import engine.parser.PRSAction;
import engine.parser.TextParser;

public class Game {

    private Player player;
    private int[] settings;
    private HashMap<String, Room> rooms;
    private HashMap<String, ItemRegistry> items;
    private HashMap<String, WeaponRegistry> weapons;
    private HashMap<String, EnemyRegistry> enemies;
    private HashMap<PRSAction, HashSet<ItemRegistry>> actionItemMap;
    private Room currentRoom;
    private TextWriter writer;

    public Game(){

        rooms = Dataloader.readRooms();
        weapons = Dataloader.readWeaponRegistry();
        settings = Dataloader.readSettings();
        items = Dataloader.readItemRegistry();
        enemies = Dataloader.readEnemyRegistry();
        actionItemMap = Dataloader.readActionItemMap();

        writer = new TextWriter(30);

        player = new Player();
        player.setHealth(settings[0]);
        player.setCurrency(settings[1]);
        player.setInventory(new Inventory(settings[2]));
        currentRoom = rooms.get("forest_0");

        populateRoomItems();
        displayStartMsg();
        

        

    }

    public void populateRoomItems(){

        for (Room r : rooms.values()) {

            String[] itemsAsString = r.getRoomItemsAsString().split(";");
            for (String string : itemsAsString) {
                
                //Checks if this is item or weapon. Goes to all weapons/items and finds registry and creates a weapon/item
                //and adds to room items
                if(items.containsKey(string)){
                    r.getRoomItems().add(items.get(string).createItem());
                }else if(weapons.containsKey(string)){

                    r.getRoomItems().add(weapons.get(string).createWeapon());
                }


            }
            
        }

    }

    public void displayStartMsg(){

        writer.write(currentRoom.getOnFirstEnterMessage());

    }
    public static void main(String[] args) {
        
        
      
    }
}