package solutions.kuy7;

public class AddingValuesInArray {
    @Override
    public int hashCode() {
        return super.hashCode();
    }

    public static int[] addingShifted(int[][] arrayOfArrays, int shift) {
        int[] arrayOfSums = new int[arrayOfArrays[0].length + shift * (arrayOfArrays.length - 1)];
        int start = 0;
        for (int i = 0; i < arrayOfArrays.length; i++) {
            for (int j = 0; j < arrayOfArrays[i].length; j++) {
                arrayOfSums[j + start] += arrayOfArrays[i][j];
            }
            start += shift;
        }
        return arrayOfSums;
    }
}
