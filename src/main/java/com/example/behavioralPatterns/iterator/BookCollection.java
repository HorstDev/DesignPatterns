package com.example.behavioralPatterns.iterator;

import java.util.ArrayList;
import java.util.List;

// Конкретный агрегат
public class BookCollection implements Aggregate {

    private final List<String> books = new ArrayList<>();

    public int size() {
        return books.size();
    }

    public void addBook(String title) {
        books.add(title);
    }

    public String get(int index) {
        return books.get(index);
    }

    public Iterator createIterator() {
        return new BookIterator(this);
    }
}
