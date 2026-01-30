package hexlet.code.games;

import java.util.Scanner;

public class Greeting {
    public static void runGreet() {

        Scanner scanner = new Scanner(System.in);

            System.out.println("Your choice: 1" + System.lineSeparator());
            System.out.println("Welcome to the Brain Games!");
            System.out.print("May I have your name?");
            String userName = scanner.next();
            System.out.println("Hello, " + userName + "!");

        scanner.close();
    }
        }



