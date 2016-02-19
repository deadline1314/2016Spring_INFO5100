package Assignment2;

import static org.junit.Assert.*;
import org.junit.Assert;

import org.junit.Test;

public class checkGradeTest {

	@Test
	public void test() {
		Assignment2 cg = new Assignment2();
		int[] score = {90,67};
		int[] result = {4,1};
		Assert.assertArrayEquals(result, cg.checkGrade(score));
	}

}
