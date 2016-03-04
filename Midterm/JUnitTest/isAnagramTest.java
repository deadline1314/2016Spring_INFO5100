package Midterm;

import static org.junit.Assert.*;

import org.junit.Test;

import org.junit.Assert;

public class isAnagramTest {

	@Test
	public void test() {
		String s = "anagram";
		String t = "nagaram";
		String w = "nagaran";
		Midterm mt = new Midterm();
		Assert.assertTrue(mt.isAnagram(s, t));
		Assert.assertFalse(mt.isAnagram(s, w));
	}

}
