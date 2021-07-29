package hexlet.code.game;

import hexlet.code.Engine;
import hexlet.code.Util;

public class Even {
    private static final int ROUND = 3;
    public static void questionEvenNumber(String nameUsr) {
        int[] question = new int[ROUND];
        for (int i = 0; i < question.length; i++) {
            question[i] = Util.getRandomNumb();
        }
        resultEvenNumber(question, nameUsr);
    }

    public static void resultEvenNumber(int[] question, String nameUsr) {
        String[] answer = new String[ROUND];
        String[] questionResult = new String[ROUND];
        for (int i = 0; i < question.length; i++) {
            if (question[i] % 2 == 0) {
                answer[i] = "yes";
            } else if (question[i] % 2 != 0) {
                answer[i] = "no";
            }
            questionResult[i] = String.valueOf(question[i]);
        }
        Engine.questionAndAnswerForString(questionResult, answer, nameUsr);
    }
}
