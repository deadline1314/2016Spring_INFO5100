package Assignment3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class deteleElementTest {

	@Test
	public void test() {
		Assignment3 det = new Assignment3();
		int[] num = {0,1,2,3};
		int[] result = {0,1,3};
		Assert.assertArrayEquals(result, det.deteleElement(num, 2));
	}

}
