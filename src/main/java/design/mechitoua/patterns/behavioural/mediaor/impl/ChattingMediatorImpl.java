package design.mechitoua.patterns.behavioural.mediaor.impl;

import java.util.ArrayList;
import java.util.List;

import design.mechitoua.patterns.behavioural.mediaor.ChattingMediator;
import design.mechitoua.patterns.behavioural.mediaor.User;

public class ChattingMediatorImpl implements ChattingMediator {
    private List<User> userList;

    public ChattingMediatorImpl() {
        userList = new ArrayList<>();
    }

    @Override
    public void sendMessage(String msg, User user) {
        for (User u : userList) {
            if (!user.getName().equalsIgnoreCase(u.getName())) {
                u.receiveMessage(msg);
            }
        }
    }

    @Override
    public void addUser(User user) {
        userList.add(user);
    }
}
