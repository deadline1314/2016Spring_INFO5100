package Assignment5;

import java.util.ArrayList;

/**
 * Finish all the assignments before next class.
 * @author Yang
 */
public class Assignment5 {
	/**1.
	 * In computer, the file system is very important. Try to create classes for file and folder.
	 * Hint: You might find there are many similarities between file and folder:
	 * they both have name, size and created date;
	 * they both could be open by double click;
	 * ...
	 * So use the concept of abstract class to make your code more neat.
	 */
		
	abstract class FileSystem {
		String name;
		float size;
		int[] createdDate = new int[5]; // (2007,1,15,7,40)

		abstract FileSystem doubleClick();

	}

	class File extends FileSystem {
		String data;

		File(String name, String data, int[] createdDate) { // create a file
			this.name = name;
			this.data = data;
			this.createdDate = createdDate;
		}

		@Override
		File doubleClick() {
			return this;
		}
	}

	class Folder extends FileSystem {
		
		Folder(String name,  int[] createdDate) { // create a file
			this.name = name;
			this.createdDate = createdDate;
		}
		ArrayList<Folder> subFolderList;
		ArrayList<File> fileList;

		@Override
		FileSystem doubleClick() {
			return this;
		}

		Folder(File file) { // create file
			fileList.add(file);
		}

		Folder(Folder folder) { // create folder
			subFolderList.add(folder);
		}

		Folder(Folder folder, File file) { // create folder&file
			subFolderList.add(folder);
			fileList.add(file);
		}

	}
	
	
	/**2.
	 * Design abstract class Person, interface Driver, Teacher, Teenager, Adult.
	 * Then create classes TeenagerDriver, TeenagerTeacher, AdultDriver and AdultTeacher which
	 * extend Person and implement suitable interfaces.
	 */
	class Person { 
		String name;
		int age;
		float weight;
	}

	interface Driver {
		void drive();
	}

	interface Teacher {
		void teach();

		String answerQuestion(String question);
	}

	interface Teenager {
		void eatingOut();
	}

	interface Adult {
		void eatingAtHome();
	}

	class TeenagerDriver extends Person implements Driver, Teenager {

		@Override
		public void eatingOut() {
			System.out.println("I'm a teenager, I like eating out.");
		}

		@Override
		public void drive() {
			System.out.println("I drive my car when going out.");
		}
	}

	class TeenagerTeacher extends Person implements Teacher, Teenager {

		@Override
		public void eatingOut() {
			System.out.println("I'm a teenager, I like eating out.");		
		}

		@Override
		public void teach() {
			System.out.println("I'm a teacher, so I am teaching.");		
		}

		@Override
		public String answerQuestion(String question) {
			return "Answer for Question ->" + question;
		}	
	}

	class AdultDriver extends Person implements Driver, Adult {

		@Override
		public void eatingAtHome() {
			System.out.println("I'm an adult, I like eating at home.");		
		}

		@Override
		public void drive() {
			System.out.println("I drive my car when going out.");		
		}	
	}

	class AdultTeacher extends Person implements Teacher, Adult {

		@Override
		public void eatingAtHome() {
			System.out.println("I'm an adult, I like eating at home.");		
		}

		@Override
		public void teach() {
			System.out.println("I'm a teacher, so I am teaching.");			
		}

		@Override
		public String answerQuestion(String question) {
			return "Answer for Question ->" + question;
		}	
	}
	
	/**3.
	 * Reverse the input array in place(without extra space)
	 * e.g. input nums = {5,1,9,0}, after calling this method, the nums should be {0,9,1,5}
	 * @return 
	 */
	public void reverseArrayInPlace(int[] nums){
		int i =0;
		int j = nums.length-1;
		int temp;
		for(i = 0; i<j; i++){
			temp = nums[i];
			nums[i] = nums[j];
			nums[j] = temp;
			j--;
		}
		for(int m=0; m<nums.length; m++) //these two lines are for testing output
		System.out.print(nums[m]+" ");   
	}
	
	/**4.
	 * Reverse the input array without changing the input.
	 * Return the rotated array.
	 * e.g. input nums = {5,1,9,0}, after calling this method it'll return {0,9,1,5} while the nums is still {5,1,9,0}
	 */
	public int[] reverseArrayWithoutModifyInput(int[] nums){
		int[] result = new int[nums.length];
		for(int i =nums.length-1; i>=0; i--){
			result[nums.length-1-i]= nums[i];
		}
		return result;
	}
	
}