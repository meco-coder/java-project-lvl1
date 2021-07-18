package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void evenNumber() {
        int randomNumb = Util.getRandomNumb();
        System.out.print("Question: " + randomNumb + "\n" + "Your answer: ");
        String numberUser = Engine.getAnswerUser().nextLine();
        if (randomNumb % 2 == 0 && numberUser.equals("yes") || randomNumb % 2 != 0 && numberUser.equals("no")) {
            Engine.correctResult();
        } else if (randomNumb % 2 == 0 && numberUser.equals("no")) {
            System.out.println("\'no\'" + Engine.WRONG_ANSWER + "\'yes\'.");
            Engine.tryAgain();
            Engine.incorrectAnswer();
        } else if (randomNumb % 2 != 0 && numberUser.equals("yes")) {
            System.out.println("\'yes\'" + Engine.WRONG_ANSWER + "\'no\'.");
            Engine.tryAgain();
            Engine.incorrectAnswer();
        } else if (!numberUser.equals("yes") || !numberUser.equals("no")) {
            System.out.println("\'" + numberUser + "\'" + Engine.WRONG_ANSWER + "\'yes\' or \'no\'.");
            Engine.tryAgain();
            Engine.incorrectAnswer();
        }
    }
}
