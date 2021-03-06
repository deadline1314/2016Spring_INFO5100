package Homework;

/**
 * Assignment for your lecture 2.
 * Please finish all the questions under 'Assignment'.
 * Please try the two questions under 'Bonus'.
 * Please write some tests as practice.
 * When you are writing tests, you should think about what situations might cause error? like 0,-1...
 * The deadline of this assignment is 01/27/2016 23:59.
 * Please feel free to contact me for any questions.
 * @author Yang
 */

public class Assignment2 {
 
	//Assignment
	/**1.
	 * Given an integer N as input, check the following:
	 * If N is odd, print "Weird".
	 * If N is even and, in between the range of 2 and 5(inclusive), print "Not Weird".
	 * If N is even and, in between the range of 6 and 20(inclusive), print "Weird".
	 * If N is even and N>20, print "Not Weird".
	 */
	public void weirdNumber(int n){
		if (n%2 != 0) {
			System.out.println("Weird");
		}
		if (n%2 == 0 && n>=2 && n<=5) {
			System.out.println("Not Weird");
		}
		if (n%2 == 0 && n>=6 && n<=20) {
			System.out.println("Weird");
		}
		if (n%2 == 0 && n>20) {
			System.out.println("Not Weird");
		}
	}
	
	/**2.
	 * Input an array of scores and return the right grades based on following rules
	 * 90<=score    -->4
	 * 80<=score<90 -->3
	 * 70<=score<80 -->2
	 * 60<=score<70 -->1
	 * score<60     -->0
	 */
	public int[] checkGrade(int[] scores){
		 int[] result = new int[scores.length];
		  for(int i=0; i<scores.length; i++) {
			  if (scores[i] >=90) {
			      result[i]=4;}
			  if (scores[i] >=80 && scores[i] <90) {
				  result[i]=3;}
			  if (scores[i] >=70 && scores[i] <80) {
				  result[i]=2;}
			  if (scores[i] >=60 && scores[i] <70) {
				  result[i]=1;}
			  if (scores[i] <60) {
				  result[i]=0;}
			  }
		  return result;
		}
	
	/**3.
	 * Write a method to determine whether a number is prime 
	 */
	 //Input 1, Optput: true. Input 7, Output: false. Solve the bug
	public boolean isPrimeNumber(int n){       //way 1
		if(n<2) return false;
		for (int i=2; i< n; i++) {    //bugfix: delete the "=" to make sure the divisors will only be 2 and itself
			if(n%i ==0)
				return false;
		}
		return true;
	}
	/*public boolean isPrimeNumber (int n){    //way 2
		boolean b = true;
		for (int i=2; i< n; i++) {
			if(n%i ==0){
				b = false;
			}else{
				b=true;
			}
		}
		return b;
	}*/
	
	/**4.
	 * Write a method to find N numbers which are power of three.
         * e.g. n=4, return {1,3,9,27}
	 */
	public int[] findPowerOfThree(int n){
        int[] question4 = new int[n]; 
		for(int i=0; i<n; i++) {
			question4[i]= (int) Math.pow(3, i); 
		}
		return question4;
	}
	
	/**5.
	 * Count occurrences of a given letter in a given string.
	 */
	public int countLetter(String str,char c){
		int counter = 0;
		for (int i=0; i< str.length(); i++) {
			if (str.charAt(i) == c) {
				counter++;
			}
		}
			return counter;
	}
	
	/**6.
	 * Find maximum and minimum in a given array, and return the max and min number
	 */
	 //input 1,2,8,4 output: 4,0  input -2,-7,-1 output: 0,-1. Solve the bug
	public int[] findMinMax(int[] nums){ 
		int[] maxmin = new int[2];
		/*int max = */maxmin[0] = nums[0];  //bugfix: give max and min initial value.
		/*int min = */maxmin[1] = nums[0];  
		 //if use int max=maxmin[0] = nums[0], the max will not be used in the loop but will be a fixed number.
		for(int i=0; i< nums.length; i++) {
			/*if(max < nums[i]) {*/
			if(maxmin[0] < nums[i]){
				maxmin[0] = nums[i];
	}
			/*if(min > nums[i]) {*/
			if(maxmin[1] > nums[i]){
				maxmin[1] = nums[i];
			}
		}
		return maxmin;
	}
	
	/**7.
	 * Find N fibonacci numbers
	 * Fibonacci Number: f(N) = f(N-1)+f(N-2).
	 * Typically, f(0)=f(1)=1. 
	 */
	public int[] fibonacciNumber(int n){
		int[] fibo = new int[n+1]; 
		{
		fibo[0] = 1;
		fibo[1] = 1;
		for (int i=2; i<=n; i++)//i<n --> i<=n  //both are correct......Still trying to figure it out. 
		            //因为我在方法中写了i<=n，所以会覆盖声明中的方法，所以就会出现这种情况，但是应该一致，i<=n比较安全
		fibo[i]= fibo[i-1]+fibo[i-2];
		}
		return fibo;
	}
	
	
	
	//Bonus
	/**8.
	 * Given a non-negative integer n, repeatedly add all its digits until the result has only one digit.
	 * For example:
	 * Given n = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
	 */
	 //input 199 output 10. solve the bug
	/*public int addDigits(int n){
		if(n<10) {
			return n;
		}
		int result = n;
		int sumNumber = 0;
		while (result>=10) {
			sumNumber= sumNumber + result % 10;
			result= result / 10;
			if(result<10){
			sumNumber= sumNumber + result; //can not make sure the sumNumber here. eg: sumNumber=29,38,39... here.
			}else{
				continue;
			}
			sumNumber= sumNumber%10+ sumNumber/10;
		}
		if(sumNumber == 10) //bugfix: add one situation.
		sumNumber = 1;
		return sumNumber;	          
	}*/
	public int addDigits(int n){ //nest loop.
		while(n>9){
			int temp = 0;
			while(n!=0){ //make calculate to get and sum every digit.
				temp += n%10;
				n /= 10;
			}
			n = temp; // if the sum still>9, contine the first level loop
		}
		return n;
	}
 /* public int addDigits(int n) {       //way 2
	    if (n <=0) {
	           return 0;
	    }
	    return (n - 1) % 9 + 1;
	} */
	/**9.
	 * Write a program to check whether a given number is an ugly number.
	 * Ugly numbers are positive numbers whose prime factors only include 2, 3, 5.
	 * For example, 6, 8 are ugly, while 14 is not ugly since it includes another prime factor 7.
	 * Note that 1 is typically treated as an ugly number.
	 */
	public boolean isUgly(int n){     //way 1
		if (n <=0)
			return false;
		while(n % 2 == 0)
			n= n/2;
		while(n % 3 == 0)
			n= n/3;
		while(n % 5 == 0)
			n= n/5;
		return n == 1;
	}
	/*public boolean isUgly(int n){    //错误的原因，while在外，if在里面，当结果为false时永远无法跳出循环,需要加continue
					//way 2
	while (n >= 2) {
		if(n%2 ==0) {
			n=n/2;
			continue;
		}
		if(n%3 ==0) {
			n=n/3;
			continue;
		}
		if(n%5 ==0) {
			n=n/5;
			continue;
		}
		return false;
		}
		return true;
	}				
}*/
}
