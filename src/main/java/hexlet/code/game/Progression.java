package hexlet.code.game;

import hexlet.code.Engine;

public class Progression {

    public static void progressionResult() {
        System.out.println("What number is missing in the progression?");
        for (int i = 0; i < Engine.getNumOfRounds(); i++) {
            final int firstNum = 10;
            final int secondNum = 5;
            int lengthProgression = firstNum + (int) (Math.random() * ((secondNum - firstNum) + 1));
            int point = (int) (Math.random() * lengthProgression);
            final int maxNum = 50;
            final int minNum = 2;
            int randomNum = minNum + (int) (Math.random() * ((maxNum - minNum) + 1));
            int interval = (int) (Math.random() * Engine.getRangeNum());
            int[] progression = new int[lengthProgression];
            progression[0] = randomNum;
            for (int j = 0; j < lengthProgression - 1; j++) {
                progression[0] = randomNum;
                progression[j + 1] = progression[j] + interval;
            }
            String[] progressionResult = new String[lengthProgression];
            StringBuilder question = new StringBuilder();
            for (int j = 0; j < lengthProgression; j++) {
                progressionResult[j] = String.valueOf(progression[j]);
            }
            progressionResult[point] = "..";
            for (int j = 0; j < lengthProgression; j++) {
                question.append(progressionResult[j]).append(" ");
            }
            System.out.print("Question: " + question.toString() + "\nYour answer: ");
            int numberUser = Engine.getAnswerUser().nextInt();
            if (numberUser == progression[point]) {
                Engine.correctResult();
            } else if (numberUser != progression[point]) {
                System.out.println("\'" + numberUser + "\'" + Engine.wrongAnswer() + "\'" + progression[point] + "\'.");
                Engine.tryAgain();
                break;
            }
        }
        Engine.gameEndedSuccessfully();
    }
}
