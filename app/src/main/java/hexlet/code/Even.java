package hexlet.code;

import java.util.Scanner;

public class Even {
    public static void runEven() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name?");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println("Answer 'yes' if the number is even, otherwise answer 'no'.");

        int correctCount = 0;

        while (correctCount < 3) {

            int randomNumber = 10 + (int) (Math.random() * 90);
            System.out.println("Question: " + randomNumber);

            String userInputFirst = scanner.next();
            System.out.println("Your answer: " + userInputFirst);

            if ((randomNumber % 2 == 0 && userInputFirst.equals("yes")) || (randomNumber % 2 != 0 && userInputFirst.equals("no")))  {
                System.out.println("Correct!");
                correctCount++;
            }
            else if ((randomNumber % 2 != 0 && userInputFirst.equals("yes")) || (randomNumber % 2 == 0 && userInputFirst.equals("no"))) {
                System.out.println("'yes' is wrong answer ;(. Correct answer was 'no'.");
                System.out.println("Let's try again, userName");
                break;
            }
            else {
                System.out.println("Wrong input");
                break;
            }
        }
        if (correctCount == 3) {
            System.out.println("Congratulations, " + userName);
        }
    }
}