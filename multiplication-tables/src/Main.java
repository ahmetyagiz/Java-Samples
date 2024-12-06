import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(bufferedReader.readLine().trim());

        for(int i = 1; i <= 10; i++){
            // WAY 1 - Concatenation
            //System.out.println(N + " x " + i + " = " + N * i);

            // WAY 2 - String.format
            int result = N * i;
            String output = String.format("%d x %d = %d", N, i, result);
            System.out.println(output);
        }
        bufferedReader.close();
    }
}