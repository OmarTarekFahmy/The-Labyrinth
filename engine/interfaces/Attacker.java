package engine.interfaces;

import engine.exceptions.OutOfAmmoException;

public interface Attacker {

    public int getDamage();
    public void attack(Attackee target) throws OutOfAmmoException;
    
} 