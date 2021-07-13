package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void nameUsr() {
        System.out.println(" ");
        System.out.print("\nWelcome to the Brain Games!\n" + "May I have your name? ");
        Scanner s = new Scanner(System.in);
        String nameEntered = s.nextLine();
        String nameUsr = nameEntered;
        System.out.println("Hello, " + nameUsr + "!");
    }

}
