package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Calc {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAXIMUM_VALUE_LIMIT = 50;
    private static final int MINIMUM_VALUE_LIMIT = 0;

    public static void questionCalcNumber(String nameUsr, Scanner userInputString) {
        System.out.println("What is the result of the expression?");
        String[] symbol = {"+", "-", "*"};
        String[] randomSymbol = new String[ROUNDS_COUNT];
        String[] calculationResult = new String[ROUNDS_COUNT];
        String[] questionResult = new String[ROUNDS_COUNT];
        for (int i = 0; i < questionResult.length; i++) {
            int randomNum1 = Util.getRandomNumb(MAXIMUM_VALUE_LIMIT, MINIMUM_VALUE_LIMIT);
            int randomNum2 = Util.getRandomNumb(MAXIMUM_VALUE_LIMIT, MINIMUM_VALUE_LIMIT);
            int numberSymbol = Util.getRandomNumb(symbol.length, 0);
            randomSymbol[i] = symbol[numberSymbol];
            switch (randomSymbol[i]) {
                case "+":
                    calculationResult[i] = String.valueOf(randomNum1 + randomNum2);
                    break;
                case "-":
                    calculationResult[i] = String.valueOf(randomNum1 - randomNum2);
                    break;
                case "*":
                    calculationResult[i] = String.valueOf(randomNum1 * randomNum2);
                    break;
                default:
                    break;
            }
            StringBuilder question = new StringBuilder();
            question.append(randomNum1).append(" ").append(randomSymbol[i]).append(" ").append(randomNum2);
            questionResult[i] = question.toString();
        }
        Engine.launchGameRounds(questionResult, calculationResult, nameUsr, userInputString);

    }
}
