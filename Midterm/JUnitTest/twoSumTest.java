package Midterm;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class twoSumTest {

	@Test
	public void test() {
		int[] num1 = {1,-1,2,-2,3};
		int[] num2 = {1,2,3,4,5};
		Midterm mt = new Midterm();
		Assert.assertTrue(mt.twoSum(num1, 0) == 2);
		Assert.assertTrue(mt.twoSum(num2, 5) == 2);
		Assert.assertTrue(mt.twoSum(num1, -1) == 1);
	}

}
