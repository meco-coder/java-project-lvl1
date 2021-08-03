package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class GCD {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAXIMUM_VALUE_LIMIT = 50;
    private static final int MINIMUM_VALUE_LIMIT = 0;

    public static void questionGCD(String nameUsr, Scanner userInputString) {
        System.out.println("Find the greatest common divisor of given numbers.");
        String[] questionResult = new String[ROUNDS_COUNT];
        int[] randomNum1 = new int[ROUNDS_COUNT];
        int[] randomNum2 = new int[ROUNDS_COUNT];
        for (int i = 0; i < questionResult.length; i++) {
            randomNum1[i] = Util.getRandomNumb(MAXIMUM_VALUE_LIMIT, MINIMUM_VALUE_LIMIT);
            randomNum2[i] = Util.getRandomNumb(MAXIMUM_VALUE_LIMIT, MINIMUM_VALUE_LIMIT);
            StringBuilder question = new StringBuilder();
            question.append(randomNum1[i]).append(" ").append(randomNum2[i]);
            questionResult[i] = question.toString();
        }
        gcdCalculation(questionResult, randomNum1, randomNum2, nameUsr, userInputString);
    }

    public static void gcdCalculation(String[] questionResult,
                                      int[] randNum1,
                                      int[] randNum2,
                                      String nameUsr,
                                      Scanner userInputString) {
        String[] gcdResult = new String[ROUNDS_COUNT];
        for (int i = 0; i < questionResult.length; i++) {
            int gcd = 0;
            for (int j = 1; j <= MAXIMUM_VALUE_LIMIT; j++) {
                if (randNum1[i] % j == 0 && randNum2[i] % j == 0) {
                    gcd = j;
                }
            }
            gcdResult[i] = String.valueOf(gcd);
        }
        Engine.launchGameRounds(questionResult, gcdResult, nameUsr, userInputString);
    }
}
