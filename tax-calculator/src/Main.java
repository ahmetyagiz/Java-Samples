import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number: ");
        int gross = sc.nextInt();

        double tax = ((double) gross * 18 / 100);
        double taxedValue = gross + tax;

        System.out.println("Gross: " + gross);
        System.out.println("Taxed Value: " + taxedValue);
        System.out.println("Tax: " + tax);
    }
}