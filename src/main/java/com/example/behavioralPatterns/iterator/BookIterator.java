package com.example.behavioralPatterns.iterator;

import java.util.NoSuchElementException;

// Конкретный итератор
public class BookIterator implements Iterator {

    private final BookCollection collection;
    private int currentIndex = 0;

    public BookIterator(final BookCollection collection) {
        this.collection = collection;
    }

    public boolean hasNext() {
        return currentIndex < collection.size();
    }

    public Object next() {
        if (hasNext())
            return collection.get(currentIndex++);

        throw new NoSuchElementException();
    }
}
