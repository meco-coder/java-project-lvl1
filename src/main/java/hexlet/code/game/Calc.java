package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    public static void questionCalcNumber(String nameUsr) {
        while (Engine.getTrueAnswer() < Engine.getRound() && Engine.getIncorrectAnswer() == 0) {
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
        Engine.CalcNumber(randomSymbol,numberUser,resultSum,resultSub,resultMult,nameUsr);
        }
        Engine.successfulCompletionOfTheGame(nameUsr);
    }

}
