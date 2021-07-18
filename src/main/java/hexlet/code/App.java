package hexlet.code;

import java.util.Scanner;

public class App {
    private static String gameNumber;
    private static String nameUsr;

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

    public static void nameUsr() {
        System.out.println(" ");
        System.out.print("\nWelcome to the Brain Games!\n" + "May I have your name? ");
        Scanner s = new Scanner(System.in);
        String nameEntered = s.nextLine();
        nameUsr = nameEntered;
        System.out.println("Hello, " + nameUsr + "!");
    }

    public static void gameSelection() {
        gameNumber();
        switch (gameNumber) {
            case "1" -> nameUsr();
            case "2" -> {
                nameUsr();
                System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
                Engine.gameSelection();
            }
            case "3" -> {
                nameUsr();
                System.out.println("What is the result of the expression?");
                Engine.gameSelection();
            }
            case "4" -> {
                nameUsr();
                System.out.println("Find the greatest common divisor of given numbers.");
                Engine.gameSelection();
            }
            case "5" -> {
                nameUsr();
                System.out.println("What number is missing in the progression?");
                Engine.gameSelection();
            }
            case "6" -> {
                nameUsr();
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

    public static String getName() {
        return nameUsr;
    }

}
