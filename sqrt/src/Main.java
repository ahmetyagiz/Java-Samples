/// Given a non-negative integer x, return the square root of x rounded down to the nearest integer. The returned integer should be non-negative as well.
///
/// You must not use any built-in exponent function or operator.
///
/// For example, do not use pow(x, 0.5) in c++ or x ** 0.5 in python.
public class Main {
    public static void main(String[] args) {
        int input = 8;
        System.out.println(mySqrt(input));
    }

    public static int mySqrt(int x) {
        double d = Math.sqrt(x);
        int result = (int) Math.floor(d);
        return result;
    }
}