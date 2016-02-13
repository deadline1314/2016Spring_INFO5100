package Homework;

public class checkGrade {

	public static void main(String[] args) {
		Assignment2 w = new Assignment2();
		 int[] scores= new int[2];
		 scores[0] = 90;
		 scores[1] = 80;
		 int[] result = w.checkGrade(scores);
		 System.out.println(result[0] +"  "+ result[1]);		 
	}

}
