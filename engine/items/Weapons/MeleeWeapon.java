package engine.items.Weapons;

import engine.interfaces.Attackee;

public class MeleeWeapon extends Weapon{
    
    public MeleeWeapon(String code, String name, int damage) {
        super(code, name, damage);
    }

    @Override
    public void attack(Attackee target) {
        target.takeDamage(getDamage());
    }
    
}
