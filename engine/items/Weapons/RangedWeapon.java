package engine.items.Weapons;

import engine.exceptions.OutOfAmmoException;
import engine.interfaces.Attackee;

public class RangedWeapon extends Weapon{

   



    public RangedWeapon(String name, int resourceValue, int damage) {
        super(name, resourceValue, damage);
        
    }

    @Override
    public void attack(Attackee target) throws OutOfAmmoException{
        
        
    }
    
}
