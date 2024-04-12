package engine.items;

public class Armor extends Item{

    private int strength; //Value representing armor strength to be used in damage reduction

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Armor(String name, int resourceValue, int strength) {
        super(name, resourceValue);
        this.strength = strength;
    }
    
}
