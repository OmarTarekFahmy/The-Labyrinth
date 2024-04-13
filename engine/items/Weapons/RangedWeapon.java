package engine.items.Weapons;

import engine.exceptions.OutOfAmmoException;
import engine.interfaces.Attackee;

public class RangedWeapon extends Weapon{

   



    public RangedWeapon(String code, String name, int damage) {
        super(code, name, damage);
        
    }

    @Override
    public void attack(Attackee target) throws OutOfAmmoException{
        
        
    }
    
}
