package solutions.kuy7;

public class MaxProduct {
    public int adjacentElementsProduct(int[] array) {
        int globalMax = Integer.MIN_VALUE;
        for (int i = 0; i < array.length - 1; i++) {
            int localMax = array[i] * array[i + 1];
            globalMax = Math.max(globalMax, localMax);
        }
        return globalMax;
    }
}
