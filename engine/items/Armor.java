package engine.items;

public class Armor extends Item{

    private int strength; //Value representing armor strength to be used in damage reduction

    public int getStrength() {
        return strength;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public Armor(String code, String name, int strength) {
        super(code, name);
        this.strength = strength;
    }
    
}
