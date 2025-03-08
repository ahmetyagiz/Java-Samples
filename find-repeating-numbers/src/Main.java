public class Main {
    public static void main(String[] args) {
        // Approach 1: Using String.valueOf(num).length() to count digits
        String number1 = "-522";
        int digitCount1 = DigitCounter.countDigits(number1);
        System.out.println("Approach 1: " + digitCount1 + " digits in " + number1);

        // Approach 2: Using Recursion to count digits
        String number2 = "-522";
        int digitCount2 = DigitCounter.countDigitsRecursive(number2);
        System.out.println("Approach 2: " + digitCount2 + " digits in " + number2);

        // Find duplicate characters in a given string
        String str = "Flipper";
        String duplicateChars = DuplicateCharacterFinder.findDuplicateCharacters(str);
        System.out.println("Duplicate characters in \"" + str + "\": " + duplicateChars);
    }
}
