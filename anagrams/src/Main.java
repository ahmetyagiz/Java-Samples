import java.util.*;
import java.util.Scanner;

public class Main {

    public static boolean isAnagram(String a, String b){
        if (a.length() != b.length()) return false;

        HashMap<Character, Integer> mapA = new HashMap<>();
        HashMap<Character, Integer> mapB = new HashMap<>();
        a = a.toLowerCase();
        b = b.toLowerCase();

        for(char c : a.toCharArray()){
            mapA.put(c, mapA.getOrDefault(c, 0) + 1);
        }

        for(char c : b.toCharArray()){
            mapB.put(c, mapB.getOrDefault(c, 0) + 1);
        }

        if(mapA.equals(mapB)){
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String a = scan.next();
        String b = scan.next();
        scan.close();
        boolean ret = isAnagram(a, b);
        System.out.println( (ret) ? "Anagrams" : "Not Anagrams" );
    }
}
