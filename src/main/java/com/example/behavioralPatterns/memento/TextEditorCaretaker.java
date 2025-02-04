package com.example.behavioralPatterns.memento;

import lombok.Data;

// Заботливый объект
@Data
public class TextEditorCaretaker {
    private TextEditorMemento memento;
}
