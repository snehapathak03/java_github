package advance_Pattarn_Programs;

import java.util.Scanner;

public class Butterfly_Pattern {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value: ");
		int value= s.nextInt();
		//upper half
		for(int i=1; i<=value; i++) {
			//1st part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			// space 
			int space= 2*(value-i);
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			//2nd part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		
		//lower half
		for(int i=value; i>=1; i--) {
			//1st part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			// space 
			int space= 2*(value-i);
			for(int j=1; j<=space; j++) {
				System.out.print(" ");
			}
			//2nd part
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
