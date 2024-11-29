public class Main {
    public static void main(String[] args)
    {
        // Perfect numbers

        int num = 5;
        int x = 0;

        for(int i = 1; i < num; i++)
        {
            if (num % i == 0)
            {
                x += i;
            }
        }

        if (x == num)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}