package design.mechitoua.patterns.behavioural.observer.observer;

import design.mechitoua.patterns.behavioural.observer.message.Message;

public class SecondMessageSubscriber implements Observer {
    @Override
    public void update(Message message) {
        System.out.println("Message for second subscriber: " + message.getMessage());
    }
}
