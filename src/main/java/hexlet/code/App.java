package hexlet.code;

import hexlet.code.game.Progression;
import hexlet.code.game.Even;
import hexlet.code.game.Prime;
import hexlet.code.game.Calc;
import hexlet.code.game.GCD;

import java.util.Scanner;

public class App {
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
        Scanner strUser = new Scanner(System.in);
        String gameNumber = strUser.nextLine();
        switch (gameNumber) {
            case "1":
                nameUsr();
                break;
            case "2":
                nameUsr();
                System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
                Even.questionEvenNumber(nameUsr);
                break;
            case "3":
                nameUsr();
                System.out.println("What is the result of the expression?");
                Calc.questionCalcNumber(nameUsr);
                break;
            case "4":
                nameUsr();
                System.out.println("Find the greatest common divisor of given numbers.");
                GCD.questionGCD(nameUsr);
                break;
            case "5":
                nameUsr();
                System.out.println("What number is missing in the progression?");
                Progression.questionAndProgressionCalculation(nameUsr);
                break;
            case "6":
                nameUsr();
                System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
                Prime.questionPrime(nameUsr);
                break;
            default:
                System.out.println();
                break;
        }
    }
}
