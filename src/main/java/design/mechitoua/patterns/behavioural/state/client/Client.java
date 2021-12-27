package design.mechitoua.patterns.behavioural.state.client;

import design.mechitoua.patterns.behavioural.state.State;
import design.mechitoua.patterns.behavioural.state.impl.ACContext;
import design.mechitoua.patterns.behavioural.state.impl.ACStartState;
import design.mechitoua.patterns.behavioural.state.impl.ACStopState;

public class Client {
    public static void main(String[] args) {
        ACContext acContext = new ACContext();
        State acStartState = new ACStartState();
        State acStopState = new ACStopState();
        acContext.setState(acStartState);
        acContext.doAction();
        acContext.setState(acStopState);
        acContext.doAction();
    }
}
