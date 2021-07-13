package hexlet.code.game;

import java.util.Arrays;

import hexlet.code.Engine;

public class Prime {
    private static int[] listDivider = new int[0];
    private static int conditionIsSatisfied = 0;

    public static void primeNumber() {
        int randomNum = 2 + (int) (Math.random() * Engine.getRangeNum());
        System.out.print("Question: " + randomNum + "\nYour answer: ");
        String numberUser = Engine.getAnswerUser().nextLine();
        for (int j = 2; j <= randomNum; j++) {
            if (randomNum % j == 0) {
                listDivider = Arrays.copyOf(listDivider, conditionIsSatisfied + 1);
                listDivider[conditionIsSatisfied] = j;
                conditionIsSatisfied++;
            }
        }
        if (numberUser.equals("yes") && listDivider.length == 1) {
            Engine.correctResult();
            listDivider = new int[0];
            conditionIsSatisfied = 0;
        } else if (numberUser.equals("no") && listDivider.length != 1) {
            Engine.correctResult();
            listDivider = new int[0];
            conditionIsSatisfied = 0;
        } else if (numberUser.equals("no") && listDivider.length == 1) {
            System.out.println("\'no\'" + Engine.wrongAnswer() + "\'yes\'.");
            Engine.tryAgain();
            System.exit(0);
        } else if (numberUser.equals("yes") && listDivider.length != 1) {
            System.out.println("\'yes\'" + Engine.wrongAnswer() + "\'no\'.");
            Engine.tryAgain();
            System.exit(0);
        }
    }
}
