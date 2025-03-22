public class Main {
    public static void main(String[] args) {
        // Expected Output: 2
        int var1 = 5;
        int var2 = 6;
        if ((var2 = 1) == var1)
            System.out.print(var2);
        else
            System.out.print(++var2);



        // Expected Output: 2010
        int a = 20, b = 10;
        if ((a < b) && (b++ < 25)) {
            System.out.println(a);
        } else {
            System.out.print(a);
        }
        System.out.println(b);
    }
}