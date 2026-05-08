package arrays;

import java.util.Scanner;

public class Searching_a_num {

	public static void main(String[] args) {
		
		Scanner s= new Scanner(System.in);
		System.out.print("Enter rows size : ");
		int row= s.nextInt();
		System.out.print("Enter columns size : ");
		int col= s.nextInt();
		
		int num[][]= new int[row][col];
		
		// input
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				num[i][j]= s.nextInt();
			}
		}
		
		System.out.print("Tell the number u want to search: ");
		int x= s.nextInt();
		for(int i=0; i<row; i++) {
			for(int j=0; j<col; j++) {
				if(num[i][j]== x) {
					System.out.println("Match is found at index: "+i+","+j);
				}
			}
		}

	}

}
