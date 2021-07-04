package hexlet.code;
import java.util.Scanner;

public class Cli {
    public static String name() {
        Scanner s = new Scanner(System.in);
        String name = s.nextLine();
        return ("Hello," + name + "!");
    }
}
