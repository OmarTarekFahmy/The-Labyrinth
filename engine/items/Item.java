package engine.items;


import engine.interfaces.PRSIndirect;
import engine.interfaces.PRSObject;
import engine.parser.PRSAction;

public class Item implements PRSObject, PRSIndirect{
    
    
    private String name;
    private String code;

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



    public Item(String code, String name){
        this.code = code;
        this.name = name;

    }

   
    public void doAction(PRSAction a) {
       
    }

   
    public void doAction(PRSAction a, PRSIndirect i) {
       
    }

    

}
