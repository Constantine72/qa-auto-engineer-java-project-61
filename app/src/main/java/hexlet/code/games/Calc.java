package hexlet.code.games;

import hexlet.code.GameRound;
import java.util.Random;

public class Calc implements GameRound  {

        private final Random random = new Random();
        private int correctAnswer;


        @Override
        public String getRules() {
            return "What is the result of the expression?";
        }

        @Override
        public String getQuestion() {
            int a = random.nextInt(10) + 1;
            int b = random.nextInt(10) + 1;
            char[] operations = {'+', '-', '*'};
            char operation = operations[random.nextInt(operations.length)];

            switch (operation) {
                case '+' -> correctAnswer = a + b;
                case '-' -> correctAnswer = a - b;
                case '*' -> correctAnswer = a * b;
            }
            return a + " " + operation + " " + b;
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




















