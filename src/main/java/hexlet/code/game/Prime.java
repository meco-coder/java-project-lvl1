package hexlet.code.game;


import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Prime {

    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runPrimeGame(String nameUsr, Scanner userInputString) {
        System.out.println(QUESTION);
        int[] questions = new int[Engine.ROUNDS_COUNT];
        for (int i = 0; i < questions.length; i++) {
            questions[i] = 2 + Util.getRandomNumb(Engine.MAXIMUM_VALUE_LIMIT, Engine.MINIMUM_VALUE_LIMIT);
        }
        primeCalculation(questions, nameUsr, userInputString);
    }

    public static void primeCalculation(int[] questions, String nameUsr, Scanner userInputString) {
        int[] results = new int[Engine.ROUNDS_COUNT];
        for (int i = 0; i < questions.length; i++) {
            int conditionIsSatisfied = 0;
            for (int j = 2; j <= questions[i]; j++) {
                if (questions[i] % j == 0) {
                    conditionIsSatisfied++;
                }
                results[i] = conditionIsSatisfied;
            }
        }
        primeNumberResult(questions, nameUsr, results, userInputString);
    }

    public static void primeNumberResult(int[] questions, String nameUsr, int[] results, Scanner userInputString) {
        String[] answers = new String[Engine.ROUNDS_COUNT];
        String[] questionResult = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < results.length; i++) {
            if (results[i] == 1) {
                answers[i] = "yes";
            } else if (results[i] != 1) {
                answers[i] = "no";
            }
            questionResult[i] = String.valueOf(questions[i]);
        }
        Engine.launchGameRounds(questionResult, answers, nameUsr, userInputString);
    }
}
