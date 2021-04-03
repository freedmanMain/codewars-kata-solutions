package solutions.kuy7;

import java.util.List;

public class BinaryArrayToNumber {
    public static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(binary.toString()
                .replaceAll("[\\W]", ""), 2);
    }
}
