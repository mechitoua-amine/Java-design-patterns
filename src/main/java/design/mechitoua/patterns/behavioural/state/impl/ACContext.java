package design.mechitoua.patterns.behavioural.state.impl;

import design.mechitoua.patterns.behavioural.state.State;

public class ACContext implements State {
    private State state;

    public void setState(State state) {
        this.state = state;
    }

    public State getState() {
        return state;
    }

    @Override
    public void doAction() {
        state.doAction();
    }
}
