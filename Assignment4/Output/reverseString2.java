package Assignment4;

public class reverseString2 {

	public static void main(String[] args) {
		
		String str = "I love playing soccer";
		String str1 = "I";
		String str2 = "";
		Assignment4 run = new Assignment4();
		String result = run.reverseString2(str);
		String result1 = run.reverseString2(str1);
		String result2 = run.reverseString2(str2);
		System.out.println(result);
		System.out.println(result1);
		System.out.println(result2);
	}

}
