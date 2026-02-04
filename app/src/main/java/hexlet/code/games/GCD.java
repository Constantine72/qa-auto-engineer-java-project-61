package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class GCD {
    public static void run() {

        Random random = new Random();

        final int randomDigit = 10;
        final int roundDigit = 3;

        String rules = "Find the greatest common divisor of given numbers.";

        String[][] rounds = new String[roundDigit][2];

        for (int i = 0; i < roundDigit; i++) {

            int randomNumber1 = random.nextInt(randomDigit) + 1;
            int randomNumber2 = random.nextInt(randomDigit) + 1;

            int result = gcd(randomNumber1, randomNumber2);


            String question = randomNumber1 + " " + randomNumber2;
            String correctAnswer = String.valueOf(result);


            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;

            }
        Engine.run(rules, rounds);
        }
    private static int gcd(int x, int y) {
        while (y != 0) {
            int temp = x % y;
            x = y;
            y = temp;
        }
        return x;
    }
}
