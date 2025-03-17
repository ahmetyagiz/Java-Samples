import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Read the input from STDIN (standard input)
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine(); // Read the input string

        // Get the singleton instance and set the str variable with the correct message format
        Singleton.getSingleInstance().str = "Hello I am a singleton! Let me say " + input + " to you";

        // Print the message as expected in the output format
        System.out.println(Singleton.getSingleInstance().str);
    }
}

class Singleton {
    // Step 1: Private static instance of Singleton
    private static Singleton instance;

    // Step 2: Public String variable to hold the message
    public String str;

    // Step 3: Private constructor
    private Singleton() {
        // Initialization can be done here
    }

    // Step 4: Public static method to get the single instance of Singleton
    public static Singleton getSingleInstance() {
        if (instance == null) {
            instance = new Singleton();  // Create instance only once
        }
        return instance;  // Return the same instance on subsequent calls
    }
}
