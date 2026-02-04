package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;


public final class Even {

    public static void run() {

        final int roundDigit = 3;
        final int roundLimit = 3;
        final int randomLimit = 100;

        Random random = new Random();
        String rules = "Answer 'yes' if the number is even, otherwise answer 'no'.";
        String[][] rounds = new String[roundLimit][2];

        for (int i = 0; i < roundDigit; i++) {
            int number = random.nextInt(randomLimit) + 1;
            String correctAnswer = (number % 2 == 0) ? "yes" : "no";

            rounds[i][0] = String.valueOf(number);
            rounds[i][1] = correctAnswer;
        }

        Engine.run(rules, rounds);
    }
}












