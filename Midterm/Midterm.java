package Midterm;

import java.util.Arrays;
import java.util.HashSet;

public class Midterm {
	/*
	 * 1.Given an unsorted array nums, write a function to move all the 0's to
	 * the end of it while maintaining the relative order of the non-zero
	 * elements. ->Without making a copy of the array
	 */
	public void moveZeroes(int[] nums){
		int pointer = 0;
		int temp;
		for(int i=0; i < nums.length - 1; i++){//why "nums.length - 1" ?           -2
			if(nums[i] != 0){
			 temp = nums[i];
			 nums[i] = nums[pointer];
			 nums[pointer] = temp;
			 pointer++;
			}
		}
		for(int j=0; j<nums.length; j++) //for testing output
		System.out.print(nums[j]+" ");
	}

	/*
	 * 2.Given two strings s and t, write a function to determine if t is an
	 * anagram of s.
	 */
	public boolean isAnagram(String s, String t) {// sort is too expensive.      -2
		if (s.length() != t.length())
			return false;
		char[] ss = s.toCharArray();
		char[] tt = t.toCharArray();
		Arrays.sort(ss);
		Arrays.sort(tt);
		for (int i = 0; i < ss.length; i++) {
			if (ss[i] != tt[i])
				return false;
		}
		return true;
	}

	/*
	 * 3.Given an unsorted array of integers, find if the array contains any
	 * duplicates. Your function should return true if any value appears at
	 * least twice in the array, and it should return false if every element is
	 * distinct. ->O(N) time.
	 */
	public boolean containsDuplicate(int[] nums) {//+5
		HashSet<Integer> hashset = new HashSet<Integer>();
		for(int i=0; i<nums.length; i++){
			if(hashset.contains(nums[i]))
				return true;
			hashset.add(nums[i]);
		}
		return false;
	}

	/*
	 * 4.Given a column title as appear in an Excel sheet, return its
	 * corresponding column number. For example: A -> 1, B -> 2,...Z -> 26, AA
	 * -> 27, AB -> 28
	 */
	public int titleToNumber(String title) {
		int sum = 0;
		char[] digit = title.toCharArray();
		for(int i=0 ; i<digit.length; i++){
			sum += (digit[digit.length-1-i]-64) * Math.pow(26,i);
		}
		return sum;
	}

	/*
	 * Bonus: Given an unsorted array of integers(no duplicates), count the
	 * pairs in which there are two numbers and they add up to a specific target
	 * number. For example: Input: nums={2,7,11,15}, target=9, return 1. ->O(N)
	 * time
	 */
	public int twoSum(int[] nums, int target) {//+15
		int counter =0;
		HashSet<Integer> hashset = new HashSet<Integer>();
		for(int i=0; i< nums.length; i++){
			if(hashset.contains(target-nums[i]))
				counter++;
			hashset.add(nums[i]);
		}
		return counter;
	}
}
