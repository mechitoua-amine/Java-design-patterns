package design.mechitoua.patterns.behavioural.observer.subject;

import java.util.HashSet;
import java.util.Set;

import design.mechitoua.patterns.behavioural.observer.message.Message;
import design.mechitoua.patterns.behavioural.observer.observer.Observer;

public class MessagePublisher implements Subject {
    private Set<Observer> observers = new HashSet<>();

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyUpdate(Message message) {
        for (Observer observer : observers) {
            observer.update(message);
        }
    }

}
