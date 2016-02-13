package Assignment4;

public class countWords {

	public static void main(String[] args) {

		Assignment4 run = new Assignment4();
		String str = "I like playing basketball";
		String str1 = "   ";
		String str2 = null;
		int i = run.countWords(str);
		int m = run.countWords(str1);
		int n = run.countWords(str2);
		System.out.println(i);
		System.out.println(m);
		System.out.println(n);
	}

}
