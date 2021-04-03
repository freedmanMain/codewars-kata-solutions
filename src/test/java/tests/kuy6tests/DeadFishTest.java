package tests.kuy6tests;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Test;
import solutions.kuy6.DeadFish;

public class DeadFishTest {

    @Test
    public void parser_test() throws Exception {
        assertArrayEquals(
                new int[] {8, 64}, DeadFish.parse("iiisdoso")
        );
        assertArrayEquals(
                new int[] {8, 64, 3600}, DeadFish.parse("iiisdosodddddiso")
        );
    }
}