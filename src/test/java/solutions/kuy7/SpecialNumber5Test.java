package solutions.kuy7;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialNumber5Test {
    @Test
    public void Check_Single_Digit_Number() {
        assertEquals("Special!!", SpecialNumber5.specialNumber(2));
        assertEquals("Special!!", SpecialNumber5.specialNumber(3));
        assertEquals("NOT!!", SpecialNumber5.specialNumber(9));
        assertEquals("NOT!!", SpecialNumber5.specialNumber(7));
    }

    @Test
    public void Two_Digit_Number() {
        assertEquals("Special!!", SpecialNumber5.specialNumber(23));
        assertEquals("NOT!!", SpecialNumber5.specialNumber(79));
        assertEquals("Special!!", SpecialNumber5.specialNumber(32));
        assertEquals("NOT!!", SpecialNumber5.specialNumber(39));
        assertEquals("Special!!", SpecialNumber5.specialNumber(55));

    }

    @Test
    public void Larger_Sepcial_Number() {
        assertEquals("Special!!", SpecialNumber5.specialNumber(513));
        assertEquals("NOT!!", SpecialNumber5.specialNumber(709));
        assertEquals("NOT!!", SpecialNumber5.specialNumber(538));

    }

    @Test
    public void Mega_Sepcial_Number() {
        assertEquals("Special!!", SpecialNumber5.specialNumber(53532));
        assertEquals("NOT!!", SpecialNumber5.specialNumber(970569));
        assertEquals("Special!!", SpecialNumber5.specialNumber(11350224));

    }
}