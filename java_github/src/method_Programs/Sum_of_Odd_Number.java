package method_Programs;

import java.util.Scanner;

public class Sum_of_Odd_Number {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number till where u want to find odd number: ");
		int n= sc.nextInt();
		
		find_odd_num(n);

	}
	
	public static void find_odd_num(int n) {
		
		for(int i=1; i<=n; i++) {
			if(i%2 !=0) {
				System.out.println(i+" its a odd number");
			}
		}
		
	}

}
