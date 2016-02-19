package Assignment4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class reverseString1Test {

	@Test
	public void test() {
		Assignment4 run = new Assignment4();
		String str = "I like soccer";
		String str1 = "";
		String str2 = null;
		Assert.assertTrue(run.reverseString1(str).equals("reccos ekil I"));
		Assert.assertTrue(run.reverseString1(str1).equals(""));
		Assert.assertTrue(run.reverseString1(str2) == null);
	}

}
