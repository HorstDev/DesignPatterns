package com.example.behavioralPatterns.chainOfResponsibility;

import lombok.Setter;

// Обработчик (обработчик отпусков)
@Setter
public abstract class VacationHandler {

    protected VacationHandler nextHandler;

    // Обработка запроса на получение отпуска
    public abstract void handleRequest(int days);

}
