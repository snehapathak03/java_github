package method_Programs;

import java.util.Scanner;

public class FindGreaterNum {

	public static void main(String[] args) {
	
		Scanner s= new Scanner(System.in);
		System.out.println("enter 2 numbers to find the the greatest one : ");
		int a= s.nextInt();
		int b= s.nextInt();
		greater(a, b);

	}
	
	public static void greater(int a, int b) {
		
		if(a>b) {
			System.out.println(a+" is the greatest and "+b+" is the smallest.");
		}else {
			System.out.println(b+" is the greatest and "+a+" is the smallest.");
		}
	}

}
