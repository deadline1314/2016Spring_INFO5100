package Assignment2;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class findMinMaxTest {

	@Test
	public void test() {
		Assignment2 fm = new Assignment2();
		int[] num = {1, 2, 3, 5, -1}; 
		int[] maxmin = {5,-1};
		Assert.assertArrayEquals(maxmin, fm.findMinMax(num));
	}

}
