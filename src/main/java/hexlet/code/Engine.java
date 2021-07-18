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
    private static int incorrectAnswer;
    private static final int ROUND = 3;
    public static final String WRONG_ANSWER = " is wrong answer ;(. Correct answer was ";

    public static void gameSelection() {
        for (int i = 0; i < ROUND && incorrectAnswer == 0; i++) {
            switch (App.getGameNumber()) {
                case "2" -> Even.evenNumber();
                case "3" -> Calc.calcNumber();
                case "4" -> GCD.gcdResult();
                case "5" -> Progression.progressionResult();
                case "6" -> Prime.primeNumber();
                default -> System.exit(0);
            }
        }
        successfulCompletionOfTheGame();
    }

    public static Scanner getAnswerUser() {
        answerUser = new Scanner(System.in);
        return answerUser;
    }

    public static void correctResult() {
        System.out.println("Correct!");
        trueAnswer++;
    }

    public static void incorrectAnswer() {
        incorrectAnswer++;
    }

    public static void tryAgain() {
        System.out.println("Let's try again, " + App.getName() + "!");
    }

    public static void successfulCompletionOfTheGame() {
        if (trueAnswer == ROUND) {
            System.out.println("Congratulations, " + App.getName() + "!");
            trueAnswer = 0;
        }
    }
}
