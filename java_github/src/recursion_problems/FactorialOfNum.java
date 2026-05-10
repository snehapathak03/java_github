package recursion_problems;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the value for n (till where u have to find the factorial of a number) : ");
		int n= sc.nextInt();
		
		int ans = printFact(n);
		System.out.println("Factorial of "+n+" is : "+ans);

	}
	
	public static int printFact(int n) {
		
		if(n==1 || n==0) {
			return 1;
		}
		
		int fact_nm1 = printFact(n-1);
		int fact_n = n * fact_nm1;
		return fact_n;
	}

}
