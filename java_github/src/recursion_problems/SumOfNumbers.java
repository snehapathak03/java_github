package recursion_problems;

import java.util.Scanner;

public class SumOfNumbers {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of i from where the count will start : ");
		int i= s.nextInt();
		System.out.println("Enter value of n till where the count will go : ");
		int n= s.nextInt();
		int sum=0;
		
		printSum(i,n,sum);

	}
	
	public static void printSum(int i, int n , int sum) {
		if(i==n) {
			sum= sum+i;
			System.out.println("Sum is : "+sum);
			return;
		}
		sum = sum+i;
		printSum(i+1, n , sum);
		
	}

}
