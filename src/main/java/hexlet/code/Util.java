package hexlet.code;

public class Util {
    public static final int ROUNDS_COUNT = 50;
    public static int getRandomNumb() {
        int randomNumber = (int) (Math.random() * ROUNDS_COUNT);
        return randomNumber;
    }
}
