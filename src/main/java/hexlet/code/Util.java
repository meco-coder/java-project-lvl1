package hexlet.code;

public class Util {
    public static int getRandomNumb(int max, int min) {
        int randomNumber = (int) ((Math.random() * (max - min)) + min);
        return randomNumber;
    }

}
