package Assignment6;

public class StudentAnswerQuestion {

	public static void main(String[] args) {
		Professor p = new Professor();
		Student[] stu = new Student[5];
		Student s1 = stu[0];
		Student s2 = stu[1];
		Student s3 = stu[2];
		Student s4 = stu[3];
		Student s5 = stu[4];

		p.student = stu;
		s1.professor = p;
		s2.professor = p;
		s3.professor = p;
		s4.professor = p;
		s5.professor = p;

		Thread p1 = new Thread(p);
		Thread st1 = new Thread(s1);
		Thread st2 = new Thread(s2);
		Thread st3 = new Thread(s3);
		Thread st4 = new Thread(s4);
		Thread st5 = new Thread(s5);
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
			if (canAnswer) {
				System.out.println("Student " + Thread.currentThread().getName() + " is answering.");
				canAnswer = false;
				Thread.sleep(500);
				synchronized (professor) {
					professor.notify();
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
	Student[] student;
	Object RESPOND_LOCK = new Object();

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
				synchronized (RESPOND_LOCK) {
					for (Student stu : student)
						stu.answerQuestions();
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
