package Assignment2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class findPowerOfThreeTest {

	@Test
	public void test() {
		Assignment2 fpott = new Assignment2();
		int[] result = {1,3,9,27};
//		Assert.assertTrue(result[0] == 1);
//		Assert.assertTrue(result[1] == 3);
//		Assert.assertTrue(result[2] == 9);
//		Assert.assertTrue(result[3] == 27);
		Assert.assertArrayEquals(result, fpott.findPowerOfThree(4));
	}

}
