package engine.structures;

import java.util.HashMap;

import engine.parser.PRSAction;

public class TwoMap<K1,K2,V> {

    private HashMap<HashMap<K1,K2>, V> map;

    public TwoMap() {

        map = new HashMap< HashMap<K1,K2>, V>();
        
    }
    
}
