package Assignment3;

public class sumArray {

	public static void main(String[] args) {

		Assignment3 run = new Assignment3();
		int[] array = new int[4];
		array[0] = 1;
		array[1] = 2;
		array[2] = 3;
		array[3] = 4;
		int sum = run.sumArray(array);
		System.out.println(sum);
	}

}
