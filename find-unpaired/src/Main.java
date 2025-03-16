import java.util.HashMap;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 2, 3, 1, 4};
        System.out.println(findUnpaired(arr));
    }

    /*
    //1. XOR (Optimal, O(n) Time, O(1) Space)
    public static int findUnpaired(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result ^= num; // XOR
        }
        return result;
    }*/

    //2. HashMap (Readable, O(n) Time, O(n) Space)
    public static int findUnpaired(int[] arr) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int num : arr) {
            if(map.containsKey(num)) {
                map.put(num, map.get(num) + 1);
            }else {
                map.put(num, 1);
            }

        }
        for (int key : map.keySet()) {
            if (map.get(key) == 1) {
                return key;
            }
        }
        return -1; // If it doesn't match any
    }
}
