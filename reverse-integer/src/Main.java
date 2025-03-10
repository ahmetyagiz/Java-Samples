/// Given a signed 32-bit integer x, return x with its digits reversed. If reversing x causes the value to go outside the signed 32-bit integer range [-2^31, 2^31 - 1], then return 0.
///
/// Assume the environment does not allow you to store 64-bit integers (signed or unsigned).
///
/// Example 1:
/// Input: x = 123
/// Output: 321
///
/// Example 2:
/// Input: x = -123
/// Output: -321
///
/// Example 3:
/// Input: x = 120
/// Output: 21
///
/// Constraints:
///
/// -2^31 <= x <= 2^31 - 1
class Main {
    public static void main(String[] args) {
        System.out.println(reverse(-321));
    }

    private static int reverse(int num) {
        boolean isNumNegative = false;

        if(num < 0){
            isNumNegative = true;
            num = Math.abs(num);
        }

        StringBuilder builder = new StringBuilder();

        while(num != 0){
            builder.append(num % 10);
            num /= 10;
        }

        if(isNumNegative){
            builder.insert(0, '-');
        }
        String str = builder.toString();

        try{
            return Integer.parseInt(str);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }
}