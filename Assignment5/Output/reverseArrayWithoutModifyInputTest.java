package Assignment5;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class reverseArrayWithoutModifyInputTest {

	@Test
	public void test() {
		Assignment5 jtest = new Assignment5();
		int[] nums = { 1, 2, 3, 4 };
		int[] result = { 4, 3, 2, 1 };
		Assert.assertArrayEquals(result, jtest.reverseArrayWithoutModifyInput(nums));
	}

}
