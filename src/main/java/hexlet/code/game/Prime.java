package hexlet.code.game;


import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Prime {
    private static final int ROUNDS_COUNT = 3;
    private static final int MAXIMUM_VALUE_LIMIT = 50;
    private static final int MINIMUM_VALUE_LIMIT = 0;

    public static void questionPrime(String nameUsr, Scanner userInputString) {
        System.out.println("Answer 'yes' if given number is prime. Otherwise answer 'no'.");
        int[] question = new int[ROUNDS_COUNT];
        for (int i = 0; i < question.length; i++) {
            question[i] = 2 + Util.getRandomNumb(MAXIMUM_VALUE_LIMIT, MINIMUM_VALUE_LIMIT);
        }
        primeCalculation(question, nameUsr, userInputString);
    }

    public static void primeCalculation(int[] question, String nameUsr, Scanner userInputString) {
        int[] result = new int[ROUNDS_COUNT];
        for (int i = 0; i < question.length; i++) {
            int conditionIsSatisfied = 0;
            for (int j = 2; j <= question[i]; j++) {
                if (question[i] % j == 0) {
                    conditionIsSatisfied++;
                }
                result[i] = conditionIsSatisfied;
            }
        }
        primeNumberResult(question, nameUsr, result, userInputString);
    }

    public static void primeNumberResult(int[] question, String nameUsr, int[] result, Scanner userInputString) {
        String[] answer = new String[ROUNDS_COUNT];
        String[] questionResult = new String[ROUNDS_COUNT];
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) {
                answer[i] = "yes";
            } else if (result[i] != 1) {
                answer[i] = "no";
            }
            questionResult[i] = String.valueOf(question[i]);
        }
        Engine.launchGameRounds(questionResult, answer, nameUsr, userInputString);
    }
}
