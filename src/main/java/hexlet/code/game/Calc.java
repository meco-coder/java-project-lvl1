package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static void calcNumber() {
        int randomNum1 = Util.getRandomNumb();
        int randomNum2 = Util.getRandomNumb();
        int numberSymbol = (int) (Math.random() * 2);
        int resultSum = randomNum1 + randomNum2;
        int resultMult = randomNum1 * randomNum2;
        int resultSub = randomNum1 - randomNum2;
        String[] symbol = {"+", "-", "*"};
        String randomSymbol = symbol[numberSymbol];
        System.out.print("Question: " + randomNum1 + " " + randomSymbol + " " + randomNum2 + "\nYour answer: ");
        int numberUser = Engine.getAnswerUser().nextInt();
        if (randomSymbol.equals("+") && numberUser == resultSum) {
            Engine.correctResult();
            Engine.gameSelection();
        } else if (randomSymbol.equals("+") && numberUser != resultSum) {
            System.out.println("\'" + numberUser + "\'" + Engine.WRONG_ANSWER + "\'" + resultSum + "\'.");
            Engine.tryAgain();
            Engine.incorrectAnswer();
            Engine.gameSelection();
        }
        if (randomSymbol.equals("-") && numberUser == resultSub) {
            Engine.correctResult();
            Engine.gameSelection();
        } else if (randomSymbol.equals("-") && numberUser != resultSub) {
            System.out.println("\'" + numberUser + "\'" + Engine.WRONG_ANSWER + "\'" + resultSub + "\'.");
            Engine.tryAgain();
            Engine.incorrectAnswer();
            Engine.gameSelection();
        }
        if (randomSymbol.equals("*") && numberUser == resultMult) {
            Engine.correctResult();
            Engine.gameSelection();
        } else if ((randomSymbol.equals("*") && numberUser != resultMult)) {
            System.out.println("\'" + numberUser + "\'" + Engine.WRONG_ANSWER + "\'" + resultMult + "\'.");
            Engine.tryAgain();
            Engine.incorrectAnswer();
            Engine.gameSelection();
        }
    }

}
