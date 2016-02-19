package Assignment4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class lengthOfLastWordTest {

	@Test
	public void test() {
		Assignment4 run = new Assignment4();
		String str = "    ";
		String str1 = "There is an apple tree";
		String str2 = "";
		int i= run.lengthOfLastWord(str);
		int m= run.lengthOfLastWord(str1);
		int n= run.lengthOfLastWord(str2);
		Assert.assertTrue(i == 0);
		Assert.assertTrue(m == 4);
		Assert.assertTrue(n == 0);
	}

}
