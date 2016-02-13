package Assignment4;

public class lengthOfLastWord {

	public static void main(String[] args) {

		Assignment4 run = new Assignment4();
		String str = "    ";
		String str1 = "There is an apple tree";
		String str2 = "";
		int i= run.lengthOfLastWord(str);
		int m= run.lengthOfLastWord(str1);
		int n= run.lengthOfLastWord(str2);
		System.out.println(i);
		System.out.println(m);
		System.out.println(n);
	}

}
