package solutions.kuy7;

import java.util.Arrays;

public class SmallEnough {
    public static boolean smallEnough(int[] a, int limit) {
        return Arrays.stream(a).max().getAsInt() <= limit;
    }
}
