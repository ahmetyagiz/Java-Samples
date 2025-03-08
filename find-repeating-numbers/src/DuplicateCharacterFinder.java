import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacterFinder {
    public static String findDuplicateCharacters(String str) {
        Map<Character, Integer> keyValuePairs = new HashMap<>();

        for (char character : str.toCharArray()) {
            if (keyValuePairs.containsKey(character)) {
                keyValuePairs.put(character, keyValuePairs.get(character) + 1);
            } else {
                keyValuePairs.put(character, 1);
            }
        }

        StringBuilder duplicateCharacters = new StringBuilder();

        for (Map.Entry<Character, Integer> entry : keyValuePairs.entrySet()) {
            if (entry.getValue() > 1) {
                duplicateCharacters.append(entry.getKey());
            }
        }

        return duplicateCharacters.toString();
    }
}
