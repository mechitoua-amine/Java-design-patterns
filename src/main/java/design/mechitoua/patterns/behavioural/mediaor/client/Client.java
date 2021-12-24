package design.mechitoua.patterns.behavioural.mediaor.client;

import java.util.ArrayList;
import java.util.List;

import design.mechitoua.patterns.behavioural.mediaor.ChattingMediator;
import design.mechitoua.patterns.behavioural.mediaor.User;
import design.mechitoua.patterns.behavioural.mediaor.impl.ChattingMediatorImpl;
import design.mechitoua.patterns.behavioural.mediaor.impl.UserImpl;

public class Client {
    public static void main(String[] args) {
        ChattingMediator mediator = new ChattingMediatorImpl();
        List<User> users = new ArrayList<>(
                List.of(
                        new UserImpl(mediator, "mehmet"),
                        new UserImpl(mediator, "ali"),
                        new UserImpl(mediator, "veli"),
                        new UserImpl(mediator, "ayse"),
                        new UserImpl(mediator, "fatma"),
                        new UserImpl(mediator, "gizem"),
                        new UserImpl(mediator, "nur")));

        for (User user : users) {
            mediator.addUser(user);
        }

        users.get(0).sendMessage("Hello everyone!");
        System.out.println("---------------------------------");
        users.get(3).sendMessage("Hello Mehmet, How are you?");

    }
}
