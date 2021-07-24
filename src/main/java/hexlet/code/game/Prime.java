package hexlet.code.game;


import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {

    public static void questionPrime(String nameUsr) {
        while (Engine.getTrueAnswer() < Engine.getRound() && Engine.getIncorrectAnswer() == 0) {
        int randomNum = 2 + Util.getRandomNumb();
        System.out.print("Question: " + randomNum + "\nYour answer: ");
        String numberUser = Engine.getAnswerUser().nextLine();
        Engine.primeCalculation(randomNum);
        Engine.primeNumber(numberUser, nameUsr);
        }
        Engine.successfulCompletionOfTheGame(nameUsr);
    }
}
