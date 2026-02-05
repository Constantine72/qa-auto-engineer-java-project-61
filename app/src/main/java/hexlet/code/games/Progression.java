package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Progression {

    public static void run() {

        Random random = new Random();


        final int randomLimit = 5;
        final int randomLength = 6;
        final int randomDigit = 10;
        final int roundDigit = 3;

        String rules = "What number is missing in the progression?";

        String[][] rounds = new String[roundDigit][2];

        for (int i = 0; i < roundDigit; i++) {

            int length = random.nextInt(randomLength) + randomLimit;
            int first = random.nextInt(randomDigit) + 1;
            int step = random.nextInt(randomDigit) + 1;

            int hiddenIndex = random.nextInt(length);

            String[] progression = makeProgression(first, step, length);

            String answer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);
            String correctAnswer = String.valueOf(answer);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(rules, rounds);
    }

    private static String[] makeProgression(int length, int first, int step) {

        String[] progression = new String[length];
        int current = first;

        for (int i = 0; i < length; i++) {
            progression[i] = String.valueOf(current);
            current += step;
        }
        return progression;
    }
}




