import java.util.HashSet;
import java.util.Set;

class Main {
    public static void main(String[] args) {
        int[] nums = new int[]{4, 1, 2, 1, 2};
        System.out.println(singleNumber(nums));
    }

    // Time Complexity: O(n), Space Complexity: O(1)
    public static int singleNumber(int[] nums) {
        int ans = nums[0];
        for (int i = 1; i < nums.length; i++){
            ans = ans ^ nums[i];
        }
        return ans;
    }

    // Time Complexity: O(n), Space Complexity: O(n)
    //   private static int singleNumber(int[] nums) {
    //        if(nums.length == 1){
    //            return nums[0];
    //        }
    //
    //        Set<Integer> set = new HashSet<>();
    //        for (int i = 0; i < nums.length; i++) {
    //            if (set.contains(nums[i])) {
    //                set.remove(nums[i]);
    //            } else {
    //                set.add(nums[i]);
    //            }
    //        }
    //
    //        for(int element : set){
    //            System.out.println(element);
    //        }
    //
    //        return set.iterator().next();
    //    }

    // Time Complexity: O(n), Space Complexity: O(n)
    // private int singleNumber(int[] nums) {
    //     HashMap<Integer, Integer> map = new HashMap<>();

    //     for (int i = 0; i < nums.length; i++) {
    //         int num = nums[i];
    //         if (map.containsKey(num)) {
    //             map.put(num, map.get(num) + 1); // Eğer varsa, değerini artır
    //         } else {
    //             map.put(num, 1); // Yoksa, 1 olarak ekle
    //         }
    //     }

    //     for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
    //         if (entry.getValue() == 1) {
    //             return entry.getKey();
    //         }
    //     }

    //     return -1;
}