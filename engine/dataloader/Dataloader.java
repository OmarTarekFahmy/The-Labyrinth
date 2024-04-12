package engine.dataloader;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;

import engine.items.Item;
import engine.registries.WeaponRegistry;
import engine.world.Room;

public class Dataloader {
    
    private static final String WEAPONS_FILE_NAME = "weapons.csv";
    private static final String ROOMS_FILE_NAME = "rooms.csv";
    private static final String ENEMIES_FILE_NAME = "enemies.csv";
    private static final String SETTINGS_FILE_NAME = "settings.csv";

    
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

        
                currentRegistry = new WeaponRegistry(code, array[1], Integer.parseInt(array[2]), 0);
                   

                weaponsMap.put(code, currentRegistry);
                line = br.readLine();

            }


            br.close();

        } catch (IOException e) {
            System.out.println("Cannot Read Weapons File");
        } 
        
    
        return weaponsMap;





    }

    public static int[] readSettings() throws IOException{

        int[] settings;
        try {

            FileReader f = new FileReader(SETTINGS_FILE_NAME);
            BufferedReader br = new BufferedReader(f);

            String line = br.readLine();
            String[] s = line.split(",");

            settings = new int[s.length];

            for(int i = 0; i < s.length; i++){
                settings[i] = Integer.parseInt(s[i]);
            }  



            


        } catch (IOException e) {
            settings = null;
            // TODO: handle exception
        }

        return settings;



    }

    public static HashMap<String, Room> readRoomRegistry(){

        HashMap<String, Room> rooms;

        try {
            FileReader f = new FileReader(ROOMS_FILE_NAME);
            BufferedReader br = new BufferedReader(f);
            String line = br.readLine();
            String[] array;
            String[] itemArray;

            while(line != null){
    
                array = line.split(",");
                itemArray = array[3].split(";");

                //Find a way to get Items from csv file and add all room items to a hash set 
                //then make this hash set the items attribute for the room


            }





        } catch (Exception e) {
            // TODO: handle exception
        }






    }


}
