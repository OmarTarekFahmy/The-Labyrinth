package engine.interfaces;

public interface Attackee {


    default public void takeDamage(int damage){

        setHealth(getHealth() - damage);


    }
    
    public int getHealth();
    public void setHealth(int health);

}
    

