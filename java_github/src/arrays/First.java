package arrays;

import java.util.Scanner;

public class First {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.println("Enter size of an array: ");
		int size= s.nextInt();
		
		int numbers[] = new int[size];

		for(int i=0; i<size; i++) {
			numbers[i]= s.nextInt();
		}
		
		for(int i=0; i<size; i++) {
			System.out.print(numbers[i]+", ");
		}
	}

}
