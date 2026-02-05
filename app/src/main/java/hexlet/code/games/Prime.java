package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;


public final class Prime {
    public static void run() {


        Random random = new Random();

        final int randomLimit = 100;
        final int roundDigit = 3;

        String rules = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

        String[][] rounds = new String[roundDigit][2];

        for (int i = 0; i < roundDigit; i++) {


            int number = random.nextInt(randomLimit) + 1;


            boolean prime = isPrime(number);


            String question = String.valueOf(number);
            String correctAnswer = prime ? "yes" : "no";

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(rules, rounds);
    }

    private static boolean isPrime(int num) {
        final int startCounter = 3;

        if (num < 2) {
            return true;
        }
        if (num == 2) {
            return true;
        }
        if (num % 2 == 0) {
            return false;
        }
        for (int i = startCounter; i * i <= num; i += 2) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}
