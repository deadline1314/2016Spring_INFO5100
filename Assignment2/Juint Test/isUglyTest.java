package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;

public class isUglyTest {

	@Test
	public void test() {
		Assignment2 iut = new Assignment2();
		Assert.assertTrue(iut.isUgly(8));
		Assert.assertFalse(iut.isUgly(14));
	}

}
