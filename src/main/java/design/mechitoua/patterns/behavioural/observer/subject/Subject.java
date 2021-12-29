package design.mechitoua.patterns.behavioural.observer.subject;

import design.mechitoua.patterns.behavioural.observer.message.Message;
import design.mechitoua.patterns.behavioural.observer.observer.Observer;

public interface Subject {
    public void register(Observer observer);

    public void unregister(Observer observer);

    public void notifyUpdate(Message message);
}
