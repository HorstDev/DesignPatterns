package com.example.patternExamples.implementations;

import com.example.behavioralPatterns.memento.TextEditor;
import com.example.behavioralPatterns.memento.TextEditorCaretaker;
import com.example.patternExamples.Interfaces.PatternExample;

public class MementoExample implements PatternExample {

    @Override
    public void runExample() {
        TextEditor textEditor = new TextEditor();
        TextEditorCaretaker caretaker = new TextEditorCaretaker();

        textEditor.setText("Hello World");
        caretaker.setMemento(textEditor.createMemento());

        System.out.println("Текст объекта: " + textEditor.getText());

        textEditor.setText("Bla bla bla");
        System.out.println("Измененный текст объекта: " + textEditor.getText());

        System.out.println("Восстанавливаем состояние объекта из снимка...");
        textEditor.restoreMemento(caretaker.getMemento());
        System.out.println("Восстановленный текст объекта: " + textEditor.getText());
    }
}
