package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Progression {
    private static final int FIRST_NUM = 10;
    private static final int SECOND_NUM = 5;
    private static final int MAX_NUM = 50;
    private static final int MIN_NUM = 2;
    private static final int ROUND = 3;

    public static void progressionCalculation(String nameUsr) {
        String[] questionResult = new String[ROUND];
        String[] hiddenNumberResult = new String[ROUND];
        for (int i = 0; i < questionResult.length; i++) {
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
            hiddenNumberResult[i] = String.valueOf(hiddenNumber);
            questionResult[i] = question.toString();
        }
        Engine.questionAndAnswerForString(questionResult, hiddenNumberResult, nameUsr);

    }
}
