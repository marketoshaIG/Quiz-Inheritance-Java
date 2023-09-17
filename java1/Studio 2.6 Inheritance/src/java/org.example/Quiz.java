package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

class Quiz {

    private ArrayList<Question> questions;
    private int score;

    public Quiz() {
        questions = new ArrayList<>();
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public void runQuiz() {
        Scanner scanner = new Scanner(System.in);

        for (Question question : questions) {
            System.out.println(question.getPrompt());

            for (int i = 0; i < question.getChoices().size(); i++) {
                System.out.println((i+1) + ". " + question.getChoices().get(i));
            }

            int answer = scanner.nextInt();
            scanner.nextLine(); // clear newline

            if (question.getChoices().get(answer-1).equals(question.getAnswer())) {
                score++;
            }
        }

        System.out.println("You got " + score + " out of " + questions.size() + " questions correct!");
    }

}
