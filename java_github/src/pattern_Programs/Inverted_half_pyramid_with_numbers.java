package pattern_Programs;
import java.util.Scanner;
public class Inverted_half_pyramid_with_numbers {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter value of n: ");
		int n= s.nextInt();
		for(int i=n; i>=1; i--)
		{
			for(int j=1; j<=i; j++)	
			{
				System.out.print(j+" ");
			}
			System.out.println(" ");
		}
		// Another logic 
//		for(int i=1; i<=n;i++)
//		{
//			for(int j=1; j<=n-i+1; j++)
//			{
//				System.out.println(j);
//			}
//			System.out.println(" ");		
//		}

	}

}
