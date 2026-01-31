package hexlet.code.games;

import hexlet.code.GameRound;
import java.util.Random;

public class Progression implements GameRound {

    private final Random random = new Random();
    private int correctAnswer;

    @Override
    public String getRules() {
        return "What number is missing in the progression?";
    }

    @Override
    public String getQuestion() {

        int length = random.nextInt(6) + 5;
        int start = random.nextInt(10) + 1;
        int step = random.nextInt(10) + 1;

        int hiddenIndex = random.nextInt(length);

        int[] progression = createProgression(length, start, step);

        correctAnswer = progression[hiddenIndex];

        String question = "";

        for (int i = 0; i < progression.length; i++){
            if (i == hiddenIndex) {
                question += "..";
            } else {
                question += progression[i] + " ";
            }
        }
        return question.trim();
    }
    @Override
    public String getCorrectAnswer() {

        return String.valueOf(correctAnswer);
    }

    @Override
    public boolean isValidInput(String input) {

        return input.matches("\\d+");
    }

    private int[] createProgression(int length, int start, int step) {
    int[] result = new int[length];

    for (int i = 0; i < length; i++) {
        result[i] = start + i * step;
    }
    return result;
    }
}

