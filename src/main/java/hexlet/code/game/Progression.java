package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Progression {
    private static final int FIRST_NUM = 10;
    private static final int SECOND_NUM = 5;

    private static final String QUESTION = "What number is missing in the progression?";

    public static void runProgressionGame(String nameUsr, Scanner userInputString) {
        System.out.println(QUESTION);
        String[] questions = new String[Engine.ROUNDS_COUNT];
        String[] answers = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < questions.length; i++) {
            int[] progressions = creatingProgression();
            int point = (int) (Math.random() * progressions.length);
            int hiddenNumber = progressions[point];
            answers[i] = String.valueOf(hiddenNumber);
            String[] progressionWithHiddenElement = hidingElement(progressions, point);
            questions[i] = creatingQuestion(progressionWithHiddenElement);
        }
        Engine.launchGameRounds(questions, answers, nameUsr, userInputString);
    }

    public static int[] creatingProgression() {
        int lengthProgression = Util.getRandomNumb(FIRST_NUM, SECOND_NUM) + 1;
        int randomNum = Util.getRandomNumb(Engine.MAXIMUM_VALUE_LIMIT, Engine.MINIMUM_VALUE_LIMIT) + 1;
        int interval = Util.getRandomNumb(Engine.MAXIMUM_VALUE_LIMIT, Engine.MINIMUM_VALUE_LIMIT);
        int[] progressions = new int[lengthProgression];
        for (int i = 0; i < lengthProgression - 1; i++) {
            progressions[0] = randomNum;
            progressions[i + 1] = progressions[i] + interval;
        }
        return progressions;
    }

    public static String[] hidingElement(int[] progressions, int point) {
        String[] progressionsWithHiddenElement = new String[progressions.length];
        for (int i = 0; i < progressions.length; i++) {
            progressionsWithHiddenElement[i] = String.valueOf(progressions[i]);
        }
        progressionsWithHiddenElement[point] = "..";
        return progressionsWithHiddenElement;
    }

    public static String creatingQuestion(String[] progressionWithHiddenElement) {
        StringBuilder question = new StringBuilder();
        for (String s : progressionWithHiddenElement) {
            question.append(s).append(" ");
        }
        return question.toString();
    }
}
