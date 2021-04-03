package solutions.kuy7;

import org.junit.Test;
import static org.junit.Assert.assertEquals;
import org.junit.runners.JUnit4;

// TODO: Replace examples and use TDD development by writing your own tests

public class SortByBinaryOnesTest {
    @Test
    public void testSort() {
        SortByBinaryOnes sortByBinary = new SortByBinaryOnes();
        assertEquals(sortByBinary.sort(new Integer[]{1, 3}), new Integer[]{3, 1});
        assertEquals(sortByBinary.sort(new Integer[]{1, 2, 3, 4}), new Integer[]{3, 1, 2, 4});
    }
}