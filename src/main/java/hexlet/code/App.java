package hexlet.code;

import hexlet.code.game.Progression;
import hexlet.code.game.Even;
import hexlet.code.game.Prime;
import hexlet.code.game.Calc;
import hexlet.code.game.GCD;

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
        game();
    }

    public static void nameUsr() {
        System.out.println(" ");
        System.out.print("\nWelcome to the Brain Games!\n" + "May I have your name? ");
        Scanner s = new Scanner(System.in);
        String nameEntered = s.nextLine();
        nameUsr = nameEntered;
        System.out.println("Hello, " + nameUsr + "!");
    }

    public static void game() {
        gameNumber();
        if ("1".equals(gameNumber)) {
            nameUsr();
        } else if ("2".equals(gameNumber)) {
            nameUsr();
            System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
            Even.evenNumber();
        } else if ("3".equals(gameNumber)) {
            nameUsr();
            System.out.println("What is the result of the expression?");
            Calc.calcNumber();
        } else if ("4".equals(gameNumber)) {
            nameUsr();
            System.out.println("Find the greatest common divisor of given numbers.");
            GCD.gcdResult();
        } else if ("5".equals(gameNumber)) {
            nameUsr();
            System.out.println("What number is missing in the progression?");
            Progression.progressionResult();
        } else if ("6".equals(gameNumber)) {
            nameUsr();
            System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
            Prime.primeNumber();
        } else {
            System.exit(0);
        }
    }

    public static void gameSelection() {
        if (App.getGameNumber().equals("2")) {
            Even.evenNumber();
        } else if (App.getGameNumber().equals("3")) {
            Calc.calcNumber();
        } else if (App.getGameNumber().equals("4")) {
            GCD.gcdResult();
        } else if (App.getGameNumber().equals("5")) {
            Progression.progressionResult();
        } else if (App.getGameNumber().equals("6")) {
            Prime.primeNumber();
        } else if (App.getGameNumber().equals("0")) {
            System.exit(0);
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
