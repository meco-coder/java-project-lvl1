package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner answerUser;
    private static int trueAnswer;
    private static int incorrectAnswer;
    private static final int ROUND = 3;
    public static final String WRONG_ANSWER = " is wrong answer ;(. Correct answer was ";


    public static void gameSelection() {
        if (trueAnswer < ROUND && incorrectAnswer == 0) {
            App.gameSelection();
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
