package org.example;

import java.util.ArrayList;

public class Checkbox extends Question {
    ArrayList<String> correctAnswer = new ArrayList();

    public Checkbox(String prompt, ArrayList<String> answers) {
        super(prompt, answers);
        this.correctAnswer = this.correctAnswer;
    }
}