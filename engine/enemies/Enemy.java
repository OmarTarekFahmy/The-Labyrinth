package engine.enemies;

import engine.interfaces.Attackee;
import engine.interfaces.Attacker;

public class Enemy implements Attacker, Attackee{
    
    private String code;
    private String name;
    private int health;
    private int damage;

    public String getCode() {
        return code;
    }
    public void setCode(String code) {
        this.code = code;
    }

    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public Enemy(String code, String name, int health, int damage){
        this.code = code;
        this.name = name;
        this.health = health;
        this.damage = damage;
    }
    
    public void attack(Attackee target) {
       target.takeDamage(damage);
    }

}
