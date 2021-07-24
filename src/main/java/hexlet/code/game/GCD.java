package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    public static void questionGCD(String nameUsr) {
        while (Engine.getTrueAnswer() < Engine.getRound() && Engine.getIncorrectAnswer() == 0) {
        int randomNum1 = Util.getRandomNumb();
        int randomNum2 = Util.getRandomNumb();
        System.out.print("Question: " + randomNum1 + " " + randomNum2 + "\nYour answer: ");
        int numberUser = Engine.getAnswerUser().nextInt();
        Engine.gcdCalculation(randomNum1, randomNum2);
        Engine.gcdResult(numberUser, nameUsr);
        }
        Engine.successfulCompletionOfTheGame(nameUsr);
    }
}
