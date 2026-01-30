package hexlet.code.games;

import hexlet.code.GameRound;
import java.util.Random;


public class Even implements GameRound {

    private final Random random = new Random();
    private int number;

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }

    @Override
    public String getQuestion() {
        number = 10 + random.nextInt(90);
        return String.valueOf(number);
    }

    @Override
    public String getCorrectAnswer() {
        return number % 2 = 0 ? "yes" : "no";
    }

    @Override
    public boolean isValidInput(String input) {
        return input.equals("yes") || input.equals("no");
    }
}













