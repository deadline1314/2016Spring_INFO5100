package Assignment6;

import java.util.ArrayList;

public class StudentAnswerQuestion {

	public static void main(String[] args) {
		Professor p = new Professor();
///		Student[] stu = new Student[5];
//		Student s1 = stu[0];
//		Student s2 = stu[1];
//		Student s3 = stu[2];
//		Student s4 = stu[3];
//		Student s5 = stu[4];
		Student s0 = new Student("0");
		Student s1 = new Student("1");
		Student s2 = new Student("2");
		Student s3 = new Student("3");
		Student s4 = new Student("4");
		
//		p.student = stu;
		
		p.arrayStudent.add(s1);
		p.arrayStudent.add(s2);
		p.arrayStudent.add(s3);
		p.arrayStudent.add(s4);
		p.arrayStudent.add(s0);
		
		s1.professor = p;
		s2.professor = p;
		s3.professor = p;
		s4.professor = p;
		s0.professor = p;

		Thread p1 = new Thread(p);
		Thread st1 = new Thread(s1);
		Thread st2 = new Thread(s2);
		Thread st3 = new Thread(s3);
		Thread st4 = new Thread(s4);
		Thread st5 = new Thread(s0);
		
		p1.start();
		st1.start();
		st2.start();
		st3.start();
		st4.start();
		st5.start();

	}
}

// student answer question
class Student implements Runnable {
	boolean canAnswer;
	Professor professor;
	String name;
	Student(String name){
		this.name = name;
	}

	@Override
	public void run() {

		try {
			answerQuestions();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public void answerQuestions() throws Exception {

		while (true) {
			if (canAnswer && professor.who.equals(name)) {
				System.out.println("Student " + Thread.currentThread().getName() + " is answering.");
				Thread.sleep(500);
				synchronized (professor) {
					professor.notify();
					canAnswer = false;
				}
			} else {
				synchronized (this) {
					this.wait();
					this.canAnswer = true;
				}
			}
		}

	}
}

// professor ask question
class Professor implements Runnable {
	boolean canAskQuestion = true;
	// Student[] student;
	ArrayList<Student> arrayStudent = new ArrayList<Student>();
	String who = "";

	@Override
	public void run() {
		try {
			askQuestion();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	private void askQuestion() throws Exception {
		while (true) {
			if (canAskQuestion) {
				System.out.println("Professor " + Thread.currentThread().getName() + " is asking.");
				Thread.sleep(500);
				canAskQuestion = false;
				who = String.valueOf((int) (Math.random() * 5));
				
				for (Student stu : arrayStudent)
					synchronized (stu) {
						stu.notify();
					}
			} else {
				synchronized (this) {
					this.wait();
					this.setCanAskQuestion(true);
				}
			}
		}
	}

	public boolean isCanAskQuestion() {
		return canAskQuestion;
	}

	public void setCanAskQuestion(boolean canAskQuestion) {
		this.canAskQuestion = canAskQuestion;
	}
}
