package hexlet.code.games;

import hexlet.code.GameRound;
import java.util.Random;

public final class GCD implements GameRound {

    private final Random random = new Random();
    private int correctAnswer;
    private int a;
    private int b;
    private static final int RANDOM_DIGIT = 10;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getQuestion() {
        int randomNumber1 = random.nextInt(RANDOM_DIGIT) + 1;
        int randomNumber2 = random.nextInt(RANDOM_DIGIT) + 1;

        correctAnswer = gcd(randomNumber1, randomNumber2);

        return randomNumber1 + " " + randomNumber2;
    }

    @Override
    public String getCorrectAnswer() {

        return String.valueOf(correctAnswer);
    }


    @Override
    public boolean isValidInput(String input) {

        return input.matches("\\d+");
    }
    private int gcd(int x, int y) {
    while (y != 0) {
        int temp = x % y;
        x = y;
        y = temp;
    }
    return x;
    }

}
