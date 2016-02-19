package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;

public class isPrimeNumberTest {

	@Test
	public void test() {
		Assignment2 ipnt = new Assignment2();
		Assert.assertTrue(ipnt.isPrimeNumber(7));
		Assert.assertFalse(ipnt.isPrimeNumber(12));
	}

}
