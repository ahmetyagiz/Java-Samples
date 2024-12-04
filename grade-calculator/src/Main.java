import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Declaring fields
        int math, physics, chemistry, turkish, history, music;

        // Declaring Scanner class
        Scanner input = new Scanner(System.in);

        // Get Math grade
        System.out.print("Math Grade: ");
        math = input.nextInt();

        // Get Physics grade
        System.out.print("Physics Grade: ");
        physics = input.nextInt();

        // Get Chemistry grade
        System.out.print("Chemistry Grade: ");
        chemistry = input.nextInt();

        // Get Turkish grade
        System.out.print("Turkish Grade: ");
        turkish = input.nextInt();

        // Get History grade
        System.out.print("History Grade: ");
        history = input.nextInt();

        // Get Music grade
        System.out.print("Music Grade: ");
        music = input.nextInt();

        int sum = math + physics + chemistry + turkish + history + music;
        double result = (double) sum / 6;

        System.out.println(result);

        if (result < 60)
        {
            System.out.println("Failed");
        }
        else if (result >= 60)
        {
            System.out.println("Passed");
        }
    }
}