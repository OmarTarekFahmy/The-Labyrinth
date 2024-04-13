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

    public Weapon(String code, String name, int damage){
        super(code, name);
        this.damage = damage;
    }    
    
}
