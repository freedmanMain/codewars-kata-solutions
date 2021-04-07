package solutions.kuy7;

public class RowWeights {
    public static int[] rowWeights(final int[] weights) {
        int total1 = 0;
        int total2 = 0;
        for (int i = 0; i < weights.length; i++) {
            total1 += i % 2 == 0 ? weights[i] : 0;
            total2 += i % 2 == 1 ? weights[i] : 0;
        }
        return new int[] {total1, total2};
    }
}
