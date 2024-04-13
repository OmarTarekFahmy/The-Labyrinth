package engine.parser;

import java.util.HashMap;
import java.util.HashSet;

import engine.dataloader.Dataloader;
import engine.interfaces.PRSIndirect;
import engine.interfaces.PRSObject;

/*
 * The TextParser Class is probably the most complicated class in the enire game
 * 
 * It takes the user's input and parses it into something that could be understood
 * and used by the program
 * 
 * The parser works by identifying an Action, an Object and an Indirect Object
 * 
 * Consider the following sentences:
 * 
 * "Open Mailbox"
 * Here the Action is Open and the Object is Mailbox
 * 
 * "Attack Spider with Sword"
 * Here the Action is Attack, the Object is Spider and the Indirect Object is Sword.
 */



public class TextParser {
    

    private PRSAction action;
    private PRSObject object;
    private PRSIndirect indirectObject;
    private HashMap<PRSAction, HashSet<String>> synonymsMap;

    public HashMap<PRSAction, HashSet<String>> getSynonymsMap() {
        return synonymsMap;
    }

    public void setSynonymsMap(HashMap<PRSAction, HashSet<String>> synonymsMap) {
        this.synonymsMap = synonymsMap;
    }

    public PRSAction getAction() {
        return action;
    }

    public void setAction(PRSAction action) {
        this.action = action;
    }

    public PRSObject getObject() {
        return object;
    }

    public void setObject(PRSObject object) {
        this.object = object;
    }

    public PRSIndirect getIndirectObject() {
        return indirectObject;
    }

    public void setIndirectObject(PRSIndirect indirectObject) {
        this.indirectObject = indirectObject;
    }

    

    public TextParser(){

        synonymsMap = Dataloader.readActionSynonymMap();

    }

    public void parseText(String textToParse){

        for (PRSAction action : synonymsMap.keySet()) {

            for (String synonym : synonymsMap.get(action)) {

                if(textToParse.toLowerCase().contains(synonym)){
                    this.action = action;
                    return;
                }
                
            }
            
        }

    }











}
