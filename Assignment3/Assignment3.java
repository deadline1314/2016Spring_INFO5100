package Assignment3;

/**
 * Finish assignments, try bonus.
 * Deadline: Before the next class.
 * @author Yang
 */
 class Person{
	int age;
	boolean gender;//false --> male, true --> female
	Person(int age, boolean gender){
		this.age = age;
		this.gender = gender;
	}
}
public class Assignment3 {
	//assignments
	/**1.
	 * Return the sum of a given array. You may assume the sum will not overflow.
	 */
	public int sumArray(int[] nums){
		int sum=0;
		for(int i=0; i< nums.length; i++) {
			sum +=nums[i];
		}
		return sum;
	}
	
	/**2.
	 * Write a Computer program to find the type of a person and print the type.
	 * Infant : If the age is less than 1 year
	 * Toddler : If the age is less than 3 and greater than 1
	 * Pre Schooler : If the age is less than 5 and greater than 3
	 * KG Girl : If the age is greater than 5 and less than 6 and the gender is female
	 * KG Boy : If the age is greater than 5 and less than 6 and the gender is male
	 */
	public void personType(Person person){
		if(person.age<=1)
			System.out.println("This is a infant.");
		if(person.age<=3 && person.age>1)
			System.out.println("This is a toddler.");
		if(person.age<=5 && person.age>3)
			System.out.println("This is a pre school.");
		if(person.age<=6 && person.age>5 && person.gender == true)
			System.out.println("This is a KG girl.");
		if(person.age<=6 && person.age>5 && person.gender == false)
			System.out.println("This is a KG boy.");
	}
	
	/**3.
	 * Given a sorted array, find whether there are duplicates in it.
	 */
	public boolean findDuplicates(int[] nums){
		int result= 0;
		for(int i=1; i<nums.length; i++) {
			result= nums[i]- nums[i-1];
		if(result == 0)
			return true;
		}
		return false;
	}
	
	/**4.
	 * Given an array and a index, delete the number at that index in the array.
	 * You should return a new array which doesn't contain that number.
	 * For example, input {1,2,3,4,5}, index = 1, you should return {1,3,4,5}.
	 */
	public int[] deteleElement(int[] nums,int index){
		if(index ==0 && nums.length !=0){
			for(int i=1; i< nums.length; i++) {
				System.out.println(nums[i]);
			}
		}
		if(index ==0 && nums.length ==1){
				System.out.println("The array is empty.");
			}
		if (index>0 && index<nums.length-1) {
			for(int i=0; i<index; i++) {
				System.out.println(nums[i]);
			}
			for(int i=index+1; i<nums.length; i++) {
				System.out.println(nums[i]);
			}
		}
		if (index == nums.length-1) {
			for(int i=0; i<nums.length-1; i++) {
				System.out.println(nums[i]);
			}
		}
		if(index >=nums.length) {
			for(int i=0; i<nums.length;i++) {
				System.out.println(nums[i]);
			}
		}
		return nums;	
	}
	
	/**5.
	 * Given a integer 'n', return n%count, count is the number of digits of n
	 * For example, n = 100, return 1
	 */
	public int countDigits(int n){
		String num = Integer.toString(n);
		int digits = num.length();
		int result= n%digits;
		return result;
	}
	
	/**6.
	 * Given a integer 'n', if n is odd, print n odd numbers, if n is even, print n even numbers.
	 * For example, n = 3, print 1 3 5      n = 4, print 0 2 4 6
	 */
	public void printNumbers(int n){
		int[] result = new int[n];
		if(n%2 ==0){
			for(int i=0; i<n; i++){
				result[i] =2*i;
			}
		}
		if(n%2 !=0) {
			for(int i=0; i<n; i++){
				result[i] =2*i+1;
			}		
		}
		for(int i=0; i<n; i++)
		System.out.print(result[i]+"  ");
	}
	
	
	//bonus
	/**7.
	 * A robot from Mars send a long message to Earth which only contains many "SOS", like "SOSSOS", "SOSSOSSOSSOSSOS"
	 * But the radiation from universe changed some characters of the massage.
	 * Write a method to count how many characters were changed.
	 * For example, "SOSSOSSOS" might be changed to "SOSSUSSOP", then your method should return 2.
	 * The message was consisted by "SOS" so its length will be multiple of 3.
	 * You could assume the message only contains upper letter.
	 */
	public int checkMessage(String message){
		int counter = 0;
		for(int i=0; i< (message.length()/3); i++) {
			if(message.charAt(3*i) != 'S')
				counter +=1;
			if(message.charAt(3*i+1) != 'O')
				counter +=1;
			if(message.charAt(3*i+2) != 'S')
				counter +=1;
		}
		return counter;
	}
}