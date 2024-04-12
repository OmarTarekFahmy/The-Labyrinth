package engine.items;

abstract public class Item {
    
    private String name;
    private int resourceValue;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getResourceValue() {
        return resourceValue;
    }

    public void setResourceValue(int resourceValue) {
        this.resourceValue = resourceValue;
    }

    public Item(String name, int resourceValue){
        this.name = name;
        this.resourceValue = resourceValue;
    }

    

}
