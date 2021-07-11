package hexlet.code.game;

import hexlet.code.Engine;

public class Calc {
    public static void calcNumber() {
        System.out.println("What is the result of the expression?");
        for (int i = 0; i < Engine.getNumOfRounds(); i++) {
            int randomNum1 = (int) (Math.random() * Engine.getRangeNum());
            int randomNum2 = (int) (Math.random() * Engine.getRangeNum());
            int numberSymbol = (int) (Math.random() * 2);
            int resultSum = randomNum1 + randomNum2;
            int resultMult = randomNum1 * randomNum2;
            int resultSub = randomNum1 - randomNum2;
            String[] symbol = {"+", "-", "*"};
            String randomSymbol = symbol[numberSymbol];
            System.out.print("Question: " + randomNum1 + randomSymbol + randomNum2 + "\nYour answer: ");
            int numberUser = Engine.getAnswerUser().nextInt();
            if (randomSymbol.equals("+") && numberUser == resultSum) {
                Engine.correctResult();
            } else if (randomSymbol.equals("+") && numberUser != resultSum) {
                System.out.println("\'" + numberUser + "\'" + Engine.wrongAnswer() + "\'" + resultSum + "\'.");
                Engine.tryAgain();
                break;
            }
            if (randomSymbol.equals("-") && numberUser == resultSub) {
                Engine.correctResult();
            } else if (randomSymbol.equals("-") && numberUser != resultSub) {
                System.out.println("\'" + numberUser + "\'" + Engine.wrongAnswer() + "\'" + resultSub + "\'.");
                Engine.tryAgain();
                break;
            }
            if (randomSymbol.equals("*") && numberUser == resultMult) {
                Engine.correctResult();
            } else if ((randomSymbol.equals("*") && numberUser != resultMult)) {
                System.out.println("\'" + numberUser + "\'" + Engine.wrongAnswer() + "\'" + resultMult + "\'.");
                Engine.tryAgain();
                break;
            }

        }
        Engine.gameEndedSuccessfully();
    }

}
