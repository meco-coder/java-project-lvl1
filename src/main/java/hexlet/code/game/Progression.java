package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Progression {
    private static final int FIRST_NUM = 10;
    private static final int SECOND_NUM = 5;
    private static final int MAXIMUM_VALUE_LIMIT = 50;
    private static final int MINIMUM_VALUE_LIMIT = 0;
    private static final int ROUNDS_COUNT = 3;

    public static void progressionCalculation(String nameUsr, Scanner userInputString) {
        System.out.println("What number is missing in the progression?");
        String[] questionResult = new String[ROUNDS_COUNT];
        String[] hiddenNumberResult = new String[ROUNDS_COUNT];
        for (int i = 0; i < questionResult.length; i++) {
            int lengthProgression = Util.getRandomNumb(FIRST_NUM, SECOND_NUM) + 1;
            int point = (int) (Math.random() * lengthProgression);
            int randomNum = Util.getRandomNumb(MAXIMUM_VALUE_LIMIT, MINIMUM_VALUE_LIMIT) + 1;
            int interval = Util.getRandomNumb(MAXIMUM_VALUE_LIMIT, 0);
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
        Engine.launchGameRounds(questionResult, hiddenNumberResult, nameUsr, userInputString);

    }
}
