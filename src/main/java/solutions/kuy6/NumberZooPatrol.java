package solutions.kuy6;

import java.util.Arrays;
import java.util.stream.IntStream;

public class NumberZooPatrol {
    public static int findMissingNumber(int[] numbers) {
        if (isEdge(numbers)) {
            return getEdge(numbers);
        }
        int validSequenceSum = getValidSequence(numbers);
        int currentSequenceSum = Arrays.stream(numbers).sum();
        return validSequenceSum == currentSequenceSum
                ? Arrays.stream(numbers).max().getAsInt() + 1 : validSequenceSum - currentSequenceSum;
    }

    private static boolean isEdge (int[] array) {
        if (array.length == 0 || array.length == 1) {
            return true;
        }
        return false;
    }

    private static int getEdge (int[] array) {
        if (array.length == 0) {
            return 1;
        } else {
            return array[0] <= 1 ? ++array[0] : --array[0];
        }
    }

    private static int getValidSequence (int[] array) {
        return IntStream.rangeClosed(
                    Arrays.stream(array).min().getAsInt() - 1,
                        Arrays.stream(array).max().getAsInt()).sum();
    }
}
