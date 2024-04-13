package engine.dataloader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

import engine.enemies.EnemyRegistry;
import engine.parser.PRSAction;
import engine.registries.ItemRegistry;
import engine.registries.WeaponRegistry;
import engine.world.Room;

public class Dataloader {
    
    private static final String WEAPONS_FILE_NAME = "weapons.csv";
    private static final String ROOMS_FILE_NAME = "rooms.csv";
    private static final String ITEMS_FILE_NAME = "items.csv";
    private static final String SETTINGS_FILE_NAME = "settings.csv";
    private static final String ACTION_ITEM_MAP_FILE_NAME = "action_item_mao.csv";

    
    public static HashMap<String, WeaponRegistry> readWeaponRegistry(){

        HashMap<String, WeaponRegistry> weaponsMap = new HashMap<>();
        try {   
            FileReader f = new FileReader(WEAPONS_FILE_NAME);
            BufferedReader br = new BufferedReader(f);       
            String line = br.readLine();
            String[] array;

            while(line != null){

                WeaponRegistry currentRegistry;
                array = line.split(",");
                String code = array[0];
                currentRegistry = new WeaponRegistry(code, array[1], Integer.parseInt(array[2]));
                weaponsMap.put(code, currentRegistry);
                line = br.readLine();

            }
            br.close();
        } catch (IOException e) {
            System.out.println("Cannot Read Weapons File");
        }   
        return weaponsMap;
    }

    public static int[] readSettings(){

        ArrayList<Integer> settingsList = new ArrayList<>();
        int[] settings;
        try {

            FileReader f = new FileReader(SETTINGS_FILE_NAME);
            BufferedReader br = new BufferedReader(f);

            String line = br.readLine();
            
            while(line != null){

                String[] array = line.split(",");
                settingsList.add(Integer.parseInt(array[1]));
                line = br.readLine();
            }

            settings = new int[settingsList.size()];

            for (int i = 0; i < settings.length; i++) {
                settings[i] = settingsList.get(i);
            }

            br.close();

        } catch (IOException e) {
            settings = null;
            // TODO: handle exception
        }

        return settings;



    }

    public static HashMap<String, Room> readRooms(){

        HashMap<String, Room> rooms = new HashMap<>();

        try {
            FileReader f = new FileReader(ROOMS_FILE_NAME);
            BufferedReader br = new BufferedReader(f);
            String line = br.readLine();
            String[] array;

            while(line != null){
    
                array = line.split(",");
                
                Room currentRoom = new Room(array[0], array[1], array[2], array[3]);

                rooms.put(array[0], currentRoom);
                line = br.readLine();
            }

            br.close();



        } catch (IOException e) {
            System.out.println("Cannot Read Rooms File");
        }

        return rooms;

    }

    public static HashMap<String, ItemRegistry> readItemRegistry(){

        HashMap<String, ItemRegistry> itemsMap = new HashMap<>();
        try {
            FileReader f = new FileReader(ITEMS_FILE_NAME);
            BufferedReader br = new BufferedReader(f);
           
            String line = br.readLine();
            String[] array;



            while(line != null){

                ItemRegistry currentRegistry;
                array = line.split(",");
                String code = array[0];
       
                currentRegistry = new ItemRegistry(code, array[1]);
                   
                itemsMap.put(code, currentRegistry);
                line = br.readLine();

            }
            br.close();
        } catch (IOException e) {
            System.out.println("Cannot Read Items File");
        }     
        return itemsMap;
    } 

    public static HashMap<String, EnemyRegistry> readEnemyRegistry(){

        HashMap<String, EnemyRegistry> enemyMap = new HashMap<>();
        try {   
            FileReader f = new FileReader(WEAPONS_FILE_NAME);
            BufferedReader br = new BufferedReader(f);       
            String line = br.readLine();
            String[] array;

            while(line != null){

                EnemyRegistry currentRegistry;
                array = line.split(",");
                String code = array[0];
                currentRegistry = new EnemyRegistry(code, array[1], Integer.parseInt(array[2]), Integer.parseInt(array[3]));
                enemyMap.put(code, currentRegistry);
                line = br.readLine();

            }
            br.close();
        } catch (IOException e) {
            System.out.println("Cannot Read Weapons File");
        }   
        return enemyMap;
    }

    public static HashMap<PRSAction, HashSet<ItemRegistry>> readActionItemMap(){

        HashMap<PRSAction, HashSet<ItemRegistry>> actionItemMap = new HashMap<>();
        
        HashMap<String, ItemRegistry> itemMap = readItemRegistry();


        try {   
            FileReader f = new FileReader(ACTION_ITEM_MAP_FILE_NAME);
            BufferedReader br = new BufferedReader(f);       
            String line = br.readLine();
            String[] array;
            String[] actions;
            String[] itemCodes;

            while(line != null){

                array = line.split(",");
                actions = array[0].split(";");
                itemCodes = array[1].split(";");

                for (String string : actions) {

                    PRSAction action = new PRSAction(string);
                    HashSet<ItemRegistry> itemSet = new HashSet<>();

                    for (String string2 : itemCodes) {

                        
                        ItemRegistry itemReg = itemMap.get(string2);
                        itemSet.add(itemReg);

                        
                    
                }
                actionItemMap.put(action, itemSet);
                
               }

                


                line = br.readLine();

            }
            br.close();
        } catch (IOException e) {
            System.out.println("Cannot Read Weapons File");
        }   
        return actionItemMap;
    }
}
