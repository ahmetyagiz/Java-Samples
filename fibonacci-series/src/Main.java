import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /// 9 Elemental Fibonacci Series : 0 1 1 2 3 5 8 13 21 34

        //Get input
        System.out.print("Enter fibonacci count: ");
        int input = new Scanner(System.in).nextInt();

        int a = 0;
        int b = 1;
        int c = 0;

        System.out.println(0);
        System.out.println(1);

        for(int i = 2; i < input; i++) {
            c = a + b;
            System.out.println(c);
            a = b;
            b = c;
        }
    }
}