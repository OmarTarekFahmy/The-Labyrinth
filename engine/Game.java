package engine;

import java.util.HashMap;

import engine.items.Weapons.Weapon;
import engine.registries.WeaponRegistry;
import engine.text.TextWriter;
import engine.dataloader.*;

public class Game {

    private HashMap<String, WeaponRegistry> weapons;

    public Game(){
        weapons = Dataloader.readWeaponRegistry();
    }


    public static void main(String[] args) {
        
        TextWriter t = new TextWriter(100);
        t.write("Hello, how are you doing today?");
        
    }
}