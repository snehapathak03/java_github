package advance_Pattarn_Programs;

import java.util.Scanner;

public class Palindromic_Pattern {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n : ");
		int n= s.nextInt();
		for(int i=1; i<=n; i++)
		{
			//space
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			
			// 1st half
			for(int j=i; j>=1; j--)
			{
				System.out.print(j);
			}
			//2nd half
			for(int j=2; j<=i; j++) {
				System.out.print(j);
			}
			System.out.println(" ");
		}

	}

}
