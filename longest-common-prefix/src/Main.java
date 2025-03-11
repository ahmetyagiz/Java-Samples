/// Write a function to find the longest common prefix string amongst an array of strings.
///
/// If there is no common prefix, return an empty string "".
///
///
///
/// Example 1:
///
/// Input: strs = ["flower","flow","flight"]
/// Output: "fl"
/// Example 2:
///
/// Input: strs = ["dog","racecar","car"]
/// Output: ""
/// Explanation: There is no common prefix among the input strings.
///
///
/// Constraints:
///
/// 1 <= strs.length <= 200
/// 0 <= strs[i].length <= 200
/// strs[i] consists of only lowercase English letters if it is non-empty.
class Main {
    public static void main(String[] args) {
        String[] input = new String[]{"ab", "a"};
        System.out.println(longestCommonPrefix(input));
    }

    public static String longestCommonPrefix(String[] strs) {
        String firstElement = strs[0];
        StringBuilder builder = new StringBuilder();

        for (int i = 0; i < firstElement.length(); i++) {
            char c = firstElement.charAt(i);

            for (int j = 1; j < strs.length; j++) {
                if (i == strs[j].length() || c != strs[j].charAt(i)) {
                    return builder.toString();
                }
            }
            builder.append(c);
        }
        return builder.toString();
    }
}