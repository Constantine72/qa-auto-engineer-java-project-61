package hexlet.code.games;

import hexlet.code.Engine;

import java.util.Random;

public final class Progression {

    public static void run() {

        Random random = new Random();

        final int roundsCount = 3;
        final int progressionLength = 10;
        final int maxStart = 20;
        final int maxStep = 10;


        String rules = "What number is missing in the progression?";

        String[][] rounds = new String[roundsCount][2];

        for (int i = 0; i < roundsCount; i++) {

            int first = random.nextInt(maxStart) + 1;
            int step = random.nextInt(maxStep) + 1;


            int hiddenIndex = random.nextInt(progressionLength);

            String[] progression = makeProgression(first, step, progressionLength);

            String answer = progression[hiddenIndex];

            progression[hiddenIndex] = "..";

            String question = String.join(" ", progression);


            rounds[i][0] = question;
            rounds[i][1] = answer;
        }
        Engine.run(rules, rounds);
    }

    private static String[] makeProgression(int first, int step, int progressionLength) {

        String[] progression = new String[progressionLength];

        int current = first;

        for (int i = 0; i < progressionLength; i++) {

            progression[i] = String.valueOf(current);
            current += step;
        }
        return progression;
    }
}

