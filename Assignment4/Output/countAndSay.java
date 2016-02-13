package Assignment4;

public class countAndSay {

	public static void main(String[] args) {

		String str = "aabbcaf";
		String str1 ="ffbbarzt";
		Assignment4 run = new Assignment4();
		String result = run.countAndSay(str);
		String result1 =run.countAndSay(str1);
		System.out.println(result);
		System.out.println(result1);
	}
}
