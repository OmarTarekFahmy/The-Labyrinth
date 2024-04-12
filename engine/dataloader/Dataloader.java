package engine.dataloader;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

import javax.xml.crypto.Data;

import engine.registries.WeaponRegistry;

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
}
