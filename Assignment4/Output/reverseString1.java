package Assignment4;

public class reverseString1 {

	public static void main(String[] args) {

		Assignment4 run = new Assignment4();
		String str = "I like soccer";
		String str1 = "";
		String str2 = null;
		String result = run.reverseString1(str);
		String result1 = run.reverseString1(str1);
		String result2 = run.reverseString1(str2);
		System.out.println(result1);
		System.out.println(result2);
		System.out.println(result);
	}

}
