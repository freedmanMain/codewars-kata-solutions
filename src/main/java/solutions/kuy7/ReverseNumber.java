package solutions.kuy7;

public class ReverseNumber {
    public static int reverse(int number) {
        int result = Integer.parseInt(new StringBuilder().append(number)
                .reverse().toString().replace("-", ""));
        return number < 0 ? -result : result;
    }
}
