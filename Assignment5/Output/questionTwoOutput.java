package Assignment5;

public class questionTwoOutput {

	public static void main(String[] args) {
		Assignment5 assign = new Assignment5();
		Assignment5.AdultTeacher at = assign.new AdultTeacher();
		at.eatingAtHome();
		at.teach();
		System.out.println(at.answerQuestion("I can use inner class to give output!"));
		System.out.println("---------------------");
		
		Assignment5.TeenagerDriver td = assign.new TeenagerDriver();
		td.eatingOut();
		td.drive();
	}

}
