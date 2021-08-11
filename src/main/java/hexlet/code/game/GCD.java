package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class GCD {
    private static final String QUESTION = "Find the greatest common divisor of given numbers.";

    public static void runGCDGame(String nameUsr, Scanner userInputString) {
        System.out.println(QUESTION);
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] answers = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < questions.length; i++) {
            int randomNum1 = Util.getRandomNumb(Engine.MAXIMUM_VALUE_LIMIT, Engine.MINIMUM_VALUE_LIMIT);
            int randomNum2 = Util.getRandomNumb(Engine.MAXIMUM_VALUE_LIMIT, Engine.MINIMUM_VALUE_LIMIT);
            questions[i] = randomNum1 + " " + randomNum2;
            answers[i] = gcdCalculation(randomNum1, randomNum2);
        }
        Engine.launchGameRounds(questions, answers, nameUsr, userInputString);
    }

    public static String gcdCalculation(int randNum1, int randNum2) {
        int gcd = 0;
        for (int j = 1; j <= Engine.MAXIMUM_VALUE_LIMIT; j++) {
            if (randNum1 % j == 0 && randNum2 % j == 0) {
                gcd = j;
            }
        }
        return String.valueOf(gcd);
    }
}
