import java.util.Arrays;
/// Given an array of n integers where n > 1, return an array of the same size
/// as the input array, where each element at index i is the sum of all elements
/// in the input array except the element at index i.
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[]{2, 3, 4, 5};
        int[] result = sumExceptSelf(arr);
        System.out.println(Arrays.toString(result));
    }

    // O(n)
    public static int[] sumExceptSelf(int[] arr) {
        int totalSum = 0;

        for (int num : arr) {
            totalSum += num;
        }

        int[] resultArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = totalSum - arr[i];
        }

        return resultArr;
    }

    // O(n^2)
//    public static int[] sumExceptSelf(int[] arr) {
//        int sum = 0;
//        int[] resultArr = new int[arr.length];
//
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//                if(i != j){
//                    sum += arr[j];
//                }
//            }
//            resultArr[i] = sum;
//            sum = 0;
//        }
//        return resultArr;
//    }
}