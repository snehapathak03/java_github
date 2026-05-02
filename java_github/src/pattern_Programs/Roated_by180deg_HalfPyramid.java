package pattern_Programs;
import java.util.Scanner;
public class Roated_by180deg_HalfPyramid {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter the value of n: ");
		int n=s.nextInt();
		//outer loop
		for(int i=1; i<=n; i++)
		{
			//inner loop for printing space
			for(int j=1; j<=n-i; j++)
			{
				System.out.print(" ");
			}
			
			for(int j=1; j<=i; j++)
			{
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

	}

}
