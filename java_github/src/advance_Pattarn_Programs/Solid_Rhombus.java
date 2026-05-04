package advance_Pattarn_Programs;

import java.util.Scanner;

public class Solid_Rhombus {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n= s.nextInt();
		for(int i=1; i<=n; i++) {
			//space
			for(int j=1; j<=n-i; j++) {
				System.out.print(" ");
			}
			// stars
			for(int j=1; j<=5; j++) {
				System.out.print("*");
			}
			System.out.println(" ");
		}

	}

}
