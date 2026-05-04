package pattern_Programs;

import java.util.Scanner;

public class Prime_Number {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter a number to fing its prime or not: ");
		int num= s.nextInt();
		boolean isPrime = true;
		for(int i=2; i<=num/2; i++) {
			if(num % i == 0) {
				isPrime = false;
				break;
			}
		}
		if(isPrime) {
			if(num == 1) {
				System.out.println("The given number is neither prime nor composite");
			}else {
				System.out.println("The given number is a prime number.");
			}
		}else {
			System.out.println("The given number is not a Prime number");
		}

	}

}
