package org.example;

import java.util.ArrayList;


public class Question {
    private String prompt;
    private ArrayList<String> choices;
    private String answer;

    public Question(String prompt) {
        this.prompt = prompt;
        this.choices = new ArrayList<>();
        this.answer = "";
    }

    public Question(String prompt, ArrayList<String> choices){
        this.prompt = prompt;
        this.choices = choices;
        this.answer = "";
    }

    public Question(String prompt, ArrayList<String> choices, String answer) {
        this.prompt = prompt;
        this.choices = choices;
        this.answer = answer;
    }

    public String getPrompt() {
        return prompt;
    }

    public ArrayList<String> getChoices() {
        return choices;
    }

    public String getAnswer() {
        return answer;
    }

    // will only be used by child classes
    public ArrayList<String> getAnswers(){
        return null;
    }
}
