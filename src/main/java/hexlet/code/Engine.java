package hexlet.code;

import hexlet.code.game.Calc;
import hexlet.code.game.Even;
import hexlet.code.game.GCD;
import hexlet.code.game.Progression;
import hexlet.code.game.Prime;

import java.util.Scanner;

public class Engine {
    private static Scanner answerUser;
    private static int trueAnswer;
    private static String wrongAnswer;
    private static final int ROUND = 3;
    private static final int RANGENUMBERS = 50;

    public static void gameSelection() {
        Scanner number = new Scanner(System.in);
        int numUsr = number.nextInt();
        final int greet = 1;
        final int evenGame = 2;
        final int calcGame = 3;
        final int gcdGame = 4;
        final int progressionGame = 5;
        final int primeGame = 6;
        final int exit = 0;
        if (numUsr == greet) {
            Cli.nameUsr();
        } else if (numUsr == evenGame) {
            Cli.nameUsr();
            Even.evenNumber();
        } else if (numUsr == calcGame) {
            Cli.nameUsr();
            Calc.calcNumber();
        } else if (numUsr == gcdGame) {
            Cli.nameUsr();
            GCD.gcdResult();
        } else if (numUsr == progressionGame) {
            Cli.nameUsr();
            Progression.progressionResult();
        } else if (numUsr == primeGame) {
            Cli.nameUsr();
            Prime.primeNumber();
        } else if (numUsr == exit) {
            System.exit(0);
        }
    }

    public static Scanner getAnswerUser() {
        answerUser = new Scanner(System.in);
        return answerUser;
    }

    public static int getRangeNum() {
        return RANGENUMBERS;
    }


    public static void correctResult() {
        System.out.println("Correct!");
        trueAnswer++;
    }

    public static String wrongAnswer() {
         wrongAnswer = " is wrong answer ;(. Correct answer was ";
        return wrongAnswer;
    }

    public static void tryAgain() {
        System.out.println("Let's try again, " + Cli.getName() + "!");
    }

    public static int getNumOfRounds() {
        return ROUND;
    }

    public static void gameEndedSuccessfully() {
        if (trueAnswer == ROUND) {
            System.out.println("Congratulations, " + Cli.getName() + "!");
            trueAnswer = 0;
        }
    }
}
