package solutions.kuy7;

public class R {
    public static String removeBang(String str) {
        StringBuilder builder = new StringBuilder();
        for (String word : str.split(" ")) {
            builder.append(word.replaceAll("[!]+$", "")).append(" ");
        }
        return builder.toString().trim();
    }
}
