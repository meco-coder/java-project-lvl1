package hexlet.code;

import hexlet.code.game.Progression;
import hexlet.code.game.Even;
import hexlet.code.game.Prime;
import hexlet.code.game.Calc;
import hexlet.code.game.GCD;

import java.util.Scanner;

public class Engine {
    private static Scanner answerUser;
    private static int trueAnswer;
    private static String wrongAnswer;
    private static final int ROUND = 3;
    private static final int ROUNDS_COUNT = 50;
    private static String nameUsr;

    public static void nameUsr() {
        System.out.println(" ");
        System.out.print("\nWelcome to the Brain Games!\n" + "May I have your name? ");
        Scanner s = new Scanner(System.in);
        String nameEntered = s.nextLine();
        nameUsr = nameEntered;
        System.out.println("Hello, " + nameUsr + "!");
    }

    public static void gameSelection() {
        for (int i = 0; i < ROUND; i++) {
            switch (App.getGameNumber()) {
                case "2" -> Even.evenNumber();
                case "3" -> Calc.calcNumber();
                case "4" -> GCD.gcdResult();
                case "5" -> Prime.primeNumber();
                case "6" -> Progression.progressionResult();
                default -> System.exit(0);
            }
        }
        successfulCompletionOfTheGame();
    }

    public static String getName() {
        return nameUsr;
    }


    public static Scanner getAnswerUser() {
        answerUser = new Scanner(System.in);
        return answerUser;
    }

    public static int getRangeNum() {
        return ROUNDS_COUNT;
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
        System.out.println("Let's try again, " + getName() + "!");
    }

    public static void successfulCompletionOfTheGame() {
        if (trueAnswer == ROUND) {
            System.out.println("Congratulations, " + getName() + "!");
            trueAnswer = 0;
        }
    }
}
