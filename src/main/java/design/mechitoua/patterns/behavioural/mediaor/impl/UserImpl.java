package design.mechitoua.patterns.behavioural.mediaor.impl;

import design.mechitoua.patterns.behavioural.mediaor.ChattingMediator;
import design.mechitoua.patterns.behavioural.mediaor.User;

public class UserImpl extends User {
    private ChattingMediator chattingMediator;
    private String name;

    public UserImpl(ChattingMediator mediator, String name) {
        super(mediator, name);
        this.chattingMediator = mediator;
        this.name = name;
    }

    @Override
    public void sendMessage(String msg) {
        System.out.println(name + " send message: " + msg);
        chattingMediator.sendMessage(msg, this);
    }

    @Override
    public void receiveMessage(String msg) {
        System.out.println(name + " received message: " + msg);
    }
}
