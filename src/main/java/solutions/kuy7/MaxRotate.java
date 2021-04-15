package solutions.kuy7;

public class MaxRotate {
    public static long maxRot(long n) {
        String longNum = String.valueOf(n);
        long maxValue = Long.parseLong(longNum);
        for (int i = 0; i < longNum.length() - 1; i++) {
            longNum = longNum.substring(0, i) + longNum.substring(i + 1) + longNum.charAt(i);
            maxValue = Math.max(maxValue, Long.parseLong(longNum));
        }
        return maxValue;
    }
}
