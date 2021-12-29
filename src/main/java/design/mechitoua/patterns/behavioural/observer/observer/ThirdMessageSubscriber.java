package design.mechitoua.patterns.behavioural.observer.observer;

import design.mechitoua.patterns.behavioural.observer.message.Message;

public class ThirdMessageSubscriber implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Message for third subscriber: " + message.getMessage());
    }
}
