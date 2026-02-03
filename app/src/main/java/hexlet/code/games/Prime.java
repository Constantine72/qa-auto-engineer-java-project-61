package hexlet.code.games;

import hexlet.code.GameRound;
import java.util.Random;


    public final class Prime implements GameRound {

        private final Random random = new Random();

        private int number;
        private int n;

        private static final int RANDOM_LIMIT = 100;
        private static final int START_COUNTER = 3;

        @Override
        public String getRules() {
            return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        }

        @Override
        public String getQuestion() {
            number = random.nextInt(RANDOM_LIMIT) + 1;
            return String.valueOf(number);
        }

        @Override
        public String getCorrectAnswer() {
            return isPrime(number) ? "yes" : "no";
        }

        @Override
        public boolean isValidInput(String input) {

            return input.equals("yes") || input.equals("no");
        }

        private boolean isPrime(int num) {
            if (num < 2) {
                return true;
            }
            if (num == 2) {
                return true;
            }
            if (num % 2 == 0) {
                return false;
            }
            for (int i = START_COUNTER; i * i <= num; i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
                return true;
            }
        }
