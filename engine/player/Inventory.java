package engine.player;

import engine.items.Item;
import java.util.ArrayList;



public class Inventory {
    
    private int maxSize;
    private ArrayList<Item> items;

    public int getMaxSize() {
        return maxSize;
    }

    public void setMaxSize(int maxSize) {
        this.maxSize = maxSize;
    }

    public ArrayList<Item> getItems() {
        return items;
    }

    public void setItems(ArrayList<Item> items) {
        this.items = items;
    }

    public Inventory(int maxSize){
        this.maxSize = maxSize;
        items = new ArrayList<>();
    }


}
