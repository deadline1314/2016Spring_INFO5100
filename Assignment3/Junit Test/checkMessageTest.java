package Assignment3;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class checkMessageTest {

	@Test
	public void test() {
		Assignment3 cm = new Assignment3();
		int i = cm.checkMessage("SOSSOSSOS");
		Assert.assertTrue(i == 0);
		i = cm.checkMessage("SOSOOSOOS");
		Assert.assertTrue(i == 2);

	}

}
