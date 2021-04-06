package solutions.kuy7;

import java.util.Arrays;

public class Minimum {
    public static int minValue(int[] values) {
        int[] dist = Arrays.stream(values).distinct().toArray();
        Arrays.sort(dist);
        return Integer.parseInt(Arrays.toString(dist).replaceAll("[\\W]",""));
    }
}
