package Homework;

import java.util.Scanner;

public class fibonacciNumber {

	public static void main(String[] args) {
		Assignment2 w = new Assignment2();
		System.out.println("Please type in one integer:");
		Scanner fiboNum = new Scanner(System.in);
		int n = fiboNum.nextInt();
		int[] result = w.fibonacciNumber(n); //n从声明中传过来的数字就是n+1，所以不用再写n+1，应为n
		if(n>=2){
    	for(int i=0; i<=n;i++)
		System.out.println("f("+i+") is:"+result[i]);
    	}
    	if(n == 0) {
    		result[0] = 1;
    		System.out.println("f(0) is:"+result[0]);
    	    	}
    	if(n == 1) {
    		result [0] = result [1] = 1;
    		System.out.println("f(0) is:"+result[0]+"\n"+"f(1) is:"+result[1]);
    		}
    	}

}
