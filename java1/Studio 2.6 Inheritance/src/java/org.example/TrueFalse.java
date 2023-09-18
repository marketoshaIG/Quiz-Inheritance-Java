package org.example;

public class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(String prompt, boolean correctAnswer) {
        super(prompt);
        this.correctAnswer = correctAnswer;
    }

    public boolean isCorrectAnswer() {
        return correctAnswer;
    }
}