package hexlet.code;

import java.util.Scanner;

public class Cli {

    public static void nameUsr(Scanner userInputString) {
        System.out.println(" ");
        System.out.println("Welcome to the Brain Games!");
        System.out.print("May I have your name? ");
        String nameUser = userInputString.nextLine();
        System.out.println("Hello, " + nameUser + "!");
    }

}
