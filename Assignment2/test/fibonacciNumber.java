package Homework;

import java.util.Scanner;

public class fibonacciNumber {

	public static void main(String[] args) {
		Assignment2 w = new Assignment2();
		System.out.println("Please type in one integer:");
		Scanner fiboNum = new Scanner(System.in);
		int n = fiboNum.nextInt();
		int[] result = w.fibonacciNumber(n+1);
		if(n>=2){
    	for(int i=0; i<=n;i++)
		System.out.println("num "+i+" is£º"+result[i]);
    	}
    	if(n == 0) {
    		result[0] = 1;
    		System.out.println("num 0 is£º"+result[0]);
    	    	}
    	if(n == 1) {
    		result [0] = result [1] = 1;
    		System.out.println("num 0 is:"+result[0]+"\n"+"num 1 is:"+result[1]);
    		}
    	}

}
