package hexlet.code.games;

import hexlet.code.Engine;
import java.util.Random;

public final class Calc {
    public static void run() {

        Random random = new Random();

        final int randomDigit = 10;
        final int roundDigit = 3;

        String rules = "What is the result of the expression?";

        String[][] rounds = new String[roundDigit][2];

        for (int i = 0; i < roundDigit; i++) {

            int randomNumber1 = random.nextInt(randomDigit) + 1;
            int randomNumber2 = random.nextInt(randomDigit) + 1;
            char[] operations = {'+', '-', '*'};
            char operation = operations[random.nextInt(operations.length)];

            int result = 0;

            switch (operation) {
                case '+' -> result = randomNumber1 + randomNumber2;
                case '-' -> result = randomNumber1 - randomNumber2;
                case '*' -> result = randomNumber1 * randomNumber2;
                default -> System.out.println("Unknown operation");
            }

            String question = randomNumber1 + " " + operation + " " + randomNumber2;
            String correctAnswer = String.valueOf(result);

            rounds[i][0] = question;
            rounds[i][1] = correctAnswer;

        }

 Engine.run(rules, rounds);
}
}



















