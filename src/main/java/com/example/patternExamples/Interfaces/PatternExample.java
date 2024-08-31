package com.example.patternExamples.Interfaces;

public interface PatternExample {
    void runExample();

    default String getPatternName() {
        String className = this.getClass().getSimpleName();
        return className.substring(0, className.length() - "Example".length());
    }
}
