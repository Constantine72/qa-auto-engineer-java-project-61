package hexlet.code;

import hexlet.code.games.*;
import java.util.Scanner;

public class Engine {

    public static void run(GameRound game) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String userName = scanner.next();
        System.out.println("Hello, " + userName + "!");
        System.out.println(game.getRules());

    int correctCount = 0;

    while (correctCount < 3) {

        String question = game.getQuestion();
        String correctAnswer = game.getCorrectAnswer();


        System.out.println("Question: " + question);
        System.out.print("Your answer: ");

        String userAnswer = scanner.next().trim();

        if (!game.isValidInput(userAnswer)) {
            System.out.println("Wrong input. Game over.");
            return;
        }
        if (userAnswer.equals(correctAnswer)) {
            System.out.println("Correct!");
            correctCount++;
        }
        else {
            System.out.println("'"+ userAnswer + "'"  + " is wrong answer ;(. Correct answer was " + "'" + correctAnswer + "'");
            System.out.println("Let's try again, " + userName);
            return;
        }
    }
        System.out.println("Congratulations, " + userName);
    }
}