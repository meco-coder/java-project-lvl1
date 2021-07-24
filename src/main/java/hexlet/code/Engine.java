package hexlet.code;

import java.util.Scanner;

public class Engine {
    private static Scanner answerUser;
    private static int trueAnswer;
    private static int incorrectAnswer;
    private static final int ROUND = 3;
    public static final String WRONG_ANSWER = " is wrong answer ;(. Correct answer was ";
    private static int gcd;
    private static int conditionIsSatisfied = 0;


    public static Scanner getAnswerUser() {
        answerUser = new Scanner(System.in);
        return answerUser;
    }

    public static void correctResult() {
        System.out.println("Correct!");
        trueAnswer++;
    }

    public static int getTrueAnswer() {
        return trueAnswer;
    }

    public static int getIncorrectAnswer() {
        return incorrectAnswer;
    }

    public static int getRound() {
        return ROUND;
    }

    public static void incorrectAnswer() {
        incorrectAnswer++;
    }

    public static void successfulCompletionOfTheGame(String nameUsr) {
        if (trueAnswer == ROUND) {
            System.out.println("Congratulations, " + nameUsr + "!");
            trueAnswer = 0;
        }
    }

    public static void resultEvenNumber(int randomNumb, String numberUser, String nameUsr) {
        if (randomNumb % 2 == 0 && numberUser.equals("yes") || randomNumb % 2 != 0 && numberUser.equals("no")) {
            correctResult();
        } else if (randomNumb % 2 == 0 && numberUser.equals("no")) {
            System.out.println("\'no\'" + WRONG_ANSWER + "\'yes\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();
        } else if (randomNumb % 2 != 0 && numberUser.equals("yes")) {
            System.out.println("\'yes\'" + WRONG_ANSWER + "\'no\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();
        } else if (!numberUser.equals("yes") || !numberUser.equals("no")) {
            System.out.println("\'" + numberUser + "\'" + WRONG_ANSWER + "\'yes\' or \'no\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();
        }
    }

    public static void calcNumber(String symbol, int numUser, int resSum, int resSub, int resMult, String nameUsr) {
        if (symbol.equals("+") && numUser == resSum) {
            correctResult();

        } else if (symbol.equals("+") && numUser != resSum) {
            System.out.println("\'" + numUser + "\'" + WRONG_ANSWER + "\'" + resSum + "\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();

        }
        if (symbol.equals("-") && numUser == resSub) {
            correctResult();

        } else if (symbol.equals("-") && numUser != resSub) {
            System.out.println("\'" + numUser + "\'" + WRONG_ANSWER + "\'" + resSub + "\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();

        }
        if (symbol.equals("*") && numUser == resMult) {
            correctResult();

        } else if ((symbol.equals("*") && numUser != resMult)) {
            System.out.println("\'" + numUser + "\'" + WRONG_ANSWER + "\'" + resMult + "\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();

        }
    }

    public static void progressionResult(int numberUser, int hiddenNumber, String nameUsr) {
        if (numberUser == hiddenNumber) {
            correctResult();

        } else if (numberUser != hiddenNumber) {
            System.out.println("\'" + numberUser + "\'" + WRONG_ANSWER + "\'" + hiddenNumber + "\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();

        }
    }

    public static void gcdCalculation(int randomNum1, int randomNum2) {
        gcd = 0;
        for (int j = 1; j <= Util.ROUNDS_COUNT; j++) {
            if (randomNum1 % j == 0 && randomNum2 % j == 0) {
                gcd = j;
            }
        }
    }

    public static void gcdResult(int numberUser, String nameUsr) {
        if (numberUser == gcd) {
            correctResult();

        } else if (numberUser != gcd) {
            System.out.println("\'" + numberUser + "\'" + WRONG_ANSWER + "\'" + gcd + "\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();

        }
    }

    public static void primeCalculation(int randomNum) {
        for (int j = 2; j <= randomNum; j++) {
            if (randomNum % j == 0) {
                conditionIsSatisfied++;
            }
        }
    }

    public static void primeNumber(String numberUser, String nameUsr) {
        if (numberUser.equals("yes") && conditionIsSatisfied == 1) {
            correctResult();
            conditionIsSatisfied = 0;

        } else if (numberUser.equals("no") && conditionIsSatisfied != 1) {
            correctResult();
            conditionIsSatisfied = 0;

        } else if (numberUser.equals("no") && conditionIsSatisfied == 1) {
            System.out.println("\'no\'" + WRONG_ANSWER + "\'yes\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();
        } else if (numberUser.equals("yes") && conditionIsSatisfied != 1) {
            System.out.println("\'yes\'" + WRONG_ANSWER + "\'no\'.");
            System.out.println("Let's try again, " + nameUsr + "!");
            incorrectAnswer();
        }
    }
}
