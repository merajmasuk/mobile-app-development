package com.example.quizapplication;

public class QuesionLibrary {
    private String[] questions = {
            "Which part of the plant holds in the soil?",
            "Which part of the plant absorbs energy from the sun?",
            "Which part of the plant attracts bees, butterflies and hummingbirds?",
            "Which part of the plant holds it upright?"
    };

    public String getQuestion(int a) {
        return questions[a];
    }

    private String[][] choices = {
            {"Roots", "Stem", "Flower"},
            {"Roots", "Leaves", "Fruits"},
            {"Seeds", "Stem", "Flower"},
            {"Shoots", "Stem", "Leaves"},
    };

    private String[] answers = {
            "Roots", "Leaves", "Flowers", "Stem"
    };

    public String getChoice1(int a) {
        String choice0 = choices[a][0];
        return choice0;
    }

    public String getChoice2(int a) {
        String choice0 = choices[a][1];
        return choice0;
    }

    public String getChoice3(int a) {
        String choice0 = choices[a][2];
        return choice0;
    }

    public String getChoice4(int a) {
        String choice0 = choices[a][1];
        return choice0;
    }

    public String getCorrectAnswer(int a) {
        return getChoice1(a);
    }

}
