package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Calc {
    private static final String QUESTION = "What is the result of the expression?";
    private static final String[] SYMBOL = {"+", "-", "*"};

    public static void runCalcGame(String nameUsr, Scanner userInputString) {
        System.out.println(QUESTION);
        String[] answers = new String[Engine.ROUNDS_COUNT];
        String[] questions = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < questions.length; i++) {
            int randomNum1 = Util.getRandomNumb(Engine.MAXIMUM_VALUE_LIMIT, Engine.MINIMUM_VALUE_LIMIT);
            int randomNum2 = Util.getRandomNumb(Engine.MAXIMUM_VALUE_LIMIT, Engine.MINIMUM_VALUE_LIMIT);
            int numberSymbol = Util.getRandomNumb(SYMBOL.length, 0);
            String randomSymbol = SYMBOL[numberSymbol];
            answers[i] = calculatingOperations(randomSymbol, randomNum1, randomNum2);
            questions[i] = randomNum1 + " " + randomSymbol + " " + randomNum2;
        }
        Engine.launchGameRounds(questions, answers, nameUsr, userInputString);

    }

    public static String calculatingOperations(String randomSymbol, int num1, int num2) {
        String result = "";
        switch (randomSymbol) {
            case "+":
                result = String.valueOf(num1 + num2);
                break;
            case "-":
                result = String.valueOf(num1 - num2);
                break;
            case "*":
                result = String.valueOf(num1 * num2);
                break;
            default:
                throw new Error("Unknown symbol:" + randomSymbol + "!");
        }
        return result;
    }
}
