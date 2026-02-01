package hexlet.code;

import hexlet.code.games.*;
import hexlet.code.games.Calc;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        String userInput = scanner.next();

        switch (userInput) {
            case "1" -> Greeting.runGreet();
            case "2" -> Engine.run(new Even());
            case "3" -> Engine.run(new Calc());
            case "4" -> Engine.run(new GCD());
            case "5" -> Engine.run(new Progression());
            case "6" -> Engine.run(new Prime());
            default -> scanner.close();
        }
    }
}

