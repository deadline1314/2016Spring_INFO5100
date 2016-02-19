package Assignment4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class reverseString2Test {

	@Test
	public void test() {
		String str = "I love playing soccer";
		String str1 = "I";
		String str2 = "";
		Assignment4 run = new Assignment4();
		Assert.assertTrue(run.reverseString2(str).equals("soccer playing love I"));
		Assert.assertTrue(run.reverseString2(str1).equals("I"));
		Assert.assertTrue(run.reverseString2(str2).equals(""));
	}
}
