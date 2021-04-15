package solutions.kuy7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DisariumTest {
    @Test
    public void Disarium_Or_NOT() {
        assertEquals("Disarium !!", Disarium.disariumNumber(89));
        assertEquals("Not !!", Disarium.disariumNumber(564));
        assertEquals("Not !!", Disarium.disariumNumber(1024));
    }

    @Test
    public void Larger_Numbers() {
        assertEquals("Not !!", Disarium.disariumNumber(64599));
        assertEquals("Not !!", Disarium.disariumNumber(136586));
        assertEquals("Not !!", Disarium.disariumNumber(1048576));
    }
}