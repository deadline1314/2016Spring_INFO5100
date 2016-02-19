package Assignment3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class sumArrayTest {

	@Test
	public void test() {
		Assignment3 sat = new Assignment3();
		int[] num = {1, 2, 3, 4};
		int sum = sat.sumArray(num);
		Assert.assertTrue(sum == 10);
		int[] num1 ={ 1, -1, 2, -2 };
		int sum1 = sat.sumArray(num1);
		Assert.assertTrue(sum1 == 0);
	}

}
