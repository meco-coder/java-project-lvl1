package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final int FIRST_NUM = 10;
    private static final int SECOND_NUM = 5;
    private static final int MAX_NUM = 50;
    private static final int MIN_NUM = 2;

    public static void questionAndProgressionCalculation(String nameUsr) {
        while (Engine.getTrueAnswer() < Engine.getRound() && Engine.getIncorrectAnswer() == 0) {
        int lengthProgression = FIRST_NUM + (int) (Math.random() * ((SECOND_NUM - FIRST_NUM) + 1));
        int point = (int) (Math.random() * lengthProgression);
        int randomNum = MIN_NUM + (int) (Math.random() * ((MAX_NUM - MIN_NUM) + 1));
        int interval = Util.getRandomNumb();
        int[] progression = new int[lengthProgression];
        progression[0] = randomNum;
        for (int j = 0; j < lengthProgression - 1; j++) {
            progression[0] = randomNum;
            progression[j + 1] = progression[j] + interval;
        }
        int hiddenNumber = progression[point];
        String[] progressionResult = new String[lengthProgression];
        StringBuilder question = new StringBuilder();
        for (int j = 0; j < lengthProgression; j++) {
            progressionResult[j] = String.valueOf(progression[j]);
        }
        progressionResult[point] = "..";
        for (int j = 0; j < lengthProgression; j++) {
            question.append(progressionResult[j]).append(" ");
        }
        System.out.print("Question: " + question.toString() + "\nYour answer: ");
        int numberUser = Engine.getAnswerUser().nextInt();
        Engine.progressionResult(numberUser,hiddenNumber,nameUsr);
        }
        Engine.successfulCompletionOfTheGame(nameUsr);
    }

}
