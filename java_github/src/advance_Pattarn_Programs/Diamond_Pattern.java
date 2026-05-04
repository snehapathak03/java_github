package advance_Pattarn_Programs;

import java.util.Scanner;

public class Diamond_Pattern {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n= s.nextInt();
		//upper half
		for(int i=1; i<=n; i++) {
			//space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//stars
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}
		//lower half
		for(int i=n; i>=1; i--) {
			//space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			//stars
			for(int j=1; j<=2*i-1; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
