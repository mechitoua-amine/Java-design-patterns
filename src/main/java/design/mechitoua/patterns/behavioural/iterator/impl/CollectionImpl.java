package design.mechitoua.patterns.behavioural.iterator.impl;

import design.mechitoua.patterns.behavioural.iterator.Iterator;
import design.mechitoua.patterns.behavioural.iterator.collection.Collection;

public class CollectionImpl implements Collection {
    String strings[] = { "A", "B", "C", "D", "E" };

    @Override
    public Iterator getIterator() {
        return new IteratorImpl();
    }

    private class IteratorImpl implements Iterator {
        private int index = 0;

        @Override
        public boolean hasNext() {
            return index < strings.length;
        }

        @Override
        public Object next() {
            if (this.hasNext())
                return strings[index++];
            return null;
        }
    }
}
