package hexlet.code.games;

import hexlet.code.GameRound;
import java.util.Random;

public class GCD implements GameRound {

    private final Random random = new Random();
    private int correctAnswer;
    private int a;
    private int b;

    @Override
    public String getRules() {
        return "Find the greatest common divisor of given numbers.";
    }

    @Override
    public String getQuestion() {
        int a = random.nextInt(10) + 1;
        int b = random.nextInt(10) + 1;

        correctAnswer = gcd(a, b);

        return a + " " + b;
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