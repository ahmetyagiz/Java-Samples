import java.util.Arrays;

class Main {
    public static void main(String[] args) {
        int[] result = plusOne(new int[]{1,2,3});
        System.out.println(Arrays.toString(result));

        int[] result2 = plusOne(new int[]{1,9,9});
        System.out.println(Arrays.toString(result2));
    }

    public static int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] < 9) {
                digits[i]++;
                return digits;
            }
            digits[i] = 0;
        }

        int[] newDigits = new int[digits.length + 1];
        newDigits[0] = 1;
        return newDigits;
    }
}