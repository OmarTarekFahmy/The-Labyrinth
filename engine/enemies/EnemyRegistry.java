package engine.enemies;

public class EnemyRegistry {

    
    private String code;
    private String name;
    private int health;
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
    public int getHealth() {
        return health;
    }
    public void setHealth(int health) {
        this.health = health;
    }
    public int getDamage() {
        return damage;
    }
    public void setDamage(int damage) {
        this.damage = damage;
    }

    public EnemyRegistry(String code, String name, int health, int damage){
        this.code = code;
        this.name = name;
        this.health = health;
        this.damage = damage;

    }

    public Enemy CreateEnemy(){

        return new Enemy(code, name, health, damage);

    }


}
