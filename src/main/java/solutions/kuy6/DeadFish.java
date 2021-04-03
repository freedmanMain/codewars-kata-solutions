package solutions.kuy6;

import java.util.LinkedList;

public class DeadFish {

    /* i increments the value (initially 0)

     * d decrements the value

     * s squares the value

     * o outputs the value into the return array */

    public static int[] parse(String data) throws Exception {
        int currentValue = 0;
        LinkedList<Integer> _list = new LinkedList<>();
        for (char ch : data.toCharArray()) {
            if (ch == 'o') {
                _list.add(currentValue);
            } else {
                currentValue = defCommand(ch, currentValue);
            }
        }
        return _list.stream().mapToInt(Integer :: intValue).toArray();
    }

    private static int defCommand (char ch, int current) throws Exception {
        switch (ch) {
            case 'i' : return increments(current);
            case 'd' : return decrements(current);
            case 's' : return squares(current);
        }
        throw new Exception("Incorrect command!");
    }

    private static int increments (int value) {
        return ++value;
    }

    private static int decrements (int value) {
        return --value;
    }

    private static int squares (int value) {
        return value * value;
    }

}