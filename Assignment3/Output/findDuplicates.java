package Assignment3;

public class findDuplicates {

	public static void main(String[] args) {

		Assignment3 run = new Assignment3();
		int[] input = new int[5];
		input[0] = 1;
		input[1] = 1;
		input[2] = 3;
		input[3] = 4;
		input[4] = 5;
		boolean result = true;
		result = run.findDuplicates(input);
		System.out.println(result);
	}

}
