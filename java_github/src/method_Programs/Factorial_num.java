package method_Programs;

import java.util.Scanner;

public class Factorial_num {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to find factorial: ");
		int fact= s.nextInt();
		print_Fact(fact);
		
	}
	
	public static void print_Fact(int fact) {
		
		if(fact<0) {
			System.out.println("Invalid input");
			return;
		}
		
		int factorial= 1;
		for(int i=fact; i>=1; i--) {
			factorial= factorial * i;
		}
		System.out.println("Factorial of a num is: "+factorial);
		return;
	}

}
