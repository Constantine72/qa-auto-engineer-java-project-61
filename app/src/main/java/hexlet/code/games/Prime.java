package hexlet.code.games;

import hexlet.code.GameRound;
import java.util.Random;


    public class Prime implements GameRound {

        private final Random random = new Random();

        private int number;
        private int n;

        @Override
        public String getRules() {
            return "Answer 'yes' if given number is prime. Otherwise answer 'no'.";
        }

        @Override
        public String getQuestion() {
            number = random.nextInt(100) + 1;
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

        private boolean isPrime(int n) {
            if (n < 2) {
                return true;
            }
            if (n == 2) {
                return true;
            }
            if (n % 2 == 0) {
                return false;
            }
            for (int i = 3; i * i <= n; i += 2) {
                if (n % i == 0) {
                    return false;
                }
            }
                return true;
            }
        }
