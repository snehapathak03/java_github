package pattern_Programs;

import java.util.Scanner;

public class Floyds_Triangle {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n=s.nextInt();
		int number =1;
		for(int i=1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(number+" ");
				number++; // number= number+1
			}
			System.out.println(" ");
		}
		
		
		

	}

}
