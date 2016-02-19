package Assignment4;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class compareVersionTest {

	@Test
	public void test() {
		String v1 = "1.2";
		String v2 = "1.2.0";
		Assignment4 run = new Assignment4();
		int result = run.compareVersion(v1, v2);
		Assert.assertTrue(result == 0);
	}

}
