public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{3, 5, -1, 8, 12};
        System.out.println(isSumExcludingMaxGreaterThanMax(arr));
    }

    // O(n)
    public static boolean isSumExcludingMaxGreaterThanMax(int[] arr) {
        int max = Integer.MIN_VALUE;
        int sum = 0;

        for (int num : arr) {
            sum += num;
            if(num > max) {
                max = num;
            }
        }
        sum -= max;

        if(sum >= max) {
            return true;
        }else {
            return false;
        }
    }
}