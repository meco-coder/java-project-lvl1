package hexlet.code.game;


import hexlet.code.Engine;
import hexlet.code.Util;

import java.util.Scanner;

public class Prime {

    private static final String QUESTION = "Answer 'yes' if given number is prime. Otherwise answer 'no'.";

    public static void runPrimeGame(String nameUsr, Scanner userInputString) {
        System.out.println(QUESTION);
        String[] answers = new String[Engine.ROUNDS_COUNT];
        String[] questions = new String[Engine.ROUNDS_COUNT];
        for (int i = 0; i < Engine.ROUNDS_COUNT; i++) {
            int question = 2 + Util.getRandomNumb(Engine.MAXIMUM_VALUE_LIMIT, Engine.MINIMUM_VALUE_LIMIT);
            int resultPrimeCalculation = primeCalculation(question);
            answers[i] = primeNumber(resultPrimeCalculation);
            questions[i] = String.valueOf(question);
        }
        Engine.launchGameRounds(questions, answers, nameUsr, userInputString);
    }

    public static int primeCalculation(int question) {
        int conditionIsSatisfied = 0;
        for (int j = 2; j <= question; j++) {
            if (question % j == 0) {
                conditionIsSatisfied++;
            }
        }
        return conditionIsSatisfied;
    }

    public static String primeNumber(int resultPrimeCalculation) {
        String answers = "";
        if (resultPrimeCalculation == 1) {
            answers = "yes";
        } else {
            answers = "no";
        }
        return answers;
    }
}
