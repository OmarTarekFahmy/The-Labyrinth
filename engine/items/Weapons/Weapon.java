package engine.items.Weapons;

import engine.interfaces.Attacker;
import engine.items.Item;

abstract public class Weapon extends Item implements Attacker{


    private int damage;

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public Weapon(String name, int resourceValue, int damage){
        super(name, resourceValue);
        this.damage = damage;
    }    
    
}
