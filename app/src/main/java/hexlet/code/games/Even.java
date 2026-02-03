package hexlet.code.games;

import hexlet.code.GameRound;
import java.util.Random;


public final class Even implements GameRound {

    private final Random random = new Random();
    private int number;
    private static final int RANDOM_LIMIT = 90;
    private static final int RANDOM_START = 10;

    @Override
    public String getRules() {
        return "Answer 'yes' if the number is even, otherwise answer 'no'.";
    }
    @Override
    public String getQuestion() {
        number = RANDOM_START + random.nextInt(RANDOM_LIMIT);
        return String.valueOf(number);
    }
    @Override
    public String getCorrectAnswer() {
        return number % 2 == 0 ? "yes" : "no";
    }
    @Override
    public boolean isValidInput(String input) {
        return input.equals("yes") || input.equals("no");
    }
}













