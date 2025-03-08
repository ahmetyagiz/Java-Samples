
public class DigitCounter {

    public static int countDigits(String number){
        try {
            long num = Math.abs(Long.parseLong(number));
            return String.valueOf(num).length();
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Geçersiz giriş: " + number);
        }
    }

    public static int countDigitsRecursive(String number){
        return findDigitCount(Math.abs(Integer.parseInt(number)));
    }

    public static int findDigitCount(int num){
        if(num < 10){
            return 1;
        }
        return 1 + findDigitCount(num/10);
    }
}
