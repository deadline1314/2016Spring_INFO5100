package Midterm;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class containsDuplicateTest {

	@Test
	public void test() {
		int[] nums = {1,2,3,4,5};
		int[] nums2 ={1,2,2,4,1};
		Midterm mt = new Midterm();
		Assert.assertFalse(mt.containsDuplicate(nums));
		Assert.assertTrue(mt.containsDuplicate(nums2));
	}

}
