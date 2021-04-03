package solutions.kuy7;

public class ReverseLetter {
    public static String reverseLetter(final String str) {
        StringBuilder builder = new StringBuilder();
        for (char symbol : str.toCharArray()) {
            if ((byte) symbol >= 97 && (byte) symbol <= 122) {
                builder.append(symbol);
            }
        }
        return builder.reverse().toString();
    }
}
