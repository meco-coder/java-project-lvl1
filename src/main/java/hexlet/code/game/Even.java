package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    public static void questionEvenNumber(String nameUsr) {
        while (Engine.getTrueAnswer() < Engine.getRound() && Engine.getIncorrectAnswer() == 0) {
            int randomNumb = Util.getRandomNumb();
            System.out.print("Question: " + randomNumb + "\n" + "Your answer: ");
            String numberUser = Engine.getAnswerUser().nextLine();
            Engine.resultEvenNumber(randomNumb, numberUser, nameUsr);
        }
        Engine.successfulCompletionOfTheGame(nameUsr);
    }
}
