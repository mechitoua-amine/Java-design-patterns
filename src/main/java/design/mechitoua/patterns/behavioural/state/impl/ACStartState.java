package design.mechitoua.patterns.behavioural.state.impl;

import design.mechitoua.patterns.behavioural.state.State;

public class ACStartState implements State {

    @Override
    public void doAction() {
        System.out.println("AC is started");
    }

}
