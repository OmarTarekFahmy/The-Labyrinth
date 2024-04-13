package engine.registries;

import engine.items.Weapons.MeleeWeapon;
import engine.items.Weapons.RangedWeapon;
import engine.items.Weapons.Weapon;

public class WeaponRegistry {
    
    private String code;
    private String name;
    private int damage;
    

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }

    public WeaponRegistry(String code, String name, int damage){

        this.code = code;
        this.name = name;
        this.damage = damage;


    }

    public Weapon createWeapon(){

        switch (code.charAt(0)) {
            case '0':
                return new MeleeWeapon(code, name, damage);
            case '1':
                return new RangedWeapon(code, name, damage);
        
            default:
                return null;
        }

    }


}
