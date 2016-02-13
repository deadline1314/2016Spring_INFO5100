package Homework;

public class findMinMax {

	public static void main(String[] args) {
		Assignment2 w = new Assignment2();
		int[] nums = new int[5];
		nums[0]= 1;
		nums[1]= -9;
		nums[2]= 99;
		nums[3]= 53;
		nums[4]= 98;
		int[] minmax = w.findMinMax(nums);
		System.out.println("The maximum number is :" +minmax[0]+ "\n" +"The minimum number is:" +minmax[1]);
	}

}
