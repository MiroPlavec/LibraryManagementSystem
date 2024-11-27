package helpers;

import java.io.IOException;
import java.util.Scanner;

public final class Helper {
    public static Scanner scanner = new Scanner(System.in);

    public static void clearConsole() {
        try {
            String os = System.getProperty("os.name");

            if (os.contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else
            {
                new ProcessBuilder("clear").inheritIO().start().waitFor();

            }

            //return true; // Indicate success
        } catch (IOException | InterruptedException e) {
            System.err.println("Error clearing console: " + e.getMessage());
            //return false; // Indicate failure
        }
    }
}
