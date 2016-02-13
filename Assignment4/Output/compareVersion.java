package Assignment4;

public class compareVersion {

	public static void main(String[] args) {

		String v1 = "1.2";
		String v2 = "1.2.0";
		Assignment4 run = new Assignment4();
		int result = run.compareVersion(v1, v2);
		System.out.println(result);
	}

}
