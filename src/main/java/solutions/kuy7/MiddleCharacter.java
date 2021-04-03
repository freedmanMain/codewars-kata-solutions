package solutions.kuy7;

public class MiddleCharacter {
    public static String getMiddle(String word) {
        if (word.length() % 2 == 0) {
            return word.substring(word.length() / 2 - 1, word.length() / 2 + 1);
        }
        return "" + word.charAt(word.length() / 2);
    }
}
