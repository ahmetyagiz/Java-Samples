import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        //Get input
        System.out.print("Enter the KM: ");
        Scanner sc = new Scanner(System.in);
        double KM = sc.nextDouble();

        double fee = KM * 2.20;

        if(fee < 20){
            fee = 20;
        }
        else {
            fee += 10;
        }

        System.out.println(fee);
    }
}