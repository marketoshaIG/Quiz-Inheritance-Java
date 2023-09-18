package org.example;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;


public class Quiz {
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

            String inputString = scanner.next();
            int answer = 0;
            ArrayList<Integer> checkBoxAnswers = new ArrayList<Integer>();

            try{
                if (inputString.contains(",")){
                    // split string
                }
                else{
                    answer = Integer.parseInt(inputString);
                }

            }
            catch (Exception e){
                answer = 0;
            }

            // grade question
            // use 'number' input (1, 2, 3, etc...)
            if (answer >= 1){
                for (int i = 0; i < question.getChoices().size(); i++) {
                    if (answer == i + 1){
                        if (question instanceof MultipleChoice) {
                            // Handle MultipleChoice logic here
                        } else if (question instanceof Checkbox) {
                            // Handle Checkbox logic here
                        }

                        // make sure this is the correct answer
                        String correctAnswer = question.getAnswer();
                        String inputAnswer = question.getChoices().get(i);

                        correctAnswer = correctAnswer.toLowerCase();
                        inputAnswer = inputAnswer.toLowerCase();

                        if (correctAnswer.equals(inputAnswer)) {
                            score++;
                        }

                        break;
                    }
                }
            }
            else{
                for (int i = 0; i < question.getChoices().size(); i++) {
                    // make sure this is the correct answer
                    String correctAnswer = question.getAnswer();
                    String inputAnswer = question.getChoices().get(i);

                    correctAnswer = correctAnswer.toLowerCase();
                    inputAnswer = inputAnswer.toLowerCase();

                    if (correctAnswer.equals(inputAnswer)) {
                        score++;
                        break;
                    }
                }
            }
        }

        System.out.println("You got " + score + " out of " + questions.size() + " questions correct!");
    }
}