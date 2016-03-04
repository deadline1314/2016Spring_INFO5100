package Midterm;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class titileToNumberTest {

	@Test
	public void test() {
		String a = "BA";
		String b = "A";
		String c = "Z";
		Midterm mt = new Midterm();
		Assert.assertTrue(mt.titleToNumber(a) == 53);
		Assert.assertTrue(mt.titleToNumber(b) == 1);
		Assert.assertTrue(mt.titleToNumber(c) == 26);
	}

}
