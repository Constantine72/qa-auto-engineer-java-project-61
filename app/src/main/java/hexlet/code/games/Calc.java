package hexlet.code.games;

import hexlet.code.GameRound;
import java.util.Random;

public final class Calc implements GameRound  {

        private final Random random = new Random();
        private int correctAnswer;
        private static final int RANDOM_DIGIT = 10;

        @Override
        public String getRules() {
            return "What is the result of the expression?";
        }
        @Override
        public String getQuestion() {

            int randomNumber1 = random.nextInt(RANDOM_DIGIT) + 1;
            int randomNumber2 = random.nextInt(RANDOM_DIGIT) + 1;
            char[] operations = {'+', '-', '*'};
            char operation = operations[random.nextInt(operations.length)];

            switch (operation) {
                case '+' -> correctAnswer = randomNumber1 + randomNumber2;
                case '-' -> correctAnswer = randomNumber1 - randomNumber2;
                case '*' -> correctAnswer = randomNumber1 * randomNumber2;
                default -> System.out.println("Unknown operation");
            }
            return randomNumber1 + " " + operation + " " + randomNumber2;
        }
        @Override
        public String getCorrectAnswer() {
            return String.valueOf(correctAnswer);
        }
        @Override
        public boolean isValidInput(String input) {
            return input.matches("-?\\d+");
        }
    }




















