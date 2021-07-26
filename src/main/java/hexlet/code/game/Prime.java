package hexlet.code.game;


import hexlet.code.Engine;
import hexlet.code.Util;

public class Prime {
    private static final int ROUND = 3;
    public static void questionPrime(String nameUsr) {
        int[] question = new int[ROUND];
        for (int i = 0; i < question.length; i++) {
            question[i] = 2 + Util.getRandomNumb();
        }
        primeCalculation(question, nameUsr);
    }

    public static void primeCalculation(int[] question, String nameUsr) {
        int[] result = new int[ROUND];
        for (int i = 0; i < question.length; i++) {
            int conditionIsSatisfied = 0;
            for (int j = 2; j <= question[i]; j++) {
                if (question[i] % j == 0) {
                    conditionIsSatisfied++;
                }
                result[i] = conditionIsSatisfied;
            }
        }
        primeNumberResult(question, nameUsr, result);
    }

    public static void primeNumberResult(int[] question, String nameUsr, int[] result) {
        String[] answer = new String[ROUND];
        for (int i = 0; i < result.length; i++) {
            if (result[i] == 1) {
                answer[i] = "yes";
            } else if (result[i] != 1) {
                answer[i] = "no";
            }
        }
        Engine.questionAndAnswerForString(question, answer, nameUsr);
    }
}
