package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Even {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAXIMUM_VALUE_LIMIT = 50;
    private static final int MINIMUM_VALUE_LIMIT = 0;

    public static void questionAndResultEvenNumber(String nameUsr, Scanner userInputString) {
        System.out.println("Answer \'yes\' if the number is even, otherwise answer \'no\'.");
        int[] question = new int[ROUNDS_COUNT];
        String[] answer = new String[ROUNDS_COUNT];
        String[] questionResult = new String[ROUNDS_COUNT];
        for (int i = 0; i < question.length; i++) {
            question[i] = Util.getRandomNumb(MAXIMUM_VALUE_LIMIT, MINIMUM_VALUE_LIMIT);
            if (question[i] % 2 == 0) {
                answer[i] = "yes";
            } else if (question[i] % 2 != 0) {
                answer[i] = "no";
            }
            questionResult[i] = String.valueOf(question[i]);
        }
        Engine.launchGameRounds(questionResult, answer, nameUsr, userInputString);
    }
}
