package hexlet.code.game;

import hexlet.code.Engine;

public class GCD {
    public static void gcdResult() {
        int randomNum1 = (int) (Math.random() * Engine.getRangeNum());
        int randomNum2 = (int) (Math.random() * Engine.getRangeNum());
        System.out.print("Question: " + randomNum1 + " " + randomNum2 + "\nYour answer: ");
        int numberUser = Engine.getAnswerUser().nextInt();
        int gcd = 0;
        for (int j = 1; j <= Engine.getRangeNum(); j++) {
            if (randomNum1 % j == 0 && randomNum2 % j == 0) {
                gcd = j;
            }
        }
        if (numberUser == gcd) {
            Engine.correctResult();
        } else if (numberUser != gcd) {
            System.out.println("\'" + numberUser + "\'" + Engine.wrongAnswer() + "\'" + gcd + "\'.");
            Engine.tryAgain();
            System.exit(0);
        }
    }
}
