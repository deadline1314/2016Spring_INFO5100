package Assignment4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class capitalizeLettersTest {

	@Test
	public void test() {
		String str = "I love playing basketball     ";
		Assignment4 run = new Assignment4();
		String result = run.capitalizeLetters(str);
		Assert.assertTrue(result.equals("I Love Playing Basketball") );
		
	}

}
