package Assignment3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class findDuplicatesTest {

	@Test
	public void test() {
		Assignment3 fdt = new Assignment3();
		int[] num = { 1, 2, 3, 4 };
		Assert.assertFalse(fdt.findDuplicates(num));
		int[] num1 = { 1, 1, 2, 2, 3 };
		Assert.assertTrue(fdt.findDuplicates(num1));
	}

}
