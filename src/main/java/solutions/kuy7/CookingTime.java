package solutions.kuy7;

public class CookingTime {
    public static String getTime(String neededPower, int minutes, int seconds, String power) {
        int nPower = Integer.valueOf(neededPower.replace("W", ""));
        int curPower = Integer.valueOf(power.replace("W", ""));
        int time = (int) Math.ceil((minutes * 60. + seconds) * nPower / curPower);
        return String.format("%d minutes %d seconds", time / 60, time % 60);
    }
}
