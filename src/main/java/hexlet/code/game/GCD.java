package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class GCD {
    private static int randomNum1 = Util.getRandomNumb();
    private static int randomNum2 = Util.getRandomNumb();

    public static int gcdCalculation() {
        int gcd = 0;
        for (int j = 1; j <= Util.ROUNDS_COUNT; j++) {
            if (randomNum1 % j == 0 && randomNum2 % j == 0) {
                gcd = j;
            }
        }
        return gcd;
    }

    public static void gcdResult() {
        System.out.print("Question: " + randomNum1 + " " + randomNum2 + "\nYour answer: ");
        int numberUser = Engine.getAnswerUser().nextInt();
        int gcd = gcdCalculation();
        if (numberUser == gcd) {
            Engine.correctResult();
        } else if (numberUser != gcd) {
            System.out.println("\'" + numberUser + "\'" + Engine.WRONG_ANSWER + "\'" + gcd + "\'.");
            Engine.tryAgain();
            Engine.incorrectAnswer();
        }
    }
}
