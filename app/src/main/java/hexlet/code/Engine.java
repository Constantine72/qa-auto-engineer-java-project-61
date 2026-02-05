package hexlet.code;

import java.util.Scanner;

public class Engine {

    public static void run(String rules, String[][] rounds) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(rules);

        for (String[] round : rounds) {
            String question = round[0];
            String correctAnswer = round[1];


            System.out.println("Question: " + question);
            System.out.print("Your answer: ");

            String userAnswer = scanner.next().trim();

            if (!userAnswer.equals(correctAnswer)) {
                System.out.println("'" + userAnswer + "'"
                        + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
                System.out.println("Let's try again, " + userName + "!");
                return;
            }
            System.out.println("Correct");
        }
        System.out.println("Congratulations, " + userName + "!");
    }
}
