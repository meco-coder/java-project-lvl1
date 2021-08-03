package hexlet.code;

import hexlet.code.game.Progression;
import hexlet.code.game.Even;
import hexlet.code.game.Prime;
import hexlet.code.game.Calc;
import hexlet.code.game.GCD;

import java.util.Scanner;

public class App {
    private static String nameUser;

    public static void main(String[] args) {
        game();
    }

    public static void game() {
        printMenu();
        Scanner userInputString = new Scanner(System.in);
        String gameNumber = userInputString.nextLine();
        switch (gameNumber) {
            case "1":
                Cli.nameUsr(userInputString);
                break;
            case "2":
                requestUserName(userInputString);
                Even.questionAndResultEvenNumber(nameUser, userInputString);
                break;
            case "3":
                requestUserName(userInputString);
                Calc.questionCalcNumber(nameUser, userInputString);
                break;
            case "4":
                requestUserName(userInputString);
                GCD.questionGCD(nameUser, userInputString);
                break;
            case "5":
                requestUserName(userInputString);
                Progression.progressionCalculation(nameUser, userInputString);
                break;
            case "6":
                requestUserName(userInputString);
                Prime.questionPrime(nameUser, userInputString);
                break;
            default:
                System.out.println();
                break;
        }
    }

    public static void requestUserName(Scanner userInputString) {
        System.out.println(" ");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        nameUser = userInputString.nextLine();
        System.out.println("Hello, " + nameUser + "!");
    }

    public static void printMenu() {
        System.out.println("Please enter the game number and press Enter.");
        System.out.println("1 - Greet");
        System.out.println("2 - Even");
        System.out.println("3 - Calc");
        System.out.println("4 - GCD");
        System.out.println("5 - Progression");
        System.out.println("6 - Prime");
        System.out.println("0 - Exit");
        System.out.print("Your choice: ");
    }
}
