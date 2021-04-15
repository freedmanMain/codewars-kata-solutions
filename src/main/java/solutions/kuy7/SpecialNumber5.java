package solutions.kuy7;

public class SpecialNumber5 {
    public static String specialNumber(int number) {
        return String.valueOf(number).matches("[0-5]+") ? "Special!!" : "NOT!!";
    }
}
