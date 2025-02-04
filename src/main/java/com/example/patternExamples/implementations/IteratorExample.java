package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.iterator.BookCollection;
import com.example.behavioralPatterns.iterator.Iterator;
import com.example.patternExamples.Interfaces.PatternExample;

public class IteratorExample implements PatternExample {

    @Override
    public void runExample() {
        var bookCollection = new BookCollection();
        bookCollection.addBook("Книга 1");
        bookCollection.addBook("Книга 2");
        bookCollection.addBook("Книга 3");

        Iterator iterator = bookCollection.createIterator();

        System.out.println("Проходимся по коллекции книг с использованием итератора:");
        while (iterator.hasNext()) {
            String book = (String)iterator.next();
            System.out.println(book);
        }
    }
}
