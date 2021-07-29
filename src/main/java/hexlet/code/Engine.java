package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner answerUser;
    public static final String WRONG_ANSWER = " is wrong answer ;(. Correct answer was ";

    public static Scanner getAnswerUser() {
        answerUser = new Scanner(System.in);
        return answerUser;
    }

    public static void questionAndAnswerForString(String[] question, String[] answer, String nameUsr) {
        int trueAnswer = 0;
        int incorrectAnswer = 0;
        for (int i = 0; i < question.length && incorrectAnswer == 0; i++) {
            System.out.println("Question: " + question[i] + "\n" + "Your answer: ");
            String usrAnswer = getAnswerUser().nextLine();
            if (usrAnswer.equals(answer[i])) {
                trueAnswer++;
            } else if (answer[i].equals("yes") || answer[i].equals("no") && !usrAnswer.equals(answer[i])) {
                System.out.println("\'" + usrAnswer + "\'" + WRONG_ANSWER + "\'yes\' or \'no\'.");
                System.out.println("Let's try again, " + nameUsr + "!");
                incorrectAnswer++;
            } else if (!usrAnswer.equals(answer[i])) {
                System.out.println("\'" + usrAnswer + "\'" + WRONG_ANSWER + "\'" + answer[i] + "\'.");
                System.out.println("Let's try again, " + nameUsr + "!");
                incorrectAnswer++;
            }
            if (trueAnswer == question.length) {
                System.out.println("Congratulations, " + nameUsr + "!");
                trueAnswer = 0;
            }
        }

    }
}
