package engine.registries;

import engine.items.Item;

public class ItemRegistry {
    
    private String code;
    private String name;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public ItemRegistry(String code, String name){

        this.name = name;
        this.code = code;

    }

    public Item createItem(){

        return new Item(code, name);

    }

}
