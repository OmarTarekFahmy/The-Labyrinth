package engine.registries;

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

    public WeaponRegistry(String code, String name, int damage, int ammo){

        this.code = code;
        this.name = name;
        this.damage = damage;


    }


}
