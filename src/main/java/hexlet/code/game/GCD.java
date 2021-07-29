package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static final int ROUND = 3;

    public static void questionGCD(String nameUsr) {
        String[] questionResult = new String[ROUND];
        int[] randomNum1 = new int[ROUND];
        int[] randomNum2 = new int[ROUND];
        for (int i = 0; i < questionResult.length; i++) {
            randomNum1[i] = Util.getRandomNumb();
            randomNum2[i] = Util.getRandomNumb();
            StringBuilder question = new StringBuilder();
            question.append(randomNum1[i]).append(" ").append(randomNum2[i]);
            questionResult[i] = question.toString();
        }
        gcdCalculation(questionResult, randomNum1, randomNum2, nameUsr);
    }

    public static void gcdCalculation(String[] questionResult, int[] randNum1, int[] randNum2, String nameUsr) {
        String[] gcdResult = new String[ROUND];
        for (int i = 0; i < questionResult.length; i++) {
            int gcd = 0;
            for (int j = 1; j <= Util.getMax(); j++) {
                if (randNum1[i] % j == 0 && randNum2[i] % j == 0) {
                    gcd = j;
                }
            }
            gcdResult[i] = String.valueOf(gcd);
        }
        Engine.questionAndAnswerForString(questionResult, gcdResult, nameUsr);
    }
}
