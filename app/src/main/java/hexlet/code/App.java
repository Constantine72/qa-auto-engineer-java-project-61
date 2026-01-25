package hexlet.code;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("0 - Exit");
        String userInput = scanner.next();

        if (userInput.equals("1")) {
            Greeting.runGreet();
        }
        else if (userInput.equals("2")) {
            Even.runEven();
        }
        else {
            scanner.close();
        }
    }
}
