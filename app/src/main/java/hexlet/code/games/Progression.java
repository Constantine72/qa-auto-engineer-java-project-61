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
            int start = random.nextInt(randomDigit) + 1;
            int step = random.nextInt(randomDigit) + 1;

            int hiddenIndex = random.nextInt(length);

            int[] progression = createProgression(length, start, step);

            int correct = progression[hiddenIndex];

            String question = buildQuestion(progression, hiddenIndex);
            String correctAnswer = String.valueOf(correct);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;
        }
        Engine.run(rules, rounds);
    }

    private static int[] createProgression(int length, int start, int step) {
        int[] result = new int[length];

        for (int i = 0; i < length; i++) {
            result[i] = start + i * step;
        }
        return result;
    }

    private static String buildQuestion(int[] progression, int hiddenIndex) {

        String result = "";
        for (int i = 0; i < progression.length; i++) {


            if (i == hiddenIndex) {
                result += ".. ";
            } else {
                result += progression[i] + " ";
            }
        }
        return result.trim();
    }
}



