package solutions.test;

import static org.junit.Assert.*;

import org.junit.Test;
import solutions.AreSame;

public class AreSameTest {

	@Test
	public void compare_array_test() {
		int[] a = new int[]{121, 144, 19, 161, 19, 144, 19, 11};
		int[] b = new int[]{121, 14641, 20736, 361, 25921, 361, 20736, 361};
		assertTrue(AreSame.comp(a,b));
	}
}
