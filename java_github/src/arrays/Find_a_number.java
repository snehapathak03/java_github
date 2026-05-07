package arrays;

import java.util.Scanner;

public class Find_a_number {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter size of an array : ");
		int size = s.nextInt();
		
		int num[] = new int[size];

		for(int i=0; i<size; i++) {
			num[i]= s.nextInt();
		}
		
		System.out.println("Enter value of x u want to find: ");
		int x= s.nextInt();
		
		for (int i=1; i<num.length; i++) {
			if(num[i] == x) {
				System.out.println("x found at index "+i);
			}
			
		}

	}

}
