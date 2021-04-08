package solutions.kuy7;

public class Numbers {
    public static double twoDecimalPlaces(double number) {
        int moduleLength = String.valueOf((int) number).length();
        return Double.parseDouble(String.valueOf(number).substring(0, 2 + moduleLength + 1));
    }
}
