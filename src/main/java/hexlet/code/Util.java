package hexlet.code;

public class Util {
    private static final int MIN = 0;
    private static final int MAX = 50;

    public static int getRandomNumb() {
        int randomNumber = (int) ((Math.random() * (MAX - MIN)) + MIN);
        return randomNumber;
    }

    public static int getMax() {
        return MAX;
    }

    public static int getMin() {
        return MIN;
    }
}
