package design.mechitoua.patterns.behavioural.observer.client;

import design.mechitoua.patterns.behavioural.observer.message.Message;
import design.mechitoua.patterns.behavioural.observer.observer.FirstMessageSubscriber;
import design.mechitoua.patterns.behavioural.observer.observer.SecondMessageSubscriber;
import design.mechitoua.patterns.behavioural.observer.observer.ThirdMessageSubscriber;
import design.mechitoua.patterns.behavioural.observer.subject.MessagePublisher;

public class Client {
    public static void main(String[] args) {
        FirstMessageSubscriber firstMessageSubscriber = new FirstMessageSubscriber();
        SecondMessageSubscriber secondMessageSubscriber = new SecondMessageSubscriber();
        ThirdMessageSubscriber thirdMessageSubscriber = new ThirdMessageSubscriber();

        MessagePublisher messagePublisher = new MessagePublisher();
        messagePublisher.register(firstMessageSubscriber);
        messagePublisher.register(secondMessageSubscriber);

        // firstMessageSubscriber and secondMessageSubscriber will receive the message
        messagePublisher.notifyUpdate(new Message("This is the first message"));
        System.out.println("------------------------------------------------------");

        messagePublisher.unregister(firstMessageSubscriber);
        messagePublisher.register(thirdMessageSubscriber);

        // secondMessageSubscriber will not receive the message but
        // the secondMessageSubscriber and thirdMessageSubscriber will
        // receive the message

        messagePublisher.notifyUpdate(new Message("This is the second message"));
    }
}
