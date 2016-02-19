package Assignment2;

import static org.junit.Assert.*;
import org.junit.Assert;

import org.junit.Test;


public class addDigitsTest {

	@Test
	public void test() {
		Assignment2 ad = new Assignment2();
		int n = ad.addDigits(100);
		Assert.assertTrue(n == 1);
		n = ad.addDigits(999);
		Assert.assertTrue(n == 9);
	}

}
