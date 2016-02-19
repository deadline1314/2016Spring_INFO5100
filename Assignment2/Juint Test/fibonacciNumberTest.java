package Assignment2;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.Assert;

public class fibonacciNumberTest {

	@Test
	public void test() {
		Assignment2 fn = new Assignment2();
		int[] result = {1,1,2,3,5};
		Assert.assertArrayEquals(result,fn.fibonacciNumber(4) );
	}

}
