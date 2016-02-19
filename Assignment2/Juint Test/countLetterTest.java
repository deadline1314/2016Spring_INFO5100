package Assignment2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class countLetterTest {

	@Test
	public void test() {
		Assignment2 cl = new Assignment2();
		int num = cl.countLetter("wansadasdg", 's');
		Assert.assertTrue(num == 2);
		num = cl.countLetter("wansadasdg", 'a');
		Assert.assertTrue(num == 3);
	}

}
