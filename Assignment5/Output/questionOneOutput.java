package Assignment5;

public class questionOneOutput {

	public static void main(String[] args) {
		Assignment5 assign = new Assignment5();
		int[] date ={2010,1,15,7,40};
		Assignment5.File fi = assign.new File("kw's file", "wrt", date);
		System.out.println(fi.data);
		System.out.println(fi.name);
		Assignment5.Folder fo = assign.new Folder("folder1", date);
		System.out.println(fo.name);
		
	}

}
