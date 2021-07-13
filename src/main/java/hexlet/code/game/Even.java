package hexlet.code.game;

import hexlet.code.Engine;

public class Even {
    public static void evenNumber() {
        int randomNumber = (int) (Math.random() * Engine.getRangeNum());
        System.out.print("Question: " + randomNumber + "\n" + "Your answer: ");
        String numberUser = Engine.getAnswerUser().nextLine();
        if (randomNumber % 2 == 0 && numberUser.equals("yes") || randomNumber % 2 != 0 && numberUser.equals("no")) {
            Engine.correctResult();
        } else if (randomNumber % 2 == 0 && numberUser.equals("no")) {
            System.out.println("\'no\'" + Engine.wrongAnswer() + "\'yes\'.");
            Engine.tryAgain();
            System.exit(0);
        } else if (randomNumber % 2 != 0 && numberUser.equals("yes")) {
            System.out.println("\'yes\'" + Engine.wrongAnswer() + "\'no\'.");
            Engine.tryAgain();
            System.exit(0);
        } else if (!numberUser.equals("yes") || !numberUser.equals("no")) {
            System.out.println("\'" + numberUser + "\'" + Engine.wrongAnswer() + "\'yes\' or \'no\'.");
            Engine.tryAgain();
            System.exit(0);
        }
    }
}
