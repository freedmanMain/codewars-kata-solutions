package solutions.kuy6;

import java.util.LinkedList;

public class EnoughIsEnough {
    public static int[] deleteNth(int[] elements, int maxOccurrences) {
    LinkedList<Integer> _list = new LinkedList<>();
    for (int i = 0; i < elements.length; i++) {
      int current = elements[i];
      int countOfCurrent = (int)_list.stream().filter(x -> x == current).count();
      if (countOfCurrent < maxOccurrences) {
        _list.add(current);
      }
    }
    return _list.stream().mapToInt(Integer :: intValue).toArray();
  }
}
