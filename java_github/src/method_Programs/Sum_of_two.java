package method_Programs;

import java.util.Scanner;

public class Sum_of_two {

	public static void main(String[] args) {
		
		Scanner sr= new Scanner(System.in);
		System.out.println("Enter avalue od a: ");
		int a= sr.nextInt();
		System.out.println("Enter value of b: ");
		int b= sr.nextInt();
		
		int sum = sum(a,b);
		System.out.println("Sum is : "+sum);

	}
	
	public static int sum(int a, int b) {
		int sum = a+b;
		return sum;
	}

}
