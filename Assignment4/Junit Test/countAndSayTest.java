package Assignment4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class countAndSayTest {

	@Test
	public void test() {
		String str = "aabbcaf";
		String str1 ="ffbbarzt";
		Assignment4 run = new Assignment4();
		String result = run.countAndSay(str);
		String result1 =run.countAndSay(str1);
		Assert.assertTrue(result.equals("3a2b1c1f"));
		Assert.assertTrue(result1.equals("2f2b1a1r1z1t"));
	}

}
