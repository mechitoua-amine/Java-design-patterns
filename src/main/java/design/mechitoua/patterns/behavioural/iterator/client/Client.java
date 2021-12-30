package design.mechitoua.patterns.behavioural.iterator.client;

import design.mechitoua.patterns.behavioural.iterator.Iterator;
import design.mechitoua.patterns.behavioural.iterator.impl.CollectionImpl;

public class Client {
    public static void main(String[] args) {
        CollectionImpl collection = new CollectionImpl();
        Iterator iterator = collection.getIterator();

        while (iterator.hasNext()) {
            Object object = iterator.next();
            String str = (String) object;
            System.out.println(str);
        }
    }
}
