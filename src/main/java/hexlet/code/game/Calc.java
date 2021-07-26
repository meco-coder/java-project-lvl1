package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Calc {
    private static final int ROUND = 3;

    public static void questionCalcNumber(String nameUsr) {
        String[] symbol = {"+", "-", "*"};
        String[] randomSymbol = new String[ROUND];
        int[] calculationResult = new int[ROUND];
        StringBuilder[] questionResult = new StringBuilder[ROUND];
        for (int i = 0; i < questionResult.length; i++) {
            int randomNum1 = Util.getRandomNumb();
            int randomNum2 = Util.getRandomNumb();
            int numberSymbol = (int) (Math.random() * 2);
            randomSymbol[i] = symbol[numberSymbol];
            switch (randomSymbol[i]) {
                case "+":
                    calculationResult[i] = randomNum1 + randomNum2;
                    break;
                case "-":
                    calculationResult[i] = randomNum1 - randomNum2;
                    break;
                case "*":
                    calculationResult[i] = randomNum1 * randomNum2;
                    break;
                default:
                    break;
            }
            StringBuilder question = new StringBuilder();
            question.append(randomNum1).append(" ").append(randomSymbol[i]).append(" ").append(randomNum2);
            questionResult[i] = question;
        }
        Engine.questionAndAnswerForNumb(questionResult, calculationResult, nameUsr);

    }
}
