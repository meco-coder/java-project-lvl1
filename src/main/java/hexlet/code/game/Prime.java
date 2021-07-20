package hexlet.code.game;


import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static int conditionIsSatisfied = 0;
    private static int randomNum = 2 + Util.getRandomNumb();

    public static void primeCalculation() {
        for (int j = 2; j <= randomNum; j++) {
            if (randomNum % j == 0) {
                conditionIsSatisfied++;
            }
        }
    }

    public static void primeNumber() {
        System.out.print("Question: " + randomNum + "\nYour answer: ");
        String numberUser = Engine.getAnswerUser().nextLine();
        primeCalculation();
        if (numberUser.equals("yes") && conditionIsSatisfied == 1) {
            Engine.correctResult();
            conditionIsSatisfied = 0;
            Engine.gameSelection();
        } else if (numberUser.equals("no") && conditionIsSatisfied != 1) {
            Engine.correctResult();
            conditionIsSatisfied = 0;
            Engine.gameSelection();
        } else if (numberUser.equals("no") && conditionIsSatisfied == 1) {
            System.out.println("\'no\'" + Engine.WRONG_ANSWER + "\'yes\'.");
            Engine.tryAgain();
            Engine.incorrectAnswer();
            Engine.gameSelection();
        } else if (numberUser.equals("yes") && conditionIsSatisfied != 1) {
            System.out.println("\'yes\'" + Engine.WRONG_ANSWER + "\'no\'.");
            Engine.tryAgain();
            Engine.incorrectAnswer();
        }
    }
}
