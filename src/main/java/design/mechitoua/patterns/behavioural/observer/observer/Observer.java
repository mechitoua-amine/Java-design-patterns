package design.mechitoua.patterns.behavioural.observer.observer;

import design.mechitoua.patterns.behavioural.observer.message.Message;

public interface Observer {
    public void update(Message message);
}
