package com.example.behavioralPatterns.memento;

import lombok.Data;

// Создатель
@Data
public class TextEditor {

    private String text;

    public TextEditorMemento createMemento() {
        return new TextEditorMemento(text);
    }

    public void restoreMemento(TextEditorMemento memento) {
        this.text = memento.getText();
    }
}
