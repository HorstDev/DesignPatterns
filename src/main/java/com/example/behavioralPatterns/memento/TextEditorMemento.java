package com.example.behavioralPatterns.memento;

import lombok.Data;

// Хранитель
@Data
public class TextEditorMemento {
    private String text;

    public TextEditorMemento(String text) {
        this.text = text;
    }
}
