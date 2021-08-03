package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final String WRONG_ANSWER = " is wrong answer ;(. Correct answer was ";

    public static void launchGameRounds(String[] question, String[] answer, String nameUsr, Scanner userInputString) {
        int trueAnswer = 0;
        int incorrectAnswer = 0;
        String correctAnswer = "";
        String usrAnswer = "";
        for (int i = 0; i < question.length && incorrectAnswer == 0; i++) {
            System.out.println("Question: " + question[i]);
            System.out.print("Your answer: ");
            usrAnswer = userInputString.nextLine();
            if (usrAnswer.equals(answer[i])) {
                trueAnswer++;
                System.out.println("Correct!");
            } else if (!usrAnswer.equals(answer[i])) {
                incorrectAnswer++;
                correctAnswer = answer[i];
            }
        }
        if (incorrectAnswer != 0) {
            System.out.println("\'" + usrAnswer + "\'" + WRONG_ANSWER + "\'" + correctAnswer + "\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
        }
        if (trueAnswer == question.length) {
            System.out.println("Congratulations, " + nameUsr + "!");
        }

    }
}
