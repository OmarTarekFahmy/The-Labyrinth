package engine.items.Weapons;

import engine.interfaces.Attackee;

public class MeleeWeapon extends Weapon{
    
    public MeleeWeapon(String name, int resourceValue, int damage) {
        super(name, resourceValue, damage);
    }

    @Override
    public void attack(Attackee target) {
        target.takeDamage(getDamage());
    }
    
}
