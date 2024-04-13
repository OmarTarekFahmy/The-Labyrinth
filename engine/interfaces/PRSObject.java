package engine.interfaces;

import engine.parser.PRSAction;

public interface PRSObject {

    public void doAction(PRSAction a);
    public void doAction(PRSAction a, PRSIndirect i);
}
