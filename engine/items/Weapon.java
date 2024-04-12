package engine.items;

public class Weapon extends Item{

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
