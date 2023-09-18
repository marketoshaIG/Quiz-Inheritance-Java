package org.example;
import java.util.ArrayList;

public class QuizRunner {

    public static void main(String[] args) {

        Quiz quiz = new Quiz();
        // Question 1
        ArrayList<String> q1Choices = new ArrayList<>();
        q1Choices.add("the Constitution");
        q1Choices.add("the Declaration of Independence");
        q1Choices.add("the Articles of Confederation");
        Question q1 = new MultipleChoice("What is the supreme law of the land?",
                q1Choices, "the Constitution");

// Question 2
        ArrayList<String> q2Choices = new ArrayList<>();
        q2Choices.add("sets up the government");
        q2Choices.add("defines the government");
        q2Choices.add("protects basic rights of Americans");
        Question q2 = new MultipleChoice("What does the Constitution do?",
                q2Choices, "sets up the government");

// Question 3
        ArrayList<String> q3Choices = new ArrayList<>();
        q3Choices.add("life");
        q3Choices.add("liberty");
        q3Choices.add("pursuit of happiness");
        Question q3 = new MultipleChoice("What are two rights in the Declaration of Independence?",
                q3Choices, "life and liberty");

// Add questions to quiz

        quiz.addQuestion(q1);
        quiz.addQuestion(q2);
        quiz.addQuestion(q3);

// Run quiz

        quiz.runQuiz();
    }
}
