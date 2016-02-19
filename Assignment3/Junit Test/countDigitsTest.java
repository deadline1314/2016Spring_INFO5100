package Assignment3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class countDigitsTest {

	@Test
	public void test() {
		Assignment3 cdt = new Assignment3();
		int i = cdt.countDigits(100);
		Assert.assertTrue(i == 1);
		i = cdt.countDigits(-91);
		Assert.assertTrue(i == -1);
	}

}
