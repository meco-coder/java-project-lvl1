package hexlet.code;

import java.util.Scanner;

public class App {
    private static String gameNumber;

    public static void main(String[] args) {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
        gameSelection();
    }

    public static void gameSelection() {
        gameNumber();
        switch (gameNumber) {
            case "1" -> Engine.nameUsr();
            case "2" -> {
                Engine.nameUsr();
                System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
                Engine.gameSelection();
            }
            case "3" -> {
                Engine.nameUsr();
                System.out.println("What is the result of the expression?");
                Engine.gameSelection();
            }
            case "4" -> {
                Engine.nameUsr();
                System.out.println("Find the greatest common divisor of given numbers.");
                Engine.gameSelection();
            }
            case "5" -> {
                Engine.nameUsr();
                System.out.println("What number is missing in the progression?");
                Engine.gameSelection();
            }
            case "6" -> {
                Engine.nameUsr();
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                Engine.gameSelection();
            }
            default -> System.exit(0);
        }
    }

    public static void gameNumber() {
        Scanner strUser = new Scanner(System.in);
        gameNumber = strUser.nextLine();
    }

    public static String getGameNumber() {
        return gameNumber;
    }

}
