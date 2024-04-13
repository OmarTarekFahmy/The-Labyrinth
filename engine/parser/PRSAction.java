package engine.parser;

import engine.enums.Action;

public class PRSAction {

    private Action action;

    public Action getAction() {
        return action;
    }

    public void setAction(Action action) {
        this.action = action;
    }

    public PRSAction(String action){

        switch (action.toUpperCase()) {
            case "PICKUP":
                this.action = Action.PICKUP;
                break;
            case "ATTACK":
                this.action = Action.ATTACK;
                break;
            case "EAT":
                this.action = Action.EAT;
                break;
        
            default:
                break;
        }



    }
    
}
