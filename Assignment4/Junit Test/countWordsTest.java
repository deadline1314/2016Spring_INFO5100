package Assignment4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class countWordsTest {

	@Test
	public void test() {
		Assignment4 run = new Assignment4();
		String str = "I like playing basketball";
		String str1 = "   ";
		String str2 = "I am\nstudent";
		int i = run.countWords(str);
		int m = run.countWords(str1);
		int n = run.countWords(str2);
		Assert.assertTrue(i == 4);
		Assert.assertTrue(m == 0);
		Assert.assertTrue(n == 3);
	}

}
