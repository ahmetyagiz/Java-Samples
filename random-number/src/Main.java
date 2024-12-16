import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(15) - 5;
        System.out.println(randomNumber);
    }
}