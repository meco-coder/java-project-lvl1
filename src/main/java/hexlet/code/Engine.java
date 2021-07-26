package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner answerUser;
    private static int trueAnswer;
    private static int incorrectAnswer;
    private static final int ROUND = 3;
    public static final String WRONG_ANSWER = " is wrong answer ;(. Correct answer was ";


    public static Scanner getAnswerUser() {
        answerUser = new Scanner(System.in);
        return answerUser;
    }

    public static void correctResult() {
        System.out.println("Correct!");
        trueAnswer++;
    }

    public static int getTrueAnswer() {
        return trueAnswer;
    }

    public static int getIncorrectAnswer() {
        return incorrectAnswer;
    }

    public static int getRound() {
        return ROUND;
    }

    public static void incorrectAnswer() {
        incorrectAnswer++;
    }

    public static void successfulCompletionOfTheGame(String nameUsr) {
        if (trueAnswer == ROUND) {
            System.out.println("Congratulations, " + nameUsr + "!");
            trueAnswer = 0;
        }
    }

    public static void questionAndAnswerForString(int[] question, String[] answer, String nameUsr) {
        for (int i = 0; i < ROUND && incorrectAnswer == 0; i++) {
            System.out.println("Question: " + question[i] + "\n" + "Your answer: ");
            String usrAnswer = getAnswerUser().nextLine();
            if (usrAnswer.equals(answer[i])) {
                correctResult();
            } else if (usrAnswer.equals("no")) {
                System.out.println("\'no\'" + WRONG_ANSWER + "\'yes\'.");
                System.out.println("Let's try again, " + nameUsr + "!");
                incorrectAnswer();
            } else if (usrAnswer.equals("yes")) {
                System.out.println("\'yes\'" + WRONG_ANSWER + "\'no\'.");
                System.out.println("Let's try again, " + nameUsr + "!");
                incorrectAnswer();
            } else if (!usrAnswer.equals("yes") || !usrAnswer.equals("no")) {
                System.out.println("\'" + usrAnswer + "\'" + WRONG_ANSWER + "\'yes\' or \'no\'.");
                System.out.println("Let's try again, " + nameUsr + "!");
                incorrectAnswer();
            }
            successfulCompletionOfTheGame(nameUsr);
        }
    }

    public static void questionAndAnswerForNumb(StringBuilder[] question, int[] result, String nameUsr) {
        for (int i = 0; i < ROUND && incorrectAnswer == 0; i++) {
            System.out.println("Question: " + question[i] + "\n" + "Your answer: ");
            int usrAnswer = getAnswerUser().nextInt();
            if (usrAnswer == result[i]) {
                correctResult();
            } else if (usrAnswer != result[i]) {
                System.out.println("\'" + usrAnswer + "\'" + WRONG_ANSWER + "\'" + result[i] + "\'.");
                System.out.println("Let's try again, " + nameUsr + "!");
                incorrectAnswer();
            }
            successfulCompletionOfTheGame(nameUsr);
        }
    }
}
