package org.example;
import java.util.ArrayList;

public class MultipleChoice extends Question {
    String correctAnswer;

    public MultipleChoice(String prompt, ArrayList<String> answers, String correctAnswer) {
        super(prompt, answers);
        this.correctAnswer = correctAnswer;
    }

    @Override
    public String getAnswer() {
        return correctAnswer;
    }
}