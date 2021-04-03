package solutions.kuy7;

import java.util.Arrays;

public class ShortestWord {
    public static int findShort(String s) {
        return Arrays.stream(Arrays.stream(s.split(" "))
                .mapToInt(i -> i.length())
                .toArray())
                .min().getAsInt();
    }
}
