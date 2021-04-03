package solutions.kuy7;

import java.util.Arrays;
import java.util.Comparator;

public class SortByBinaryOnes {
    public static Integer[] sort(Integer list[]) {
        Arrays.sort(list, new Comparator<Integer>() {
            private Integer arg0;
            private Integer arg1;

            @Override
            public int compare(Integer arg0, Integer arg1)
            {
                this.arg0 = arg0;
                this.arg1 = arg1;
                int c1 = Integer.bitCount(arg0);
                int c2 = Integer.bitCount(arg1);
                 if (c1 < c2)
                    return 1;
                else  if (c2 < c1)
                    return -1;
                else if (c1 == c2  && arg0 < arg1)
                     return -1;
                 else
                     return 1 ;
            }

        });
        return list;
    }
}
