package solutions.kuy7;

public class Isogram {
    public static boolean isIsogram(String str) {
        return str.toLowerCase()
                .chars().distinct()
                .toArray().length == str.length();
    }
}
