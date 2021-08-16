package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Even {

    private static final String QUESTION = "Answer \'yes\' if the number is even, otherwise answer \'no\'.";

    public static void runEvenGame(String nameUsr, Scanner userInputString) {
        System.out.println(QUESTION);
        String[] answers = new String[Engine.ROUNDS_COUNT];
        String[] questions = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < answers.length; i++) {
            int question = Util.getRandomNumb(Engine.MAXIMUM_VALUE_LIMIT, Engine.MINIMUM_VALUE_LIMIT);
            if (isEven(question)) {
                answers[i] = "yes";
            } else {
                answers[i] = "no";
            }
            questions[i] = String.valueOf(question);
        }
        Engine.launchGameRounds(questions, answers, nameUsr, userInputString);
    }

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }
}
