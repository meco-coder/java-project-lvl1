package hexlet.code;

import java.util.Scanner;

public class Engine {
    public static final String WRONG_ANSWER = " is wrong answer ;(. Correct answer was ";
    public static final int MAXIMUM_VALUE_LIMIT = 50;
    public static final int MINIMUM_VALUE_LIMIT = 0;
    public static final int ROUNDS_COUNT = 3;

    public static void launchGameRounds(String[] questions, String[] answers, String nameUsr, Scanner userInputString) {
        for (int i = 0; i < questions.length; i++) {
            System.out.println("Question: " + questions[i]);
            System.out.print("Your answer: ");
            String usrAnswer = userInputString.nextLine();
            if (usrAnswer.equals(answers[i])) {
                System.out.println("Correct!");
            } else {
                System.out.println("\'" + usrAnswer + "\'" + WRONG_ANSWER + "\'" + answers[i] + "\'.");
                System.out.println("Let's try again, " + nameUsr + "!");
                return;
            }
        }
        System.out.println("Congratulations, " + nameUsr + "!");
    }

}
