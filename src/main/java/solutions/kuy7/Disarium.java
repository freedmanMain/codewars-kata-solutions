package solutions.kuy7;

public class Disarium {
    public static String disariumNumber(int number) {
        int sum = 0;
        int oldValue = number;
        for (int i = String.valueOf(number).length(); i > 0; i--) {
            sum += Math.pow(oldValue % 10, i);
            oldValue /= 10;
        }
        return sum == number ? "Disarium !!" : "Not !!";
    }
}
