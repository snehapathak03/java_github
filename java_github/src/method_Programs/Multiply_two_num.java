package method_Programs;

import java.util.Scanner;

public class Multiply_two_num {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("enter the value a: ");
		int a= s.nextInt();
		System.out.println("Enter value for b: ");
		int b= s.nextInt();
		System.out.println("Product of two number is : "+ product(a,b));

	}
	
	public static int product(int a, int b) {
		return a*b;
	}

}
